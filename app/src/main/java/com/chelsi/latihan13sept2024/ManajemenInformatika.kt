package com.chelsi.latihan13sept2024

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ManajemenInformatika : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manajemen_informatika)


        val btn_back1 = findViewById<Button>(R.id.btn_bck1)
        btn_back1.setOnClickListener {
            finish() // Closes the activity and goes back to the previous screen
        }
    }
}