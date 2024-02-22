package com.example.horizontalscrollview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter(private val appList: List<model>) : RecyclerView.Adapter<CustomAdapter.modelViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): modelViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return modelViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: modelViewHolder, position: Int) {
        val model = appList[position]
        holder.textView.text = model.appname
        holder.imageView.setImageResource(model.appimage)
    }

    override fun getItemCount(): Int {
        return appList.size
    }

    class modelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.apptextview)
        val imageView: ImageView = itemView.findViewById(R.id.appimage)
    }
}