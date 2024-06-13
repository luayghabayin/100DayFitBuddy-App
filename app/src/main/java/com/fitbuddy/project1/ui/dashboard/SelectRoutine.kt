package com.fitbuddy.project1.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.fitbuddy.project1.R

class SelectRoutine : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_select_routine, container, false)
        view.findViewById<View>(R.id.btnChestAdv).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_selectRoutine_to_chest)
        }
        view.findViewById<View>(R.id.btnBackAdv).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_selectRoutine_to_back)
        }
        view.findViewById<View>(R.id.btnArmsAdv).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_selectRoutine_to_arms)
        }
        view.findViewById<View>(R.id.btnShouldersAdv).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_selectRoutine_to_shoulders)
        }
        view.findViewById<View>(R.id.btnLegsAdv).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_selectRoutine_to_legs)
        }
        return view
    }
}