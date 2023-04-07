package com.example.detachedchat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.detachedchat.databinding.ActivityMainBinding
import com.google.gson.Gson
import org.java_websocket.client.WebSocketClient
import org.java_websocket.handshake.ServerHandshake
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.Exception
import java.net.URI

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var adapter: ChatAdapter
    private lateinit var client: WebSocketClient
    private var nowOpen = false
    private val retrofit = Retrofit.Builder()
        .baseUrl("http://strukov-artemii.online:8085/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    private val api = retrofit.create(API::class.java)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

    }

    private fun createWebSocketClient(token: String) {
        client = object: WebSocketClient(URI("ws://95.31.130.149:8085/chat?token=$token")){
            override fun onOpen(handshakedata: ServerHandshake?) {}

            override fun onMessage(message: String?) {
                TODO("Not yet implemented")
            }

            override fun onClose(code: Int, reason: String?, remote: Boolean) {
                TODO("Not yet implemented")
            }

            override fun onError(ex: Exception?) {
                TODO("Not yet implemented")
            }
        }
    }
}