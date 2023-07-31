package com.ipons.ejemploselectores

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.ipons.ejemploselectores.databinding.ActivityMainBinding
import com.ipons.ejemploselectores.focus.FocusMenu
import com.ipons.ejemploselectores.selectors.AnimatedSelector
import com.ipons.ejemploselectores.selectors.BasicSelector
import com.ipons.ejemploselectores.selectors.ChildrenSelector
import com.ipons.ejemploselectores.selectors.ColorSelector
import com.ipons.ejemploselectores.selectors.MultipleSelector
import com.ipons.ejemploselectores.selectors.NotSelector
import com.ipons.ejemploselectores.selectors.VectorSelector

class MainActivity : FragmentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()
    }

    private fun initListeners() {
        binding.notSelector.setOnClickListener {
            startActivity(Intent(this, NotSelector::class.java))
        }
        binding.basicSelector.setOnClickListener {
            startActivity(Intent(this, BasicSelector::class.java))
        }
        binding.multipleSelector.setOnClickListener {
            startActivity(Intent(this, MultipleSelector::class.java))
        }
        binding.colorSelector.setOnClickListener {
            startActivity(Intent(this, ColorSelector::class.java))
        }
        binding.animatedSelector.setOnClickListener {
            startActivity(Intent(this, AnimatedSelector::class.java))
        }
        binding.vectorSelector.setOnClickListener {
            startActivity(Intent(this, VectorSelector::class.java))
        }
        binding.childrenSelector.setOnClickListener {
            startActivity(Intent(this, ChildrenSelector::class.java))
        }
        binding.focusActivity.setOnClickListener {
            startActivity(Intent(this, FocusMenu::class.java))
        }
    }
}