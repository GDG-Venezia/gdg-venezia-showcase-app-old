package com.github.gdgvenezia.data

import com.github.gdgvenezia.domain.Repository
import com.github.gdgvenezia.domain.entities.EventModel

/**
 * @author Andrea Maglie
 */
class RepositoryImpl: Repository {
    override fun getEventList(): List<EventModel> {
        return listOf(
                EventModel(title = "Evento 3", date = "10 Settembre 2019"),
                EventModel(title = "Evento 2", date = "5 Giugno 2019"),
                EventModel(title = "Evento 1", date = "30 Gennaio 2019")
        )
    }
}