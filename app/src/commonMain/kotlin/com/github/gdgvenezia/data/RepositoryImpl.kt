package com.github.gdgvenezia.data

import com.github.gdgvenezia.domain.Repository
import com.github.gdgvenezia.domain.entities.EventDate
import com.github.gdgvenezia.domain.entities.EventModel
import com.github.gdgvenezia.domain.entities.PhotoModel
import com.github.gdgvenezia.domain.entities.TeamMemberModel

/**
 * @author Andrea Maglie
 */
class RepositoryImpl: Repository {

    private val event1 = EventModel(title = "Evento 1", date = EventDate(2019, 1, 30, hour = 18, minute = 30, epochInSeconds = 1548869400))
    private val event3 = EventModel(title = "Evento 3", date = EventDate(2019, 9, 10, hour = 19, epochInSeconds = 1568134800))
    private val event2 = EventModel(title = "Evento 2", date = EventDate(2019, 6, 5, hour = 21, epochInSeconds = 1559761200))

    override fun getEventList(): List<EventModel> {
        return listOf(
                event3,
                event2,
                event1
        )
    }

    override fun getPastEventList(): List<EventModel> {
        return listOf(
                event2,
                event1
        )
    }

    override fun getFutureEventList(): List<EventModel> {
        return listOf(event3)
    }

    override fun getPhotoList(): List<PhotoModel> {
        return emptyList()
    }

    override fun getTeamMemeberList(): List<TeamMemberModel> {
        return listOf(
                TeamMemberModel(
                    firstname = "Andrea",
                    lastname = "Maglie",
                    pictureUrl = "",
                    shortDescription = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem",
                    longDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. ",
                    twitterUrl = "",
                    linkedinUrl = ""),
                TeamMemberModel(
                        firstname = "Marco",
                        lastname = "Gomiero",
                        pictureUrl = "",
                        shortDescription = "Lorem ipsum",
                        longDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. ",
                        twitterUrl = "",
                        linkedinUrl = ""),
                TeamMemberModel(
                        firstname = "Simone",
                        lastname = "Formica",
                        pictureUrl = "",
                        shortDescription = "Consectetur adipiscing elit",
                        longDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. ",
                        twitterUrl = "",
                        linkedinUrl = ""),
                TeamMemberModel(
                        firstname = "Omar",
                        lastname = "Al Bukhari",
                        pictureUrl = "",
                        shortDescription = "Excepteur sint occaecat cupidatat non proident",
                        longDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. ",
                        twitterUrl = "",
                        linkedinUrl = "")
                )
    }
}