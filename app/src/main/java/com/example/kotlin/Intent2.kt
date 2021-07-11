package com.example.kotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent2.*

class Intent2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)


        btn_result.setOnClickListener {
            val num1 = intent.getIntExtra("num1", 0)
            val num2 = intent.getIntExtra("num2", 0)

            Log.d("num", num1.toString())
            Log.d("num", num2.toString())

            val result = num1 + num2
            val resultIntent = Intent()
            resultIntent.putExtra("result", result)

            setResult(Activity.RESULT_OK, resultIntent)
            finish() // -> 액티비티 종료


            //Stack 이라는 개념이다.
            //(2) 인텐트2    -> finish (종료됨)
            //(1) 인텐트1                      ( 3)인텐트 1


        }

    }


}