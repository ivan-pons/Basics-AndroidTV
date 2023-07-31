package com.ipons.ejemploselectores.selectors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.ipons.ejemploselectores.adapter.AnimatedAdapter
import com.ipons.ejemploselectores.databinding.ActivityAnimatedSelectorBinding

class AnimatedSelector : FragmentActivity() {

    private lateinit var binding:ActivityAnimatedSelectorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimatedSelectorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setAdpter()
    }

    private fun setAdpter() {
        binding.rv.adapter = AnimatedAdapter()
    }
}