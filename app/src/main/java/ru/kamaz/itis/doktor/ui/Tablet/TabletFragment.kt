package ru.kamaz.itis.doktor.ui.Tablet

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_tablet.*
import ru.kamaz.itis.doktor.R

class TabletFragment : Fragment() {
    val tablet:ArrayList<String> = ArrayList()
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
        val root = inflater.inflate(R.layout.fragment_tablet, container, false)
        return root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addtablet()
        mContext?.let{
            rv_tablet.layoutManager=LinearLayoutManager(context)
            rv_tablet.adapter=TabletAdapterRV(tablet, it)
        }
    }
    fun addtablet(){
        tablet.add("paracetamol")
        tablet.add("paracetamol")
        tablet.add("paracetamol")
        tablet.add("paracetamol")
        tablet.add("paracetamol")
        tablet.add("paracetamol")
        tablet.add("paracetamol")
        tablet.add("paracetamol")
        tablet.add("paracetamol")
    }
}