package ru.kamaz.itis.doktor.ui.state

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.tbuonomo.creativeviewpager.adapter.CreativePagerAdapter
import ru.kamaz.itis.doktor.R

class NaturalCreativePagerAdapter(val context: Context): CreativePagerAdapter {
    override fun getCount(): Int {
        return NatureItem.values().size
    }

    override fun instantiateContentItem(
        inflater: LayoutInflater,
        container: ViewGroup,
        position: Int
    ): View {
        val healthStattt= inflater.inflate(R.layout.item_health_status_grathics,container,false)
        val imageeee: ImageView = healthStattt.findViewById(R.id.img_test)
        val textttt: TextView = healthStattt.findViewById(R.id.txt_test)
        textttt.text= context.getString(R.string.item_graph_title)
        imageeee.setImageDrawable(ContextCompat.getDrawable(context,NatureItem.values()[position].icon))
        return healthStattt
    }

    override fun instantiateHeaderItem(
        inflater: LayoutInflater,
        container: ViewGroup,
        position: Int
    ): View {
        val healthStatus= inflater.inflate(R.layout.item_health_status_grathics,container, false)
        val image: ImageView = healthStatus.findViewById(R.id.img_test)
        val text: TextView = healthStatus.findViewById(R.id.txt_test)
        text.text= context.getString(R.string.item_graph_title)
        image.setImageDrawable(ContextCompat.getDrawable(context,NatureItem.values()[position].graphDraw))
        return healthStatus
    }
}