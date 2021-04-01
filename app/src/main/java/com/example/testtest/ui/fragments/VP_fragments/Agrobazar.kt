package com.example.testtest.ui.fragments.VP_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.testtest.MainActivity
import com.example.testtest.Model
import com.example.testtest.R
import com.example.testtest.ui.adapters.HomeAdapter
import com.example.testtest.ui.fragments.DetailsFragment
import kotlinx.android.synthetic.main.fragment_agrobazar.*


class Agrobazar : Fragment(), HomeAdapter.OnItemClickListener {

    private val listhome : MutableList<Model> = mutableListOf()
    private lateinit var homeAdapter: HomeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { return inflater.inflate(R.layout.fragment_agrobazar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        initRecycler()
        setData()
    }

    private fun initRecycler() {
        homeAdapter = HomeAdapter(this, listhome)
        recycler.apply {
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            adapter = homeAdapter
        }

    }

    fun setData(){
        listhome.clear()
        listhome.add(
            Model(R.drawable.car1,9500, "USD",
                "Продаю Мерседес W221 в отличном состоянии", "Бишкек"))
        listhome.add(
            Model(R.drawable.car2,8700, "USD",
                "Продаю Приус, Идеал", "Бишкек"))
        listhome.add(
            Model(R.drawable.home1,76000, "USD",
                "Продаю дом, Недорого", "Каракол"))
        listhome.add(
            Model(R.drawable.dog1,10000, "KGZ",
                "Продаю пса, немного туповат", "Бишкек"))
        listhome.add(
            Model(R.drawable.home2,90000, "USD",
                "Меняю, на квартиру в городе", "Нарын"))
        listhome.add(
            Model(R.drawable.dog2,8000, "KGZ",
                "Продаю собаку, черного цвета ", "Ош"))
        listhome.add(
            Model(R.drawable.car3,6200, "USD",
                "Продаю или меняю с доплайтой", "Бишкек"))
        listhome.add(
            Model(R.drawable.horse1,80000, "KGZ",
                "Продам жеребца", "Баткен"))
        listhome.add(
            Model(R.drawable.horse2,95000, "KGZ",
                "Продам коня-скакуна", "Кант"))
        listhome.add(
            Model(R.drawable.a52,33000, "KGZ",
                "Куплю Самсунг А52", "Бишкек"))
    }

    override fun onClickListener(item: Model) {
        DetailsFragment.start(requireActivity(),
            R.id.action_navigation_home_to_detailsFragment, item)
    }

}