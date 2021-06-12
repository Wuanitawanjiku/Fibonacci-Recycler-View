package com.example.fibanoccirecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fibo(100)
    }
    fun fibo(nthTerm:Int): MutableList <Int>{
        var mutableList = mutableListOf<Int>()
        var rvNumber = findViewById<RecyclerView>(R.id.rvNumbers)
        rvNumber.layoutManager = LinearLayoutManager(baseContext)
        var numberAdapter =fibonacci(mutableList)
        rvNumber.adapter = numberAdapter

        var num1= 0
        var num2=1
        var count=1
        println("Upto $nthTerm: ")
        while (count <= nthTerm) {
            println("$count: $num1+ ")
            var sum = num1 + num2
            num1 = num2
            num2 = sum
            count++
            mutableList.add(num1)
        }
        return mutableList
    } }


