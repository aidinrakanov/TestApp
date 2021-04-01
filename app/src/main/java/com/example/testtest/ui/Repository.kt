package com.example.testtest.ui

import com.example.testtest.Model
import com.example.testtest.R
import com.example.testtest.ui.fragments.home.HomeFragment

class Repository(val homeFragment: HomeFragment) {

    private val listhome : MutableList<Model> = mutableListOf()

    fun fetchData(){
        listhome.add(
            Model(R.drawable.car1,9500, "USD",
                "Продаю Мерседес W221 в отличном состоянии", "Бишкек")
        )
        listhome.add(
            Model(R.drawable.car2,8700, "USD",
                "Продаю Мерседес W221 в отличном состоянии", "Бишкек")
        )
        listhome.add(
            Model(R.drawable.home1,76000, "USD",
                "Продаю Мерседес W221 в отличном состоянии", "Бишкек")
        )
        listhome.add(
            Model(R.drawable.dog1,10000, "KGZ",
                "Продаю Мерседес W221 в отличном состоянии", "Бишкек")
        )
        listhome.add(
            Model(R.drawable.home2,9000, "USD",
                "Продаю Мерседес W221 в отличном состоянии", "Бишкек")
        )
        listhome.add(
            Model(R.drawable.dog1,8000, "KGZ",
                "Продаю Мерседес W221 в отличном состоянии", "Бишкек")
        )
        listhome.add(
            Model(R.drawable.car3,6200, "USD",
                "Продаю Мерседес W221 в отличном состоянии", "Бишкек")
        )
        listhome.add(
            Model(R.drawable.horse1,80000, "KGZ",
                "Продаю Мерседес W221 в отличном состоянии", "Бишкек")
        )
        listhome.add(
            Model(R.drawable.horse2,95000, "USD",
                "Продаю Мерседес W221 в отличном состоянии", "Бишкек")
        )
        listhome.add(
            Model(R.drawable.a52,33000, "KGZ",
                "Продаю Мерседес W221 в отличном состоянии", "Бишкек")
        )
    }

}