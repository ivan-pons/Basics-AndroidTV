package com.ipons.ejemploselectores.focus

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.ipons.ejemploselectores.R
import com.ipons.ejemploselectores.focus.keyboard.KeyboardConstants.KEY_DELETE_POSITION

class SearchConstraintLayout  @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : ConstraintLayout(context, attrs) {

    lateinit var openMenu: () -> Unit

    fun setOpenMenuListener(focusClicked: () -> Unit) {
        this.openMenu = focusClicked
    }

    override fun focusSearch(focused: View, direction: Int): View {
        val newFocus = super.focusSearch(focused, direction) ?: focused

        if (direction == View.FOCUS_UP) {
            if (focused.id == R.id.container_item || focused.id == R.id.key) {
                return focused
            }
        }

        if (direction == View.FOCUS_DOWN) {
            if (focused.id == R.id.key) {
                val suggestionsRecyclerView: RecyclerView = findViewById(R.id.rv_suggestion)
                return if ((suggestionsRecyclerView.adapter?.itemCount ?: 0) != 0) {
                    suggestionsRecyclerView.getChildAt(0)
                } else {
                    focused
                }
            }

            if (focused.id == R.id.container_item) {
                return focused
            }
        }

        if (direction == View.FOCUS_LEFT) {
            if (focused.id == R.id.container_item) {
                val keyboardRecyclerView: RecyclerView = findViewById(R.id.rv_keyboard)
                return keyboardRecyclerView.getChildAt(KEY_DELETE_POSITION)
            }

            if (focused.id == R.id.key || focused.id == R.id.suggestion) {
                if (this::openMenu.isInitialized) openMenu()
                return focused
            }
        }

        if (direction == View.FOCUS_RIGHT) {
            if (focused.id == R.id.container_item) {
                return focused
            }
            if (newFocus.id == R.id.container_item) {
                val keyboardRecyclerView: RecyclerView = findViewById(R.id.rv_search)
                return keyboardRecyclerView.getChildAt(0)
            }
        }

        return newFocus
    }
}