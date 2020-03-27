package ru.kamaz.itis.doktor.ui.settings

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_settings.*
import ru.kamaz.itis.doktor.R


class SettingsFragment:Fragment() {
    val settings:ArrayList<String> = ArrayList()
    var mContext: Context? = null


    override fun onAttach(context: Context?) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_settings, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addsettings()

        mContext?.let {
            val recyclerView: RecyclerView = rv_doktor
            recyclerView.layoutManager=LinearLayoutManager(context)
            //recyclerView.layoutManager=GridLayoutManager(context,1)
            recyclerView.adapter=SettingAdapterRV(settings, it)
        }
    }

    fun addsettings(){
        settings.add("ghj")
        settings.add("ttt")
        settings.add("rw")
        settings.add("weee")
        settings.add("ee")
        settings.add("ghj")
        settings.add("ghj")
        settings.add("ghj")
    }
}




