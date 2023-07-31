package com.ipons.ejemploselectores.selectors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import com.ipons.ejemploselectores.databinding.ActivityNotSelectorBinding

class NotSelector : FragmentActivity() {

    private lateinit var binding:ActivityNotSelectorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotSelectorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()
    }

    private fun initListeners() {
        binding.notSelector.setOnClickListener {
            showToast(binding.notSelector.text.toString())
        }
        binding.basicSelector.setOnClickListener {
            showToast(binding.basicSelector.text.toString())
        }
        binding.multipleSelector.setOnClickListener {
            showToast(binding.multipleSelector.text.toString())
        }
        binding.colorSelector.setOnClickListener {
            showToast(binding.colorSelector.text.toString())
        }
        binding.animatedSelector.setOnClickListener {
            showToast(binding.animatedSelector.text.toString())
        }
        binding.vectorSelector.setOnClickListener {
            showToast(binding.vectorSelector.text.toString())
        }
        binding.childrenSelector.setOnClickListener {
            showToast(binding.childrenSelector.text.toString())
        }
    }

    private fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }
}