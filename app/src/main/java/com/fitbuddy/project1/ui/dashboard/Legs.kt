package com.fitbuddy.project1.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.fitbuddy.project1.R

class Legs : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_legs, container, false)
        view.findViewById<View>(R.id.legsfinish).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_legs_to_endPage)
        }
        return view
    }
}