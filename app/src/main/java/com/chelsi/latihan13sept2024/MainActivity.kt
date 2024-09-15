package com.chelsi.latihan13sept2024

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    lateinit var btnMI: Button
    lateinit var btnTK: Button
    lateinit var btnGBR: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMI = findViewById<Button>(R.id.btnMI)
        val btnTK = findViewById<Button>(R.id.btnTK)
        val btnGBR = findViewById<Button>(R.id.btnGBR)

        btnMI.setOnClickListener() {
            val intent = Intent(this, ManajemenInformatika::class.java)
            startActivity(intent)
        }

        btnTK.setOnClickListener() {
            val intent = Intent(this, TeknikKomputer::class.java)
            startActivity(intent)
        }

        btnGBR.setOnClickListener() {
            val intent = Intent(this, DaftarGambar::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
