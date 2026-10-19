package com.athirah.lab1_main

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edtEditName = findViewById<EditText>(R.id.edtEditName)
        val btnPressMe = findViewById<Button>(R.id.btnPressMe)
        val showHello = findViewById<TextView>(R.id.showHello)

        btnPressMe.setOnClickListener {
            val name = edtEditName.text.toString().trim()

            if (name.isEmpty()){
                Toast.makeText(this, "Enter name as described!", Toast.LENGTH_SHORT).show()
            }else{
                showHello.text = "Assalamualaikum $name"
                Toast.makeText(this, "Assalamualaikum $name", Toast.LENGTH_LONG).show()
            }
        }
    }
}