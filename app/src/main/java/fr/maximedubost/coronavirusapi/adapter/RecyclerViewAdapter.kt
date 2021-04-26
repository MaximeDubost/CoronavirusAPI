package fr.maximedubost.coronavirusapi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import fr.maximedubost.coronavirusapi.DetailsPopup
import fr.maximedubost.coronavirusapi.MainActivity
import fr.maximedubost.coronavirusapi.R
import fr.maximedubost.coronavirusapi.models.Regions
import fr.maximedubost.coronavirusapi.models.Region

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    lateinit var context: MainActivity
    private var regions = ArrayList<Region>()

    fun setUpdatedData(regions: Regions) {
        this.regions = regions.toArrayList()
        notifyDataSetChanged()
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val imgFlag = view.findViewById<ImageView>(R.id.imageFlag)
        private val tvName = view.findViewById<TextView>(R.id.tvName)
        private val tvActiveCase = view.findViewById<TextView>(R.id.tvActiveCase)
        private val tvTotalCase = view.findViewById<TextView>(R.id.tvTotalCase)
        private val tvDeaths = view.findViewById<TextView>(R.id.tvDeath)
        private val tvRecovered = view.findViewById<TextView>(R.id.tvRecovered)

        fun bind(region: Region) {
            Picasso.get().load("https://www.countryflagicons.com/FLAT/64/"+region.iso3166a2+".png").into(imgFlag)
            tvName.text = region.name
            tvActiveCase.text = region.activeCases.toString()
            tvTotalCase.text = region.totalCases.toString()
            tvDeaths.text = region.deaths.toString()
            tvRecovered.text = region.recovered.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater
            .from(parent.context)
            .inflate(R.layout.recycler_list_row, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(regions.get(position))
    }

    override fun getItemCount(): Int = regions.size
}