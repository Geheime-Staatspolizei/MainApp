package com.example.vilkipalkiapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(var items:List<Item>, var context: Context): RecyclerView.Adapter<ItemAdapter.ViveHolder>() {
    class ViveHolder(view: View) : RecyclerView.ViewHolder(view){
        val title: TextView = view.findViewById(R.id.item_is_list_litle)
        val price: TextView = view.findViewById(R.id.item_is_list_price)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViveHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_in_list, parent, false)
        return ViveHolder(view)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: ViveHolder, position: Int) {
        holder.title.text = items[position].title
        holder.price.text = items[position].price.toString()
    }


}
