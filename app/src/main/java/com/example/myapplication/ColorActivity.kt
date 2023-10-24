package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class ColorActivity : AppCompatActivity()  {
    companion object {
        const val COLOR = "color"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)
        val selectedColor = intent.getIntExtra(COLOR, Color.BLACK)
        val colorMap = mapOf(
            Color.BLUE to "Blue",
            Color.RED to "Red",
            Color.GREEN to "Green",
            Color.BLACK to "Black"
        )
        val view: View = findViewById(R.id.Screen)
        val textView: TextView = findViewById(R.id.textView)

        textView.setTextColor(Color.WHITE)
        "COLOR ${colorMap[selectedColor]?.uppercase(Locale.ROOT)}".also { textView.text = it }
        view.setBackgroundColor(selectedColor)
    }
}