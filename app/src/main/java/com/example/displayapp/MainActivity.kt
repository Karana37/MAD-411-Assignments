package com.example.displayapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editName = findViewById<EditText>(R.id.edit_name)
        val buttonShow = findViewById<Button>(R.id.button_show)
        val textResult = findViewById<TextView>(R.id.text_result)

        buttonShow.setOnClickListener {
            val name = editName.text.toString()
            textResult.text = "Hello, $name!"
        }

    }
}