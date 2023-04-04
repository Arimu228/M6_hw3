package com.example.m6_hw3.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.m6_hw3.databinding.ActivityMainBinding
import com.example.m6_hw3.ui.board.BoardAdapter

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initView()

    }


    private fun initView() {
        val viewPager = binding.viewPager
        viewPager.adapter = BoardAdapter(supportFragmentManager)

    }


}