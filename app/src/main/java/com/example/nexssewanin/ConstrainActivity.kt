package com.example.nexssewanin

import android.os.Bundle
import android.util.Log.d
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_constrain.*
import kotlinx.android.synthetic.main.content_constrain.*

class ConstrainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constrain)
        setSupportActionBar(toolbar)
        texts.setOnClickListener {
            Toast.makeText(this,"Welcome, GO suck Dick",Toast.LENGTH_SHORT).show()
            }
        imageView2.setOnClickListener{
            Snackbar.make(constrainLayoutTag,"thanks",Snackbar.LENGTH_LONG).show()
        }
        switchyeet.setOnCheckedChangeListener { buttonView,isChecked->
            d("switches","teryeet $isChecked" )
            if(isChecked)
            {
                frameLayout.visibility = View.VISIBLE
                Toast.makeText(this,"Teryeet Yeet",Toast.LENGTH_SHORT).show()
                supportFragmentManager.beginTransaction().replace(R.id.frameLayout, FirstFragment())
                    .commit()
                //buttonView.visibility = View.GONE

            }
            else
            {
                Toast.makeText(this,"Tertidak Yeet",Toast.LENGTH_SHORT).show()
                frameLayout.visibility = View.GONE

            }
        }

    }
}
