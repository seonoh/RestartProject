package com.example.seonoh.restartproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var firstBtn : Button
    lateinit var secondBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstBtn = findViewById(R.id.button1)
        secondBtn = findViewById(R.id.button2)

        firstBtn.setOnClickListener {
            Toast.makeText(this,"onClicked First Button !",Toast.LENGTH_LONG).show()
        }

        secondBtn.setOnClickListener {
            Toast.makeText(this,"onClicked Second Button !",Toast.LENGTH_LONG).show()
        }
        Toast.makeText(this,"HELLOW",Toast.LENGTH_LONG).show()
        Toast.makeText(this,"GitKraken Test",Toast.LENGTH_LONG).show()
    }
}