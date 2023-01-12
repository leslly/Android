package com.tenisolutions.messaginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            //Any code defined here will be executed at the click of the button
            Log.i("MainActivity", "Button was clicked")

            Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show()
        }

        btnSendTextToNextActivity.setOnClickListener {
            //There are two types of intent, explicit and implicit intent
            //Explicit intent is when you now your target activiy. implicit is the oppposite
            //our objective is to pass the message to the second activity
            val message: String = etUserMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
            //Explict intent
            val intent =Intent(this, SecondActivity::class.java)

            intent.putExtra("user_message", message)

            startActivity(intent)
        }
    }
}