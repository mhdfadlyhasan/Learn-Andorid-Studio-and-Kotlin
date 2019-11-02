package com.example.nexssewanin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about_app.*

class AboutApp : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_app)

        tombol.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}