package com.jacky.orderingsystem

import androidx.recyclerview.widget.RecyclerView
import com.jacky.orderingsystem.databinding.ItemMenuListBinding

class MenuViewHolder(private val binding: ItemMenuListBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(
        data: MenuResponse,
    ) {


        binding.apply {


            tvName.text = data.name
            tvContent.text = data.content
            tvMoney.text = data.money

        }
    }

}