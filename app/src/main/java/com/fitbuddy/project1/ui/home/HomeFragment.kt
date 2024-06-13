package com.fitbuddy.project1.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.fitbuddy.project1.R
import com.fitbuddy.project1.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /*
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root

         */
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        view.findViewById<View>(R.id.btnSettings).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_navigation_home_to_info2)
        }
        view.findViewById<View>(R.id.btnStart).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_navigation_home_to_navigation_dashboard)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}