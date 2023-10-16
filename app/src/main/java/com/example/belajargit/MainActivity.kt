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
        val etAge: EditText = findViewById(R.id.et_age)
        val button: Button = findViewById(R.id.button)

        val name = etName.text.toString()
        val age = etAge.text.toString()

        button.setOnClickListener {
            when {
                name.isEmpty() -> etName.error = "Put your name first"
                age.isEmpty() -> etAge.error = "Put your age first"
                else -> {
                    etName.text.clear()
                    etAge.text.clear()
                    val ages = when (age.toInt()) {
                        in 0..20 -> "you are so great younger"
                        in 21..40 -> "you are adult"
                        in 41..60 -> "you are older"
                        else -> "keep your life pattern"
                    }
                    val message = "Your name $name, $ages"
                    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}