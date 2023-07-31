package com.ipons.ejemploselectores.selectors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.ipons.ejemploselectores.adapter.ChildrenAdapter
import com.ipons.ejemploselectores.databinding.ActivityChildrenSelectorBinding

class ChildrenSelector : FragmentActivity() {
    private lateinit var binding: ActivityChildrenSelectorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChildrenSelectorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setAdpter()
    }

    private fun setAdpter() {
        binding.rv.adapter = ChildrenAdapter()
    }
}