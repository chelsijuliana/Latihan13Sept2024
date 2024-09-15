package com.chelsi.latihan13sept2024

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        val imageResId = intent.getIntExtra("imageResId", 0)


        val imageView = findViewById<ImageView>(R.id.detailImageView)
        imageView.setImageResource(imageResId)
    }
}
