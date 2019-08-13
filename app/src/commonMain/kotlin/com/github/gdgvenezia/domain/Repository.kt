package com.github.gdgvenezia.domain

import com.github.gdgvenezia.domain.entities.PhotoModel
import com.github.gdgvenezia.domain.entities.EventModel
import com.github.gdgvenezia.domain.entities.TeamMemberModel

/**
 * @author Andrea Maglie
 */
interface Repository {
    fun getEventList(): List<EventModel>
    fun getPastEventList(): List<EventModel>
    fun getFutureEventList(): List<EventModel>
    fun getTeamMemeberList(): List<TeamMemberModel>
    fun getPhotoList(): List<PhotoModel>
}