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

class pictureAdapter(val pic :ArrayList<User>): RecyclerView.Adapter<pictureAdapter.viewHolder>() {
    class viewHolder (itemview : View): RecyclerView.ViewHolder(itemview){
        val   img : ImageView = itemview.findViewById(R.id.imageView)
        val txt : TextView = itemview.findViewById(R.id.textView)
        val cv: CardView = itemview.findViewById(R.id.cv)
        val context: Context = itemview.context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val p = LayoutInflater.from(parent.context).inflate(R.layout.grid,parent,false)
        return viewHolder(p)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val user: User = pic[position]
        holder.img.setImageResource(user.picture)
        holder.txt.text = user.name
        holder.cv.setOnClickListener { View ->
            val intent = Intent(holder.context, courses::class.java)

            intent.putExtra("title", user.name)
            View.context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return pic.size
    }
}