package com.example.gradledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.adapterdemo.AdapterDemo
import com.example.mylib.Test

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(AdapterDemo().test())
        println(Test().test())
    }
}