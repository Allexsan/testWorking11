package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class SettingActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        val list_button = findViewById<ImageButton>(R.id.button_list)
        val alarm_button = findViewById<ImageButton>(R.id.button_alarm)
        val calendar_button = findViewById<ImageButton>(R.id.button_calendar)
        val setting_button = findViewById<ImageButton>(R.id.button_setting)
        list_button.setOnClickListener {
            val toast = Toast.makeText(this, "Вы находитесь на этой странице", Toast.LENGTH_SHORT)
        }
        calendar_button.setOnClickListener{
            val intent = Intent(this, CalendarAktivity::class.java)
            startActivity(intent)
        }
        alarm_button.setOnClickListener{
            val intent = Intent(this, AlarmActivity::class.java)
            startActivity(intent)
        }
        setting_button.setOnClickListener{
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }
    }
}