package com.ipons.ejemploselectores.focus

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.ipons.ejemploselectores.databinding.ActivityFocusMenuBinding

class FocusMenu : FragmentActivity() {

    private lateinit var binding: ActivityFocusMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFocusMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()
    }

    private fun initListeners() {
        binding.notGestion.setOnClickListener {
            startActivity(Intent(this, NoFocus::class.java))
        }
        binding.basicGestion.setOnClickListener {
            startActivity(Intent(this, BasicFocus::class.java))
        }
        binding.managerFocus.setOnClickListener {
            startActivity(Intent(this, FocusManger::class.java))
        }
        binding.carouselsFocus.setOnClickListener {
//            startActivity(Intent(this, ColorSelector::class.java))
        }
        binding.tabsFocus.setOnClickListener {
//            startActivity(Intent(this, AnimatedSelector::class.java))
        }

    }
}