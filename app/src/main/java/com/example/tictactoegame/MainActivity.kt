package com.example.tictactoegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var button1:Button
    private lateinit var button2:Button
    private lateinit var button3:Button
    private lateinit var button4:Button
    private lateinit var button5:Button
    private lateinit var button6:Button
    private lateinit var button7:Button
    private lateinit var button8:Button
    private lateinit var button9:Button
    private var count=0
    private var flag=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        button1=findViewById(R.id.btn1)
        button2=findViewById(R.id.btn2)
        button3=findViewById(R.id.btn3)
        button4=findViewById(R.id.btn4)
        button5=findViewById(R.id.btn5)
        button6=findViewById(R.id.btn6)
        button7=findViewById(R.id.btn7)
        button8=findViewById(R.id.btn8)
        button9=findViewById(R.id.btn9)
       
    }
    fun done(view:View){
        val btnCurrent=view as Button
        if(btnCurrent.text==""){
            count++

            if (flag==0){
                btnCurrent.text="X"
                flag=1
            }else{
                btnCurrent.text="O"
                flag=0
            }

            val b1=button1.text.toString()
            val b2=button2.text.toString()
            val b3=button3.text.toString()
            val b4=button4.text.toString()
            val b5=button5.text.toString()
            val b6=button6.text.toString()
            val b7=button7.text.toString()
            val b8=button8.text.toString()
            val b9=button9.text.toString()



            if(b1==b2 && b2==b3 && b3!=""){
                ProgressBar.SCROLL_AXIS_HORIZONTAL
                Toast.makeText(this,"Winner is $b1",Toast.LENGTH_SHORT).show()
                reset()
            }
            else if(b4==b5 && b5==b6 && b6!=""){
                ProgressBar.SCROLL_AXIS_HORIZONTAL
                Toast.makeText(this,"Winner is $b4",Toast.LENGTH_SHORT).show()
                reset()
            }
            else if(b7==b8 && b8==b9 && b9!=""){
                ProgressBar.SCROLL_AXIS_HORIZONTAL
                Toast.makeText(this,"Winner is $b7",Toast.LENGTH_SHORT).show()
                reset()
            }
            else if(b1==b4 && b4== b7 && b7!=""){
                ProgressBar.SCROLL_AXIS_HORIZONTAL
                Toast.makeText(this,"Winner is $b1",Toast.LENGTH_SHORT).show()
                reset()
            }
            else if(b2==b5 && b5== b8 && b8!=""){
                ProgressBar.SCROLL_AXIS_HORIZONTAL
                Toast.makeText(this,"Winner is $b2",Toast.LENGTH_SHORT).show()
                reset()
            }
            else if(b3==b6 && b6== b9 && b9!=""){
                ProgressBar.SCROLL_AXIS_HORIZONTAL
                Toast.makeText(this,"Winner is $b3",Toast.LENGTH_SHORT).show()
                reset()
            }
            else if(b1==b5 && b5== b9 && b9!=""){
                ProgressBar.SCROLL_AXIS_HORIZONTAL
                Toast.makeText(this,"Winner is $b9",Toast.LENGTH_SHORT).show()
                reset()
            }
            else if(b3==b5 && b5== b7 && b7!=""){
                ProgressBar.SCROLL_AXIS_HORIZONTAL
                Toast.makeText(this,"Winner is $b7",Toast.LENGTH_SHORT).show()
                reset()
            }
            else if(count==9){
                Toast.makeText(this,"Drawn",Toast.LENGTH_SHORT).show()
                reset()
            }
        }
    }
    private fun reset(){
        button1.text=""
        button2.text=""
        button3.text=""
        button4.text=""
        button5.text=""
        button6.text=""
        button7.text=""
        button8.text=""
        button9.text=""
        flag=0
        count=0
    }




}