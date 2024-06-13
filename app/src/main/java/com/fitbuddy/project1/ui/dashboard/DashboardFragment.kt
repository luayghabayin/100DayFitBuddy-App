package com.fitbuddy.project1.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.fitbuddy.project1.R
import com.fitbuddy.project1.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /*
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root

         */
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)
        view.findViewById<View>(R.id.btnBeginner).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_navigation_dashboard_to_selectRoutine2)
        }
        view.findViewById<View>(R.id.btnAdvanced).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_navigation_dashboard_to_selectRoutineAdvanced)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}