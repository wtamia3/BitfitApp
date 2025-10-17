package com.example.bitfitapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EntryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val dateTextView: TextView = itemView.findViewById(R.id.dateTextView)
    private val metricTextView: TextView = itemView.findViewById(R.id.metricTextView)
    private val valueTextView: TextView = itemView.findViewById(R.id.valueTextView)

    fun bind(entry: Entry) {
        dateTextView.text = entry.date
        metricTextView.text = entry.metric
        valueTextView.text = entry.value
    }
}