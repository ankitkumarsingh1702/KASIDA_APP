package com.example.kasida

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class Feedback_kasida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback_kasida)

        supportActionBar?.hide()


        val text_linkProduct_feedback: TextView = findViewById( R.id.text_product_feedback)

        text_linkProduct_feedback.movementMethod = LinkMovementMethod.getInstance()
        text_linkProduct_feedback.setLinkTextColor(Color.BLUE)

    }
}