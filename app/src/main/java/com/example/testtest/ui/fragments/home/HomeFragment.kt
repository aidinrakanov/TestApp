package com.example.testtest.ui.fragments.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.testtest.Model
import com.example.testtest.R
import com.example.testtest.ui.adapters.HomeAdapter
import com.example.testtest.ui.adapters.HomePagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_agrobazar.*
import java.util.ArrayList

class HomeFragment : Fragment(), HomeAdapter.OnItemClickListener {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var homeAdapter: HomeAdapter
    private val listhome : MutableList<Model> = mutableListOf()

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
        initRecycler()
    }

    private fun initRecycler() {
        homeAdapter = HomeAdapter(this, listhome)
        recycler.apply {
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            adapter = homeAdapter
        }

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

    override fun onClickListener(item: Model) {

    }


}