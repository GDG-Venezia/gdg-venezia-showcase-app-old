package org.konan.multiplatform

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.gdgvenezia.ServiceLocator
import com.github.gdgvenezia.domain.entities.EventListModel
import com.github.gdgvenezia.presentation.events.EventListView

class EventsFragment: Fragment(), EventListView {

    private val presenter by lazy { ServiceLocator.eventListPresenter }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_events, container, false) as ViewGroup
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun renderEventList(eventList: EventListModel) {
//        text.text = eventList.futureEvents.plus(eventList.pastEvents).format()
    }

    override fun renderError(errorMessage: String) {
//        text.text = errorMessage
    }

    override fun renderLoading(visible: Boolean) {
//        progress.visibility = if (visible) View.VISIBLE else View.GONE
    }

    override fun onStart() {
        super.onStart()
        presenter.attachView(this)
    }

    override fun onStop() {
        super.onStop()
        presenter.detachView()
    }
}