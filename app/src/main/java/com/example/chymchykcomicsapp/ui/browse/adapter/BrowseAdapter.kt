package com.example.chymchykcomicsapp.ui.browse.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chymchykcomicsapp.R
import kotlinx.android.synthetic.main.item_types.view.*

class BrowseAdapter : RecyclerView.Adapter<BrowseViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrowseViewHolder {
        return BrowseViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_types, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: BrowseViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }
}

class BrowseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(item: String) {
        itemView.type_tv.text = item
    }
}

val items = mutableListOf<String>().apply {
    add("Comedy")
    add("Romance")
    add("Drama")
    add("Thriller")
    add("War movie")
}