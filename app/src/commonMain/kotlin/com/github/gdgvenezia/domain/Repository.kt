package com.github.gdgvenezia.domain

import com.github.gdgvenezia.domain.entities.EventModel

/**
 * @author Andrea Maglie
 */
interface Repository {
    fun getEventList(): List<EventModel>
}