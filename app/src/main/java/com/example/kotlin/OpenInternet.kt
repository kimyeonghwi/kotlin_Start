package com.example.kotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import kotlinx.android.synthetic.main.activity_open_internet.*

class OpenInternet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_internet)


        btn.setOnClickListener {
            val address = edt.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }

        edt.addTextChangedListener(object : TextWatcher {

            // 전에 입력했던 글자
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("edt" , "beforeTextChanged :" + s)

            }

            //
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("edt" , "onTextChanged :" + s)
            }

            //
            override fun afterTextChanged(s: Editable?) {
                Log.d("edt" , "afterTextChanged :" + s)
                if(s.toString() == "abc"){
                    Log.d("edt" , "text is abc")
                }
            }
        })

    }
}