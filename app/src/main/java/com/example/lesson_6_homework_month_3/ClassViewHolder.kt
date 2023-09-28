package com.example.lesson_6_homework_month_3

import androidx.recyclerview.widget.RecyclerView
import com.example.lesson_6_homework_month_3.databinding.ItemClassBinding

class ViewHolder(private var binding: ItemClassBinding):RecyclerView.ViewHolder(binding.root) {

    fun bind(item:String){
        binding.itemClass.text=item
    }
}