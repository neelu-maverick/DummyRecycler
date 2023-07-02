package com.example.dummyrecycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dummyrecycler.databinding.RecyclerRowBinding

class ListAdapter(

    private val list: List<ListModel>,
    val onItemClick: (position: Int) -> Unit,
) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        RecyclerRowBinding.bind(holder.itemView).apply {
            textview.text = list[position].name
            textview.setOnClickListener {
                onItemClick(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class ViewHolder(binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root)


