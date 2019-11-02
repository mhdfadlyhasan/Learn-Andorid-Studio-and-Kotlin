package com.example.nexssewanin

import android.util.Log.d
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.content_constrain.*
import kotlinx.android.synthetic.main.row_friend.view.*

class FriendAdapter(private val friends: List<BestFriend>,private val friendClicked: () -> Unit) : RecyclerView.Adapter<FriendAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val views = LayoutInflater.from(parent.context).inflate(R.layout.row_friend, parent,false)
        return ViewHolder(views)

    }
    override fun getItemCount() = friends.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val teman =friends[position]
        holder.itemView.friendTitle.text = "${teman.firstName}"
        holder.itemView.friendSecond.text = "${teman.lastName}"
        holder.itemView.friendEmail.text = "${teman.email}"
        holder.itemView.photoOfMyFriend.setImageDrawable(holder.itemView.context.getDrawable(teman.friendPhoto))
        holder.itemView.setOnClickListener {
            d("clicker baru","terklik di friend")
            friendClicked.invoke()
        }
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
    {

    }

}
