package com.example.sd_finals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fun main(args: Array<String>) {
            print("Enter text: ")

            val stringInput = readLine()!!
            println("You entered: $stringInput")
        }

    }
}