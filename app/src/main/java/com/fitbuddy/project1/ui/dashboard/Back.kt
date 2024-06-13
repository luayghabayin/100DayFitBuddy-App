package com.fitbuddy.project1.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.fitbuddy.project1.R

class Back : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_back, container, false)
        view.findViewById<View>(R.id.backfinish).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_back_to_endPage)
        }
        return view
    }
}