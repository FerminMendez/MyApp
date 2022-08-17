package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myTxt: String
        var myTextView = findViewById<TextView>(R.id.textView)
        var myEditText = findViewById<EditText>(R.id.editTxt)
        var myButton = findViewById<Button>(R.id.button)

        myButton.setOnClickListener {
            myTxt= myEditText.text.toString()
            myTextView.setText(myTxt)
        }
    }
}