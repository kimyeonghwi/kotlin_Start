package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_linstener.*


class Linstener : AppCompatActivity() {
    var number = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linstener)

        // 첫번쨰 방법
        // val textView : TextView = findViewById(R.id.hello)

        //두번째 방법 아이디 바로 가져와서 사용하는 방법
        //람다 익명함수를 짧게 축약 시긴 것이라고 생각하면 된다.


        //익명함수에 대해서...
        //1 -> 람다 방식
        hello.setOnClickListener {
            Log.d("click", "click!")
        }
        //2 -> 익명 함수 방식
        hello.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("click", "click!")
            }
        })
        //3 -> 이름이 필요한 경우 (click)
        val click = object: View.OnClickListener{
            override fun onClick(v: View?) {

                hello.setText("안녕하세요")
                image.setImageResource(R.drawable.mulok);
                number +=10
                Log.d("click", number.toString())
            }
        }

        hello.setOnClickListener(click)








    }
}