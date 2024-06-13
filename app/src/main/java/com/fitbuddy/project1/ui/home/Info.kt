package com.fitbuddy.project1.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.fitbuddy.project1.R

class Info : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_info, container, false)
        view.findViewById<View>(R.id.btnSubmit).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_info2_to_navigation_home)
        }
        return view
    }
}