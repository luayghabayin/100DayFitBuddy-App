package com.fitbuddy.project1.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.fitbuddy.project1.R

class SelectRoutineAdvanced : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_select_routine_advanced, container, false)
        view.findViewById<View>(R.id.btnChestAdv).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_selectRoutineAdvanced_to_chestAdvanced)
        }
        view.findViewById<View>(R.id.btnArmsAdv).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_selectRoutineAdvanced_to_armsAdvanced)
        }
        view.findViewById<View>(R.id.btnBackAdv).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_selectRoutineAdvanced_to_backAdvanced)
        }
        view.findViewById<View>(R.id.btnLegsAdv).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_selectRoutineAdvanced_to_legsAdvanced)
        }
        view.findViewById<View>(R.id.btnShouldersAdv).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_selectRoutineAdvanced_to_shouldersAdvanced)
        }
        return view
    }
}