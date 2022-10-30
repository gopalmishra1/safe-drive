package com.example.safedrive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import android.widget.TextView

class drive : AppCompatActivity() {
    private var ashwin :TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drive)
         ashwin=findViewById(R.id.ashwin)
        val gopal:Button=findViewById(R.id.gopal)


       gopal.setOnClickListener{
            ashwin?.append("a car is at 12m from you please maintain speed 12km/h")
        }
    }
}