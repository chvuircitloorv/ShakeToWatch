package com.example.shaketowatch.top

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class TopListAdapter(diffUtil: DiffUtil.ItemCallback<String>) : ListAdapter<String, ViewHolder>(diffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val element = getItem(position)
        (holder.itemView as TextView).text = element
    }
}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view)