package com.example.explicit_intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            //open a new activity
            intent= Intent(applicationContext,SecondScreen::class.java)
            startActivity(intent)
        }


    }
}