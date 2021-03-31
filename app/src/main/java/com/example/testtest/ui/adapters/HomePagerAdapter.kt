package com.example.testtest.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.testtest.ui.fragments.VP_fragments.Agrobazar
import com.example.testtest.ui.fragments.VP_fragments.Celhoz
import com.example.testtest.ui.fragments.VP_fragments.StroyMaterial
import java.util.ArrayList


class HomePagerAdapter(fm: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fm, lifecycle) {

    var fragments : ArrayList<Fragment> = arrayListOf(
        Agrobazar(), Celhoz(), StroyMaterial()
    )

    override fun getItemCount(): Int {
            return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}