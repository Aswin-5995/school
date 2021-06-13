package com.example.school

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView

class viewer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewer)

        supportActionBar?.hide()
        val intent = intent
        val _title = intent.getStringExtra("title")
        println(_title)

        val vdo = findViewById<VideoView>(R.id.videoView)
        val ply = findViewById<Button>(R.id.play)
        val pause = findViewById<Button>(R.id.button2)


        vdo.setVideoURI(Uri.parse("https://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4"))
        vdo.requestFocus()



        ply.setOnClickListener {
            vdo.start()
        }

        pause.setOnClickListener {
            vdo.pause()
        }
    }
}