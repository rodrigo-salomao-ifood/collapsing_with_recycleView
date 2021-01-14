package com.example.dummy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment

class ExpandedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_expanded, container, false)
        val tittle = view.findViewById<View>(R.id.expanded_title)
        val expandableContainer = view.findViewById<LinearLayout>(R.id.expanded_container)
        tittle.setOnClickListener {
            expandableContainer.apply {
                visibility = if (expandableContainer.isVisible) View.GONE else View.VISIBLE
            }
        }
        return view
    }

    private fun showToast() {
        Toast.makeText(requireContext(), " Click ", Toast.LENGTH_LONG).show()
    }
}
