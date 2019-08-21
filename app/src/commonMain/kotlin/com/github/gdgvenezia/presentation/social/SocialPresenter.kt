package com.github.gdgvenezia.presentation.social

import com.github.gdgvenezia.com.github.gdgvenezia.domain.entities.SocialLinkModel
import com.github.gdgvenezia.presentation.BasePresenter
import com.github.gdgvenezia.presentation.BaseView
import com.github.gdgvenezia.domain.Result
import com.github.gdgvenezia.domain.entities.PhotoModel
import com.github.gdgvenezia.domain.entities.TeamMemberModel
import com.github.gdgvenezia.domain.usecases.GetPhotoUseCase
import com.github.gdgvenezia.domain.usecases.GetSocialLinkListUseCase
import com.github.gdgvenezia.domain.usecases.GetTeamUseCase

/**
 * @author Andrea Maglie
 */
class SocialPresenter constructor(private val getSocialLinkListUseCase: GetSocialLinkListUseCase): BasePresenter<SocialView>() {

    override fun onViewAttached(view: SocialView) {
        view.renderLoading(true)
        getTeam()
    }

    private fun getTeam() {

        val result = getSocialLinkListUseCase.execute(Unit)
        view?.renderLoading(false)
        when (result) {
            is Result.Success -> view?.renderSocialLinkList(result.data)
            is Error -> view?.renderError("Failure")
        }
    }
}


interface SocialView: BaseView {

    fun renderSocialLinkList(photoList: List<SocialLinkModel>)

}