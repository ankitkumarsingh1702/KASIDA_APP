package com.example.kasida

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView

class Kasida_product_for_users_5 : AppCompatActivity() {

    private lateinit var button_17: Button
    private lateinit var button_18: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kasida_product_for_users5)
        supportActionBar?.hide()

        val text_product14_description: TextView = findViewById( R.id.text_product14_description)

        text_product14_description.movementMethod = LinkMovementMethod.getInstance()
        text_product14_description.setLinkTextColor(Color.BLACK)

        val text_product15_description: TextView = findViewById( R.id.text_product15_description)

        text_product15_description.movementMethod = LinkMovementMethod.getInstance()
        text_product15_description.setLinkTextColor(Color.BLACK)



        button_17 = findViewById(R.id.btn_17)

        button_17.setOnClickListener {
            val intent = Intent(this, Kasida_taking_input_from_users::class.java)

            startActivity(intent)
        }

        button_18 = findViewById(R.id.btn_18)

        button_18.setOnClickListener {
            val intent = Intent(this, Kasida_taking_input_from_users::class.java)

            startActivity(intent)
        }


    }
}