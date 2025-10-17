package com.example.bitfitapp
// EntryAdapter.kt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EntryAdapter(
    private val context: Context,
    private val entries: List<Entry>
) : RecyclerView.Adapter<EntryAdapter.EntryViewHolder>() {

    // ViewHolder class to hold the views
    class EntryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foodNameTextView: TextView = itemView.findViewById(R.id.foodName)
        val caloriesTextView: TextView = itemView.findViewById(R.id.calories)
    }

    // Inflate the layout and return the ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EntryViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_entry, parent, false)
        return EntryViewHolder(view)
    }

    // Bind data to the views in each item
    override fun onBindViewHolder(holder: EntryViewHolder, position: Int) {
        val entry = entries[position]
        holder.foodNameTextView.text = entry.foodName
        holder.caloriesTextView.text = entry.calories.toString()
    }

    // Return the number of items in the list
    override fun getItemCount(): Int {
        return entries.size
    }
}
