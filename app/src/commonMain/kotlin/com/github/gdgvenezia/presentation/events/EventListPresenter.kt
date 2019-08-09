package com.github.gdgvenezia.com.github.gdgvenezia.presentation.events

import com.github.gdgvenezia.com.github.gdgvenezia.presentation.BasePresenter
import com.github.gdgvenezia.domain.Result
import com.github.gdgvenezia.domain.entities.EventModel
import com.github.gdgvenezia.domain.usecases.GetEventListUseCase

/**
 * @author Andrea Maglie
 */
class EventListPresenter constructor(private val getEventListUseCase: GetEventListUseCase): BasePresenter<EventListView>() {

    override fun onViewAttached(view: EventListView) {
        view.renderLoading(true)
        getEventList()
    }

    private fun getEventList() {

        val result = getEventListUseCase.execute(Unit)
        view?.renderLoading(false)
        when (result) {
            is Result.Success -> view?.renderEventList(result.data)
            is Error -> view?.renderError("Failure")
        }
    }
}


interface EventListView {

    fun renderEventList(eventList: List<EventModel>)

    fun renderError(errorMessage: String)

    fun renderLoading(visible: Boolean)
}