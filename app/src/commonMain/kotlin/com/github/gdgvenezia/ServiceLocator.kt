package com.github.gdgvenezia.com.github.gdgvenezia

import com.github.gdgvenezia.com.github.gdgvenezia.presentation.events.EventListPresenter
import com.github.gdgvenezia.data.RepositoryImpl
import com.github.gdgvenezia.domain.usecases.GetEventListUseCase
import kotlin.native.concurrent.ThreadLocal

/**
 * @author Andrea Maglie
 */
@ThreadLocal
object ServiceLocator {

    val repository = RepositoryImpl()

    /*
    val getEventListUseCase: GetEventListUseCase
        get() = GetEventListUseCase(repository)
    */

    val eventListPresenter: EventListPresenter
        get() = EventListPresenter(GetEventListUseCase(repository))
}