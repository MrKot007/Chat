package com.example.detachedchat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.detachedchat.databinding.FriendMessageBinding
import com.example.detachedchat.databinding.MyMessageBinding

class MessageViewHolder(private val mbinding: MyMessageBinding? = null, private val fbinding: FriendMessageBinding? = null) : RecyclerView.ViewHolder(mbinding!!.root)
class ChatAdapter(private val messageList: MutableList<ReadyMessage>) : RecyclerView.Adapter<MessageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        if (viewType == 0) {
            return MessageViewHolder(MyMessageBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        }
        if (viewType == 1) {
            return MessageViewHolder(FriendMessageBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        }
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}