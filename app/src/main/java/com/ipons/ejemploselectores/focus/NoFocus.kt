package com.ipons.ejemploselectores.focus

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.ipons.ejemploselectores.R

class NoFocus : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no_focus)
    }
}