package com.chelsi.latihan13sept2024

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TeknikKomputer : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teknik_komputer)


        val btn_bck1 = findViewById<Button>(R.id.btn_bck1)
        btn_bck1.setOnClickListener {
            finish() // Closes the activity and goes back to the previous screen
        }
    }
}