package com.example.blackcofferassingment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.blackcofferassingment.R
import com.example.blackcofferassingment.adapter.ListDataAdapter
import com.example.blackcofferassingment.dataModel.ListDataModel
import com.example.blackcofferassingment.databinding.FragmentPesonalPageBinding

private const val ARG_PARAM1 = "arg_param1"
class MarchentPageFragment : Fragment() {
    private var param1: Int? = null
    private lateinit var binding : FragmentPesonalPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getInt(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPesonalPageBinding.inflate( inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = binding.RecyclerView
        val adapter = param1?.let {
            ListDataAdapter(arrayListOf(
                ListDataModel("JB","John Doe", "Durgapur | Fresher", "Within 14.6 KM",50, "Coffee | Business | Friendship","Hi community! I am open to new connection"),
                ListDataModel("JB","John Doe", "Durgapur | Fresher", "Within 14.6 KM",50, "Coffee | Business | Friendship","Hi community! I am open to new connection"),
                ListDataModel("JB","John Doe", "Durgapur | Fresher", "Within 14.6 KM",50, "Coffee | Business | Friendship","Hi community! I am open to new connection"),
                ListDataModel("JB","John Doe", "Durgapur | Fresher", "Within 14.6 KM",50, "Coffee | Business | Friendship","Hi community! I am open to new connection"),
                ListDataModel("JB","John Doe", "Durgapur | Fresher", "Within 14.6 KM",50, "Coffee | Business | Friendship","Hi community! I am open to new connection"),
            ), it)
        }
        recyclerView.adapter = adapter

    }


    companion object {
        @JvmStatic
        fun newInstance(param1: Int) =
            MarchentPageFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_PARAM1, param1)
                }
            }
    }
}