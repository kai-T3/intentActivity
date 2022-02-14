package com.example.week5

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnA: Button = findViewById(R.id.btnA)
        btnA.setOnClickListener(){
            val intentA: Intent = Intent(this, aboutActivity::class.java)

            intentA.putExtra("StudentName", "John")

            startActivity(intentA)
        }
        val btnB: Button = findViewById(R.id.btnB)
        btnB.setOnClickListener(){

            //val telNo = Uri.parse("tel: 999")
            //val intentB:Intent = Intent(Intent.ACTION_DIAL)

            val geoLoc = Uri.parse("geo: 3.140583, 101.693207")
            val intentB:Intent = Intent(Intent.ACTION_VIEW, geoLoc)
            startActivity(intentB)
        }

    }
}