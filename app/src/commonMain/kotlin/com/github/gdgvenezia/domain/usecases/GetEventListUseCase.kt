package com.github.gdgvenezia.domain.usecases

import com.github.gdgvenezia.domain.*
import com.github.gdgvenezia.domain.entities.EventModel

/**
 * @author Andrea Maglie
 */
class GetEventListUseCase constructor(private val repository: Repository) {

    fun execute(params: Unit): Result<List<EventModel>> {
        try {
            val eventList = repository.getEventList()
            return Result.Success(eventList)
        } catch (e: Exception) {
            return Result.Error(e)
        }
    }
}
