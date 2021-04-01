package com.example.testtest.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testtest.Model
import com.example.testtest.R
import com.example.testtest.ui.fragments.home.HomeFragment
import kotlinx.android.synthetic.main.item_list.view.*

class HomeAdapter(private val onItemClickListener: OnItemClickListener,
                  private val list: MutableList<Model>) : RecyclerView.Adapter<HomeAdapter.HomeVH>()  {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeVH {
        return HomeVH(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false))

    }

    override fun onBindViewHolder(holder: HomeVH, position: Int) {
        holder.bind(list[position])
        holder.itemView.setOnClickListener{
            onItemClickListener.onClickListener(list[position])
        }
    }

    override fun getItemCount(): Int = list.size

    class HomeVH(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(model: Model){
            itemView.main_cost.text = model.cost.toString()
            itemView.mainImage.setImageResource(model.image)
            itemView.main_info.text = model.info
            itemView.main_city.text = model.city
            itemView.main_valute.text = model.valueName
        }

    }

    interface OnItemClickListener{
        fun onClickListener(item:Model)
    }

}