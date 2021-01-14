package com.example.dummy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val names: List<String>) :
    RecyclerView.Adapter<CustomAdapter.NameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        // Inflating R.layout.name_item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.text_row_item, parent, false)
        return NameViewHolder(view)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        // Getting element from names list at this position
        val element = names[position]
        // Updating the text of the txtName with this element
        holder.txtName.text = element
    }

    override fun getItemCount(): Int {
        return names.size
    }

    class NameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtName = itemView.findViewById(R.id.item_list_title) as TextView
    }
}