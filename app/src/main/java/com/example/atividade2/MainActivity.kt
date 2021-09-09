package com.example.atividade2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button = findViewById(R.id.button)
        val inputText : EditText = findViewById(R.id.editTextTextPersonName)
        button.setOnClickListener {
            setContentView(R.layout.new_layout)
            val showText : TextView = findViewById(R.id.textView)
            showText.text = inputText.text
        }

    }
}