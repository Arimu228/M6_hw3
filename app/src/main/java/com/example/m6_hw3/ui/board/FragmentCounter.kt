package com.example.m6_hw3.ui.board

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.m6_hw3.databinding.FragmentCounterBinding
import com.example.m6_hw3.ui.viewmodel.MainViewModel


class FragmentCounter : Fragment() {
    private lateinit var binding: FragmentCounterBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCounterBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]

        initView()
    }


    private fun initView() {
        viewModel._count.observe(viewLifecycleOwner) { count ->
            binding.tvDescriptionBoard.text = count.toString()
        }
    }
}



