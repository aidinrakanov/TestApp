package com.example.testtest.ui.fragments.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.testtest.R
import com.example.testtest.ui.adapters.HomePagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import java.util.ArrayList

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? { homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewPager(view)
    }

    private fun initViewPager(view: View) {
       var viewPager = view.findViewById<ViewPager2>(R.id.view_pager)
        var adapter = HomePagerAdapter(childFragmentManager, lifecycle)
        viewPager.adapter = adapter

        var tabLayout:TabLayout = view.findViewById(R.id.tab_layout)
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