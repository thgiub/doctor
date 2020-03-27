package ru.kamaz.itis.doktor.ui.settings

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.AdapterListUpdateCallback
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.settings_item_rv.view.*
import ru.kamaz.itis.doktor.R
import javax.security.auth.callback.Callback

class SettingAdapterRV(val items:ArrayList<String>,val context: Context):
    RecyclerView.Adapter<SettingAdapterRV.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.settings_item_rv, parent, false))     }

    override fun getItemCount(): Int {
     return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder?.tvsettings?.text=items.get(position)
        //holder?.pictsettings?.imageAlpha=items.get(position)
}
    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each animal to
        val tvsettings = view.txt_settings
       // val pictsettings=view.img_settings
    }
}