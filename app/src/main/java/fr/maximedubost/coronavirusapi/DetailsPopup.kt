package fr.maximedubost.coronavirusapi

import android.app.Dialog
import android.os.Bundle
import android.view.Window
import fr.maximedubost.coronavirusapi.adapter.RecyclerViewAdapter

class DetailsPopup(
    private val adapter: RecyclerViewAdapter
) : Dialog(adapter.context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.details_popup)
    }

}