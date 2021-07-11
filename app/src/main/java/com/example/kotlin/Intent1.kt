package com.example.kotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent.*

class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        val banana = 10
        val b = banana + 10


        btn_start.setOnClickListener {
//============================== 1번 실습(명시적인텐트) ======================
          /*  this 나 this@Intent1 같은 의미이다. 근데 그냥 this하는거보다 @해서 작성하는게 더욱 정확하다.
            val intent = Intent(this@Intent1 , Intent2::class.java)
            intent.putExtra("num1" ,1)
            intent.putExtra("num2" ,2)
            startActivity(intent)
*/
//============================== 2번 실습 (명시적인텐트) ======================
            // 코틀린에서 사용하는 방법이다.
            //어플라이를 통해서 인텐트를 통해 작업한것들을 전부 내포하고 있다 라고 생각하면 된다.
            //나중에 유지 보수시에 잘 작동하게 하기위함
      /*      val intent2 = Intent(this@Intent1, Intent2::class.java)
            intent2.apply {
                this.putExtra("num1" ,1)
                this.putExtra("num2" ,2)
            }

            startActivityForResult(intent2,200)
*/
//============================== 2번 실습 (암시적인텐트) ======================
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
            startActivity(intent)
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode==200 && resultCode == RESULT_OK){
            Log.d("num", "111")
            Log.d("num", ""+requestCode)
            Log.d("num", ""+resultCode)
            var result = data?.getIntExtra("result" ,0)
            Log.d("num", ""+result)
        }



    }

}