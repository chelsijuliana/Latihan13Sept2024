package com.chelsi.latihan13sept2024

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Adapter
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import com.chelsi.latihan13sept2024.Adapter.GambarAdapter

class DaftarGambar : AppCompatActivity() {

    // Sample image resource array
    private val imageList = arrayOf(
        R.drawable.politeknik,
        R.drawable.akademik,
        R.drawable.pkm,
        R.drawable.gedab,
        R.drawable.airmancur,
        R.drawable.poster
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_gambar)

        // Set up the GridView for photos
        val gridView = findViewById<GridView>(R.id.gridView)
        val Adapter = GambarAdapter(this, imageList)
        gridView.adapter = Adapter

        // Set up onClickListener for grid items
        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("imageResId", imageList[position])
            startActivity(intent)
        }
    }
}
