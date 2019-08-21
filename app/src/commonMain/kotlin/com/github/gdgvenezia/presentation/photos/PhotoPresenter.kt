package com.github.gdgvenezia.presentation.photos

import com.github.gdgvenezia.presentation.BasePresenter
import com.github.gdgvenezia.presentation.BaseView
import com.github.gdgvenezia.domain.Result
import com.github.gdgvenezia.domain.entities.PhotoModel
import com.github.gdgvenezia.domain.entities.TeamMemberModel
import com.github.gdgvenezia.domain.usecases.GetPhotoUseCase
import com.github.gdgvenezia.domain.usecases.GetTeamUseCase

/**
 * @author Andrea Maglie
 */
class PhotoPresenter constructor(private val getPhotoUseCase: GetPhotoUseCase): BasePresenter<PhotoView>() {

    override fun onViewAttached(view: PhotoView) {
        view.renderLoading(true)
        getTeam()
    }

    private fun getTeam() {

        val result = getPhotoUseCase.execute(Unit)
        view?.renderLoading(false)
        when (result) {
            is Result.Success -> view?.renderPhotoList(result.data)
            is Error -> view?.renderError("Failure")
        }
    }
}


interface PhotoView: BaseView {

    fun renderPhotoList(photoList: List<PhotoModel>)

}