package com.example.safedrive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val but_register:Button=findViewById(R.id.but_register)
  val et_name:EditText=findViewById(R.id.et_name)
        but_register.setOnClickListener{
            if(et_name.text.isEmpty()){

                Toast.makeText(this,"please enter your phone number",Toast.LENGTH_LONG).show()
            }
            else{
                val intent= Intent(this,select::class.java)
                startActivity(intent)
                finish()
            }

        }



    }
}