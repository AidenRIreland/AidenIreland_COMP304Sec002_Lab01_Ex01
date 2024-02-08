package com.example.aidenireland_comp304sec002_lab01_ex01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText


class OrderDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_details)
        val fullName = intent.getStringExtra("EXTRA_FULL_NAME")
        val email = intent.getStringExtra("EXTRA_EMAIL")
        val address = intent.getStringExtra("EXTRA_ADDRESS")
        val productname = findViewById(R.id.editTextText2)
        val unitprice = findViewById(R.id.unitprice)
        val QuantityNumber = findViewById(R.id.QuantityNumber)
    }
}