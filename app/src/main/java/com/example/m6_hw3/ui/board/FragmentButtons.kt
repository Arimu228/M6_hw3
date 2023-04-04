package com.example.m6_hw3.ui.board

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.m6_hw3.databinding.FragmentButtonsBinding
import com.example.m6_hw3.ui.viewmodel.MainViewModel

class FragmentButtons : Fragment() {

    private lateinit var binding: FragmentButtonsBinding
    private lateinit var viewModel: MainViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentButtonsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        initListener()
    }

    private fun initListener() {

        binding.plus.setOnClickListener {
            viewModel.increment()

        }
        binding.minus.setOnClickListener {
            viewModel.discrement()

        }

    }



}

