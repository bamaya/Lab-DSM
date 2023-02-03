package com.example.suma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val n1 = findViewById<EditText>(R.id.Num_1)
        val n2 = findViewById<EditText>(R.id.Num_2)
        val r = findViewById<TextView>(R.id.Txt_r)
        val btn = findViewById<Button>(R.id.btn_sumar)

        btn.setOnClickListener{
            r.setText(
                "La suma es: "+(n1.text.toString().toInt()+n2.text.toString().toInt())
            )
        }

    }
}