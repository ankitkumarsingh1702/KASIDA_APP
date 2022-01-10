package com.example.kasida

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView


import com.razorpay.Checkout
import com.razorpay.PaymentResultListener
import org.json.JSONObject


class Kasida_taking_input_from_users : AppCompatActivity(), PaymentResultListener {


    lateinit var pay: Button
    lateinit var card: CardView
    lateinit var success: TextView
    lateinit var failed : TextView

    private  lateinit var btn_feedback: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kasida_taking_input_from_users)
        supportActionBar?.hide()



        btn_feedback = findViewById(R.id.button_feedback)

        btn_feedback.setOnClickListener {
            val intent = Intent(this,Feedback_kasida::class.java)
            finish()
            startActivity(intent)
        }

        val text_contact_of_users : TextView = findViewById( R.id.text_contact_of_users)

        text_contact_of_users.movementMethod = LinkMovementMethod.getInstance()
        text_contact_of_users.setLinkTextColor(Color.BLUE)



        pay = findViewById(R.id.btn_pay_now)

        pay.setOnClickListener {
            makePayment()
        }



    }

    private fun makePayment() {

        val co = Checkout()

        try {
            val options = JSONObject()
            options.put("name","K_A_S_I_D_A")
            options.put("description","A Big Business Start Small....")
            //You can omit the image option to fetch the image from dashboard
            options.put("image","https://s3.amazonaws.com/rzp-mobile/images/rzp.png")
            options.put("theme.color", "#3399cc");
            options.put("currency","INR");

            options.put("amount","30000")//pass amount in currency subunits


            val prefill = JSONObject()
            prefill.put("email","")
            prefill.put("contact","")

            options.put("prefill",prefill)
            co.open(this,options)
        }catch (e: Exception){
            Toast.makeText(this,"Error in payment: "+ e.message,Toast.LENGTH_LONG).show()
            e.printStackTrace()
        }
    }
    override fun onPaymentSuccess(p0: String?) {
        Toast.makeText(this," payment successful $p0", Toast.LENGTH_LONG).show()
        pay = findViewById(R.id.btn_pay_now)
        pay.visibility = View.GONE
        card = findViewById(R.id.cardView)
        card.visibility = View.GONE
        success = findViewById(R.id.success)
        success.visibility = View.VISIBLE
    }

    override fun onPaymentError(p0: Int, p1: String?) {
        Toast.makeText(this,"Error in $p1", Toast.LENGTH_LONG).show()
        failed = findViewById(R.id.success)
        failed.visibility = View.VISIBLE
    }
}

