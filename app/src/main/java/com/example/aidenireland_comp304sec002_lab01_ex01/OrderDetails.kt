package com.example.aidenireland_comp304sec002_lab01_ex01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.app.AlertDialog

class OrderDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_details)
        //import
        val fullName = intent.getStringExtra("EXTRA_FULL_NAME")
        val email = intent.getStringExtra("EXTRA_EMAIL")
        val address = intent.getStringExtra("EXTRA_ADDRESS")
        //Declare vals
        val productName: EditText = findViewById(R.id.editTextText2)
        val pricePerUnit: EditText = findViewById(R.id.unitprice)
        val quantity: EditText = findViewById(R.id.QuantityNumber)
        val calculateButton: Button = findViewById(R.id.Calculate)
        val displayTextView: TextView = findViewById(R.id.Display)

        //Event listener for calc
        calculateButton.setOnClickListener {
            try {
                //check for updated vaals
                val _ProductName = productName.text.toString()
                val _PricePerUnit = pricePerUnit.text.toString().toDouble()
                val quantityInt = quantity.text.toString().toInt()
                //check if the quainity is in the right variables
                if (quantityInt < 1 || quantityInt > 10) {
                    showAlertDialog("Please input a quantity between 1 - 10")
                } else {
                    val totalPrice = _PricePerUnit * quantityInt
                    val resultText =
                        "Customer Name: $fullName\n" +
                                "Email: $email\n" + "Address: $address\n" +
                                "Product: $_ProductName\nTotal Price: $$totalPrice"
                    displayTextView.text = resultText
                }
            } catch (e: NumberFormatException) {
                // Handle the case where a number was not entered properly
                showAlertDialog("Please enter valid numbers for price and quantity")
            }
        }

    }
    //Show alert box class, have only the ok button
    private fun showAlertDialog(message: String) {
        AlertDialog.Builder(this)
            .setMessage(message)
            .setPositiveButton("OK") { dialog, _ -> dialog.dismiss() }
            .show()
    }
}