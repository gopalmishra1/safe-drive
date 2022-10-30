package com.example.safedrive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class select : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)
        val jadu:Button=findViewById(R.id.jadu)
        val btnupload:Button=findViewById(R.id.btnupload)

        btnupload.setOnClickListener{
            val intant= Intent(this,upload::class.java)
            startActivity(intant)
            finish()
        }
        jadu.setOnClickListener{
            val intant= Intent(this,drive::class.java)
            startActivity(intant)
            finish()
        }

    }
}
