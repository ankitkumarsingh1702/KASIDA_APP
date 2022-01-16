package com.example.kasida

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView

class Kasida_product_for_users_3 : AppCompatActivity() {
    private lateinit var button_13: Button
    private lateinit var button_14: Button


    private lateinit var button_forward_3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kasida_product_for_users3)

        supportActionBar?.hide()

        val text_product10_description: TextView = findViewById( R.id.text_product10_description)

        text_product10_description.movementMethod = LinkMovementMethod.getInstance()
        text_product10_description.setLinkTextColor(Color.BLACK)

        val text_product11_description: TextView = findViewById( R.id.text_product11_description)

        text_product11_description.movementMethod = LinkMovementMethod.getInstance()
        text_product11_description.setLinkTextColor(Color.BLACK)


        button_13 = findViewById(R.id.btn_13)

        button_13.setOnClickListener {
            val intent = Intent(this, Kasida_taking_input_from_users::class.java)

            startActivity(intent)
        }

        button_14 = findViewById(R.id.btn_14)

        button_14.setOnClickListener {
            val intent = Intent(this, Kasida_taking_input_from_users::class.java)

            startActivity(intent)
        }

        button_forward_3 = findViewById(R.id.btn_forward_3)

        button_forward_3.setOnClickListener {
            val intent = Intent(this, kashida_product_of_users_4::class.java)

            startActivity(intent)
        }


    }
}