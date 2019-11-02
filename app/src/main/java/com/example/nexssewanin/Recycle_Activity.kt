package com.example.nexssewanin

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_recycle_.*
import kotlinx.android.synthetic.main.content_recycle_.*

class Recycle_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_)
        setSupportActionBar(toolbar)
        val friends = listOf(
            BestFriend("Kaguya","Shinomiya","kaguya@shinomiya.com",R.drawable.hmmmm),
            BestFriend("MFadly","Hasan","Hasan@Fadly.com",R.drawable.yespic),
            BestFriend("Paksi","Ariyo","LoliconSejati@shiap.com",R.drawable.ilya)
        )

        FriendRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@Recycle_Activity)
            adapter = FriendAdapter(friends)
            {
                d("clicker","Hi From activity")
                startActivity(Intent(this@Recycle_Activity,FriendDetailView::class.java))
            }
        }
    }

}
