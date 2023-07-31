package com.ipons.ejemploselectores.selectors

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.ipons.ejemploselectores.databinding.ActivityMultipleSelectorBinding

class MultipleSelector : FragmentActivity() {

    private lateinit var binding: ActivityMultipleSelectorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMultipleSelectorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()
    }

    private fun initListeners() {
        binding.run {
            view.setOnClickListener {
                it.isSelected = !it.isSelected
            }
            view2.setOnClickListener {
                it.isSelected = !it.isSelected
            }
            view3.setOnClickListener {
                it.isSelected = !it.isSelected
            }
            view4.setOnClickListener {
                it.isSelected = !it.isSelected
            }
        }
    }


}