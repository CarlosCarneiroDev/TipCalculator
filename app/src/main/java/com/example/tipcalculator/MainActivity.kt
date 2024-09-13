package com.example.tipcalculator

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnClean: Button = findViewById(R.id.btn_clean)
        val btnDone: Button = findViewById(R.id.btn_done)
        val edtTotal: TextInputEditText = findViewById(R.id.til_total)
        val edtNumPeople: TextInputEditText = findViewById(R.id.til_number_of_people)

        btnClean.setOnClickListener{

            println("Carlos" )
        }



    }

}