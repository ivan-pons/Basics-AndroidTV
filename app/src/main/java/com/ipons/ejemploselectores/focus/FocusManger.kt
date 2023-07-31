package com.ipons.ejemploselectores.focus

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.ipons.ejemploselectores.adapter.AnimatedAdapter
import com.ipons.ejemploselectores.adapter.SuggestionAdapter
import com.ipons.ejemploselectores.databinding.ActivityFocusMangerBinding
import com.ipons.ejemploselectores.focus.keyboard.KeyboardAdapter
import com.ipons.ejemploselectores.focus.keyboard.KeyboardConstants.KEY_DELETE_POSITION
import com.ipons.ejemploselectores.focus.keyboard.KeyboardConstants.KEY_SPACE_POSITION

class FocusManger : FragmentActivity() {

    private lateinit var binding: ActivityFocusMangerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFocusMangerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initKeyboard()
        showSuggestions()
        initAdapter()
    }
    override fun onResume() {
        super.onResume()
        binding.rvKeyboard.requestFocus()
    }

    private fun initKeyboard() = binding.run {

        val keyboardAdapterTV = KeyboardAdapter(
            keySelected = {},
            deleteSelected = {},
            spaceSelected = {}
        )

        val layoutManager = rvKeyboard.layoutManager as GridLayoutManager
        layoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return when (position) {
                    KEY_SPACE_POSITION -> 3
                    KEY_DELETE_POSITION -> 2
                    else -> 1
                }
            }
        }

        rvKeyboard.adapter = keyboardAdapterTV
    }

    private fun showSuggestions() {
        val suggestions = listOf("casa", "casita", "camilla", "castillo")
        binding.rvSuggestion.adapter = SuggestionAdapter(suggestions) {}
    }

    private fun initAdapter() {
        binding.rvSearch.adapter = AnimatedAdapter()
    }
}