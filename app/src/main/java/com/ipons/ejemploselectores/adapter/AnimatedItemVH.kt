package com.ipons.ejemploselectores.adapter

import androidx.recyclerview.widget.RecyclerView
import com.ipons.ejemploselectores.R
import com.ipons.ejemploselectores.databinding.ItemAnimatedBinding

class AnimatedItemVH(
    private val binding: ItemAnimatedBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(position: Int){
        when(position){
            0,4 -> binding.image.background = binding.root.context.resources.getDrawable(R.color.blueColor)
            1,5 -> binding.image.background = binding.root.context.resources.getDrawable(R.color.greenColor)
            2,6 -> binding.image.background = binding.root.context.resources.getDrawable(R.color.redColor)
            3,7 -> binding.image.background = binding.root.context.resources.getDrawable(R.color.violetColor)
        }
    }
}