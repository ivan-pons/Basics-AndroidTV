package com.ipons.ejemploselectores.selectors

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.ipons.ejemploselectores.R

class BasicSelector : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_selector)
    }
}