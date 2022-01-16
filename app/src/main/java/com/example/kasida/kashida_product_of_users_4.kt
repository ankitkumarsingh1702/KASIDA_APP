package com.example.kasida

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView

class kashida_product_of_users_4 : AppCompatActivity() {

    private lateinit var button_15: Button
    private lateinit var button_16: Button

    private lateinit var button_forward_4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kashida_product_of_users4)

        supportActionBar?.hide()

        val text_product12_description: TextView = findViewById( R.id.text_product12_description)

        text_product12_description.movementMethod = LinkMovementMethod.getInstance()
        text_product12_description.setLinkTextColor(Color.BLACK)

        val text_product13_description: TextView = findViewById( R.id.text_product13_description)

        text_product13_description.movementMethod = LinkMovementMethod.getInstance()
        text_product13_description.setLinkTextColor(Color.BLACK)



        button_15 = findViewById(R.id.btn_15)

        button_15.setOnClickListener {
            val intent = Intent(this, Kasida_taking_input_from_users::class.java)

            startActivity(intent)
        }

        button_16= findViewById(R.id.btn_16)

        button_16.setOnClickListener {
            val intent = Intent(this, Kasida_taking_input_from_users::class.java)

            startActivity(intent)
        }

        button_forward_4 = findViewById(R.id.btn_forward_4)

        button_forward_4.setOnClickListener {
            val intent = Intent(this, Kasida_product_for_users_5  ::class.java)

            startActivity(intent)
        }


    }
}