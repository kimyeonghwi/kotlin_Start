package com.example.kotlin

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentOne:Fragment(){

    override fun onAttach(context: Context) {
        Log.d("life_Cycle" , "F onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("life_Cycle" , "F onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("life_Cycle" , "F onCreateView")
        //프래그먼트가 인터페이스를 처음으로 그릴때 호출된다.
        //inflater -> 뷰를 그려주는 역활
        //container -> 부모뷰 내가 들어갈곳

        return inflater.inflate(R.layout.fragment_one ,container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("life_Cycle" , "F onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("life_Cycle" , "F onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("life_Cycle" , "F onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("life_Cycle" , "F onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("life_Cycle" , "F onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("life_Cycle" , "F onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("life_Cycle" , "F onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("life_Cycle" , "F onDetach")
        super.onDetach()
    }

}
