package com.example.instancestatekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {

    private var counter = 0
    lateinit var textView2: TextView
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        textView2 = findViewById(R.id.tv2)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener {
            counter += 1
            textView2.text = "Counter: $counter"
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("counter", counter)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        counter = savedInstanceState.getInt("counter", 0)
        textView2.text = "Counter: $counter"
    }

}
