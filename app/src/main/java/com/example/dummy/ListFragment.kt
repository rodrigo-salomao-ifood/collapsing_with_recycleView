package com.example.dummy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        val mRecycleView = view.findViewById<RecyclerView>(R.id.item_list_rv)
        mRecycleView.adapter = CustomAdapter(getList())
        mRecycleView.setHasFixedSize(true)
        mRecycleView.layoutManager = LinearLayoutManager(requireContext())
        return view
    }

    private fun getList(): MutableList<String> {
        val list = mutableListOf<String>()
        (1..10).forEach {
            list.add("Item $it")
        }
        return list
    }
}


