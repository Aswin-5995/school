package com.example.school

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class itemAdapter(val item : ArrayList<items>) : RecyclerView.Adapter<itemAdapter.ViewHolder>(){
    class ViewHolder(item : View): RecyclerView.ViewHolder(item) {



        val img : ImageView = item.findViewById(R.id.img)
        val title : TextView = item.findViewById(R.id.title)
        val desc : TextView = item.findViewById(R.id.desc)
        val cv: CardView = item.findViewById(R.id.cv)
        val context: Context = item.context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val slide = LayoutInflater.from(parent.context).inflate(R.layout.slides,parent,false)
        return ViewHolder(slide)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val items:items = item[position]
        holder.img.setImageResource(items.image)
        holder.title.text = items.title
        holder.desc.text = items.Desc
        holder.cv.setOnClickListener {View ->
            val intent = Intent(holder.context, viewer::class.java)

            intent.putExtra("title",items.title)
            View.context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return item.size
    }

}