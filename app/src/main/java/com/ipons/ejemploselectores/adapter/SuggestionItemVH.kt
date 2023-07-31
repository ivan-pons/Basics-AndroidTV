package com.ipons.ejemploselectores.adapter

import androidx.recyclerview.widget.RecyclerView
import com.ipons.ejemploselectores.databinding.ItemSuggestionBinding

class SuggestionItemVH(
    private val binding: ItemSuggestionBinding,
    private val clickEvent: (text: String) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(text: String) {
        binding.title.text = text
        binding.root.setOnClickListener {
            clickEvent(text)
        }
    }
}