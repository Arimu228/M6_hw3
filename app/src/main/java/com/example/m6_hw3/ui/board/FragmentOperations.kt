package com.example.m6_hw3.ui.board

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.m6_hw3.databinding.FragmentOperationBinding
import com.example.m6_hw3.ui.viewmodel.MainViewModel


class FragmentOperations : Fragment() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: FragmentOperationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOperationBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        initView()
    }

    private fun initView() {
        viewModel._operation .observe(viewLifecycleOwner) { count ->
            binding.textVp.text = count.toString()
        }

    }

}


