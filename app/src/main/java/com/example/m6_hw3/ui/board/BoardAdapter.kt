@file:Suppress("DEPRECATION")

package com.example.m6_hw3.ui.board

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class BoardAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {


    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FragmentButtons()
            1 -> FragmentCounter()
            2 -> FragmentOperations()
            else -> FragmentButtons()
        }
    }


    override fun getCount(): Int = 3


}