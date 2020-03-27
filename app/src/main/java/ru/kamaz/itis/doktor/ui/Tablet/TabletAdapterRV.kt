package ru.kamaz.itis.doktor.ui.Tablet

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.tablet_item_rv.view.*
import ru.kamaz.itis.doktor.R


class TabletAdapterRV(var items: ArrayList<String>, val context: Context):
    RecyclerView.Adapter<TabletAdapterRV.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TabletAdapterRV.ViewHolder {
        return TabletAdapterRV.ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.tablet_item_rv,
                parent,
                false
            )
        )
    }
    override fun getItemCount(): Int {
       return items.size
    }
    override fun onBindViewHolder(holder: TabletAdapterRV.ViewHolder, position: Int) {
        holder?.tvTablet?.text=items.get(position)
    }
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val tvTablet=view.txt_tablet
    }
}