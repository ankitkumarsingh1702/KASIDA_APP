package com.example.kasida

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Kasida_product_for_users : AppCompatActivity() {

    private  lateinit var button_1:Button
    private  lateinit var button_3:Button
    private  lateinit var button_4:Button

    private lateinit var button_forward: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kasida_product_for_users)


        supportActionBar?.hide()

        val text_product3_description: TextView = findViewById( R.id.text_product3_description)

        text_product3_description.movementMethod = LinkMovementMethod.getInstance()
        text_product3_description.setLinkTextColor(Color.BLACK)


        val text_product1_description: TextView = findViewById( R.id.text_product1_description)

        text_product1_description.movementMethod = LinkMovementMethod.getInstance()
        text_product1_description.setLinkTextColor(Color.BLACK)

        val text_product2_description: TextView = findViewById( R.id.text_product2_description)

        text_product2_description.movementMethod = LinkMovementMethod.getInstance()
        text_product2_description.setLinkTextColor(Color.BLACK)

        button_1 = findViewById(R.id.btn_1)

        button_1.setOnClickListener {
            val intent = Intent(this, Kasida_taking_input_from_users::class.java)

            startActivity(intent)
        }


        button_3 = findViewById(R.id.btn_3)

        button_3.setOnClickListener {
            val intent = Intent(this, Kasida_taking_input_from_users::class.java)

            startActivity(intent)
        }


        button_4 = findViewById(R.id.btn_4)

        button_4.setOnClickListener {
            val intent = Intent(this, Kasida_taking_input_from_users::class.java)

            startActivity(intent)
        }

        button_forward = findViewById(R.id.btn_forward)

        button_forward.setOnClickListener {
            val intent = Intent(this, Kasida_product_for_users_1::class.java)


            startActivity(intent)
    }
 }
}