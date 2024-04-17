package com.jacky.orderingsystem

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jacky.orderingsystem.databinding.ItemMenuListBinding

class MenuAdapter(
    private var data: List<MenuResponse>,
) : RecyclerView.Adapter<MenuViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {

        val binding = ItemMenuListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MenuViewHolder(binding)
    }


    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(
            data[position],
        )

    }

    override fun getItemCount(): Int {
        return data.size
    }
}