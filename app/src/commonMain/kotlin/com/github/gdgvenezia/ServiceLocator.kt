package com.github.gdgvenezia

import com.github.gdgvenezia.presentation.events.TeamPresenter
import com.github.gdgvenezia.data.RepositoryImpl
import com.github.gdgvenezia.domain.usecases.GetEventListUseCase
import com.github.gdgvenezia.domain.usecases.GetPhotoUseCase
import com.github.gdgvenezia.domain.usecases.GetTeamUseCase
import com.github.gdgvenezia.presentation.events.EventListPresenter
import com.github.gdgvenezia.presentation.photos.PhotoPresenter
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

    val teamPresenter: TeamPresenter
        get() = TeamPresenter(GetTeamUseCase(repository))

    val photoPresenter: PhotoPresenter
        get() = PhotoPresenter(GetPhotoUseCase(repository))

}