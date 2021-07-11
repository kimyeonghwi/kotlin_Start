package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*
import kotlinx.android.synthetic.main.activity_linstener.*

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        var new = "0"
        var old = "0"

        one.setOnClickListener {
            new = new + "1"
            text.setText(new)
        }
        two.setOnClickListener {
            new = new + "2"
            text.setText(new)
        }
        three.setOnClickListener {
            new = new + "3"
            text.setText(new)
        }
        four.setOnClickListener {
            new = new + "4"
            text.setText(new)
        }
        five.setOnClickListener {
            new = new + "5"
            text.setText(new)
        }
        six.setOnClickListener {
            new = new + "6"
            text.setText(new)
        }
        seven.setOnClickListener {
            new = new + "7"
            text.setText(new)
        }
        eight.setOnClickListener {
            new = new + "8"
            text.setText(new)
        }
        nine.setOnClickListener {
            new = new + "9"
            text.setText(new)
        }
        zero.setOnClickListener {
            new = new + "0"
            text.setText(new)
        }

        ac.setOnClickListener {
            new = "0"
            old = "0"
            text.setText(new)
        }

        plus.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            new = "0"
            text.setText(old)
        }


    }
}