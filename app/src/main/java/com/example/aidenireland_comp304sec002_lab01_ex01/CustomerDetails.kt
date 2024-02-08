package com.example.aidenireland_comp304sec002_lab01_ex01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent//Intent class import to request an anction for another class
import android.widget.Button//import button
import android.widget.EditText//import edittext

class CustomerDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_details)
        val loginbutton: Button = findViewById(R.id.loginbutton)
        val editTextFullName: EditText = findViewById(R.id.editTextText)
        val editTextEmail: EditText = findViewById(R.id.editTextTextEmailAddress)
        val editTextAddress: EditText = findViewById(R.id.editTextTextPostalAddress)

        //Event listener
        loginbutton.setOnClickListener {

            //Order Detail activity
            val intent = Intent(this, OrderDetails::class.java)
            //Declare key and value to be imported
            intent.putExtra("EXTRA_FULL_NAME", editTextFullName.text.toString())
            intent.putExtra("EXTRA_EMAIL", editTextEmail.text.toString())
            intent.putExtra("EXTRA_ADDRESS", editTextAddress.text.toString())
            // Start the OrderDetails activity
            startActivity(intent)
        }


    }
}