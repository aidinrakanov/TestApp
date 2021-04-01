package com.example.testtest.ui.fragments

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.testtest.Model
import com.example.testtest.R
import kotlinx.android.synthetic.main.fragment_details.*


class DetailsFragment : Fragment() {

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            return inflater.inflate(R.layout.fragment_details, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
        buttonInits()

    }

    private fun buttonInits() {
        detail_call.setOnClickListener {
            var number = "0708709900"
            val intent2 = Intent(Intent.ACTION_DIAL)
            intent2.data = Uri.parse("tel:$number")
            startActivity(intent2)
        }
    }

    private fun getData() {
        detail_city.text = item?.city
        item?.let { detail_image.setImageResource(it.image) }
        detail_cost.text = item?.cost.toString()
        detail_info_text.text = item?.info
        detail_valute.text = item?.valueName
    }


    companion object {
        var item: Model? = null
        fun start(activity: Activity, action: Int, item: Model) {
            this.item = item
            Navigation.findNavController(activity, R.id.nav_host_fragment)
                .navigate(action)
        }
    }
    }
