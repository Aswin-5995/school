package com.example.school

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView

class courses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        supportActionBar?.hide()


        val intent = intent
        val _title = intent.getStringExtra("name")
        println(_title)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, OrientationHelper.VERTICAL, false)

        val item = ArrayList<items>()


        item.add(
            items(
                R.drawable.c,
                "C programming",
                "basic functionalities"
            )
        )
        item.add(
            items(
                R.drawable.cpp,
                "C++ programming",
                "basci funcationalities"
            )
        )
        item.add(
            items(
                R.drawable.java,
                "Java programming",
                "basic functionalities"
            )
        )
        item.add(
            items(
                R.drawable.kotlin,
                "Kotlin programming",
                "basic functionalities"
            )
        )
        item.add(
            items(
                R.drawable.csharp,
                "C# programming",
                "basic functionalities"
            )
        )
        item.add(
            items(
                R.drawable.js,
                "JavaScript programming",
                "basic functionalities"
            )
        )
        item.add(
            items(
                R.drawable.c,
                "C programming",
                "basic functionalities"
            )
        )
        item.add(
            items(
                R.drawable.cpp,
                "C++ programming",
                "basci funcationalities"
            )
        )
        item.add(
            items(
                R.drawable.java,
                "Java programming",
                "basic functionalities"
            )
        )
        item.add(
            items(
                R.drawable.kotlin,
                "Kotlin programming",
                "basic functionalities"
            )
        )
        item.add(
            items(
                R.drawable.csharp,
                "C# programming",
                "basic functionalities"
            )
        )
        item.add(
            items(
                R.drawable.js,
                "JavaScript programming",
                "basic functionalities"
            )
        )
        item.add(
            items(
                R.drawable.c,
                "C programming",
                "basic functionalities"
            )
        )
        item.add(
            items(
                R.drawable.cpp,
                "C++ programming",
                "basci funcationalities"
            )
        )
        item.add(
            items(
                R.drawable.java,
                "Java programming",
                "basic functionalities"
            )
        )
        item.add(
            items(
                R.drawable.kotlin,
                "Kotlin programming",
                "basic functionalities"
            )
        )
        item.add(
            items(
                R.drawable.csharp,
                "C# programming",
                "basic functionalities"
            )
        )
        item.add(
            items(
                R.drawable.js,
                "JavaScript programming",
                "basic functionalities"
            )
        )

        val adapter = itemAdapter(item)


        recyclerView.adapter = adapter
    }
}