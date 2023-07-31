package com.ipons.ejemploselectores.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ipons.ejemploselectores.R

class AnimatedAdapter() : RecyclerView.Adapter<AnimatedItemVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimatedItemVH =
        AnimatedItemVH(parent.dataBindingInflate(R.layout.item_animated))

    override fun getItemCount(): Int = 8

    override fun onBindViewHolder(holder: AnimatedItemVH, position: Int) {
        if (position != RecyclerView.NO_POSITION) {
            holder.bind(position)
        }
    }
}