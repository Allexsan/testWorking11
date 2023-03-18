package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class CreateAlarmActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_alarm)
        val createalarm_back = findViewById<ImageButton>(R.id.imageButton2)
        val createalarm = findViewById<Button>(R.id.button)
        createalarm.setOnClickListener {
            val intent = Intent(this, AlarmActivity::class.java)
            startActivity(intent)
            val toast = Toast.makeText(this, "Вы создали будильник", Toast.LENGTH_SHORT)
            toast.show()
        }
        createalarm_back.setOnClickListener{
            val intent = Intent(this, AlarmActivity::class.java)
            startActivity(intent)
        }
    }
}