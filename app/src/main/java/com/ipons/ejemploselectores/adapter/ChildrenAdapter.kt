package com.ipons.ejemploselectores.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ipons.ejemploselectores.R

class ChildrenAdapter() : RecyclerView.Adapter<ChildrenItemVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildrenItemVH =
        ChildrenItemVH(parent.dataBindingInflate(R.layout.item_children))

    override fun getItemCount(): Int = 8

    override fun onBindViewHolder(holder: ChildrenItemVH, position: Int) {
        if (position != RecyclerView.NO_POSITION) {
            holder.bind(position)
        }
    }
}