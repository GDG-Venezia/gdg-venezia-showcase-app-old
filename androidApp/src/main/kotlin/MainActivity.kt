package org.konan.multiplatform

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.github.gdgvenezia.ServiceLocator
import com.github.gdgvenezia.domain.entities.EventListModel
import com.github.gdgvenezia.format
import com.github.gdgvenezia.presentation.events.EventListView
import com.github.gdgvenezia.domain.entities.EventModel

class MainActivity : AppCompatActivity(), EventListView {

    private lateinit var text: TextView
    private lateinit var progress: ProgressBar

    private val presenter by lazy { ServiceLocator.eventListPresenter }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById(R.id.text)
        progress = findViewById(R.id.progress)
    }

    override fun onStart() {
        super.onStart()
        presenter.attachView(this)
    }

    override fun onStop() {
        super.onStop()
        presenter.detachView()
    }

    override fun renderEventList(eventList: EventListModel) {
        text.text = eventList.futureEvents.plus(eventList.pastEvents).format()
    }

    override fun renderError(errorMessage: String) {
        text.text = errorMessage
    }

    override fun renderLoading(visible: Boolean) {
        progress.visibility = if (visible) View.VISIBLE else View.GONE
    }
}