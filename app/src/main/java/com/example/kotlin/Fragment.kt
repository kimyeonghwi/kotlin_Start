package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Fragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        Log.d("life_Cycle" , "onCreate")
    }


    override fun onStart() {
        super.onStart()
        Log.d("life_Cycle" , "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("life_Cycle" , "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("life_Cycle" , "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("life_Cycle" , "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("life_Cycle" , "onDestroy")
    }
}