package com.ipons.ejemploselectores.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ipons.ejemploselectores.R

class SuggestionAdapter(
    private val suggestions: List<String>,
    private val clickEvent: (text: String) -> Unit
) : RecyclerView.Adapter<SuggestionItemVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuggestionItemVH =
        SuggestionItemVH(parent.dataBindingInflate(R.layout.item_suggestion)) {
            clickEvent(it)
        }

    override fun onBindViewHolder(holder: SuggestionItemVH, position: Int) {
        if (position != RecyclerView.NO_POSITION) {
            holder.bind(suggestions[position])
        }
    }

    override fun getItemCount(): Int = suggestions.size
}