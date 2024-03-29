package com.github.gdgvenezia.presentation.events

import com.github.gdgvenezia.presentation.BasePresenter
import com.github.gdgvenezia.presentation.BaseView
import com.github.gdgvenezia.domain.Result
import com.github.gdgvenezia.domain.entities.TeamMemberModel
import com.github.gdgvenezia.domain.usecases.GetTeamUseCase

/**
 * @author Andrea Maglie
 */
class TeamPresenter constructor(private val getTeamUseCase: GetTeamUseCase): BasePresenter<TeamView>() {

    override fun onViewAttached(view: TeamView) {
        view.renderLoading(true)
        getTeam()
    }

    private fun getTeam() {

        val result = getTeamUseCase.execute(Unit)
        view?.renderLoading(false)
        when (result) {
            is Result.Success -> view?.renderTeam(result.data)
            is Error -> view?.renderError("Failure")
        }
    }
}


interface TeamView: BaseView {

    fun renderTeam(team: List<TeamMemberModel>)

}