package com.example.school

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        recyclerView.layoutManager = GridLayoutManager(this,2, GridLayout.VERTICAL,false)

        val users = ArrayList<User>()

        users.add(User("COURSES",R.drawable.courses))
        users.add(User("MEET",R.drawable.google_meet))
        val adapter = pictureAdapter(users)

        recyclerView.adapter =adapter


    }
}