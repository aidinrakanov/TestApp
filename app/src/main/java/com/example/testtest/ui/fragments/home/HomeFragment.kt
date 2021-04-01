package com.example.testtest.ui.fragments.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.example.testtest.R
import com.example.testtest.ui.adapters.HomePagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator



class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewPager(view)
    }


    private fun initViewPager(view: View) {
       val viewPager = view.findViewById<ViewPager2>(R.id.view_pager)
        val adapter = HomePagerAdapter(childFragmentManager, lifecycle)
        viewPager.adapter = adapter

        val tabLayout:TabLayout = view.findViewById(R.id.tab_layout)
        TabLayoutMediator(tabLayout, viewPager){
            tab, position ->
            when(position){
                0->{tab.text ="Агробазар" }
                1->{tab.text ="Сельхоз\nтехника" }
                2->{tab.text ="Строй\nматериалы" }
            }
        }.attach()
    }
}