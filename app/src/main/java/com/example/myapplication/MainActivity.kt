package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSubmit: Button = findViewById(R.id.buttonSubmit)
        val spinnerColors: Spinner = findViewById(R.id.spinnerColors)
        buttonSubmit.setOnClickListener {
            val intent = Intent(this, ColorActivity::class.java)
            val selectedColor = when (spinnerColors.selectedItemPosition) {
                0 -> Color.RED
                1 -> Color.BLUE
                2 -> Color.GREEN
                else -> Color.BLACK
            }
            intent.putExtra(ColorActivity.COLOR, selectedColor)
            startActivity(intent)
        }
    }
}