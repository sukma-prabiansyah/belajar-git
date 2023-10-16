package com.example.belajargit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName: EditText = findViewById(R.id.et_name)
        val button: Button = findViewById(R.id.button)

        val name = etName.text.toString()
        button.setOnClickListener {
            when {
                name.isEmpty() -> etName.error = "Put your name first"
                else -> {
                    etName.text.clear()
                    Toast.makeText(this, "Hello, I am smart App!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}