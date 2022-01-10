package com.example.kasida

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView

class Kasida_product_for_users_2 : AppCompatActivity() {


    private lateinit var button_8: Button
    private lateinit var button_9: Button
    private lateinit var button_10: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kasida_product_for_users2)

        supportActionBar?.hide()

        val text_product7_description: TextView = findViewById( R.id.text_product7_description)

        text_product7_description.movementMethod = LinkMovementMethod.getInstance()
        text_product7_description.setLinkTextColor(Color.BLUE)

        val text_product8_description: TextView = findViewById( R.id.text_product8_description)

        text_product8_description.movementMethod = LinkMovementMethod.getInstance()
        text_product8_description.setLinkTextColor(Color.BLUE)

        val text_product9_description: TextView = findViewById( R.id.text_product9_description)

        text_product9_description.movementMethod = LinkMovementMethod.getInstance()
        text_product9_description.setLinkTextColor(Color.BLUE)

        button_8 = findViewById(R.id.btn_8)

        button_8.setOnClickListener {
            val intent = Intent(this, Kasida_taking_input_from_users::class.java)

            startActivity(intent)
        }

        button_9 = findViewById(R.id.btn_9)

        button_9.setOnClickListener {
            val intent = Intent(this, Kasida_taking_input_from_users::class.java)

            startActivity(intent)
        }

        button_10 = findViewById(R.id.btn_10)

        button_10.setOnClickListener {
            val intent = Intent(this, Kasida_taking_input_from_users::class.java)

            startActivity(intent)
        }
    }
}