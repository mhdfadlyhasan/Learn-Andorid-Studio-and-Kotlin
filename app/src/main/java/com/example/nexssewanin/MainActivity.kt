package com.example.nexssewanin

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        Recycle.setOnClickListener {
            d("clicker","clicked recycle")
            startActivity(Intent(this,Recycle_Activity::class.java))
        }
        TestButton.setOnClickListener {
            d("clicker","Tombol Constrain ditekan")
            startActivity(Intent(this,ConstrainActivity::class.java))
        }
        SubmitNama.setOnClickListener {
            d("clicker","Ter-isi dengan nilai ${editText.text}")
            TampilanHello.text = "Hello, Your name is ${editText.text}"
            if(editText.text.toString()=="bad")
            {
                ImageShower.setImageResource(R.drawable.nopic)
            }
            else
                ImageShower.setImageResource(R.drawable.yespic)
        }
        TombolMerah.setOnClickListener {
            d("clicker","Tombol Merah Ditekan")
            startActivity(Intent(this,AboutApp::class.java))
        }



    }
}
