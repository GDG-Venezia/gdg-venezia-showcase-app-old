package com.github.gdgvenezia.domain.entities

/**
 * @author Andrea Maglie
 */
data class EventModel(
        val title: String,
        val date: String // TODO: use https://github.com/korlibs/klock for dates
)