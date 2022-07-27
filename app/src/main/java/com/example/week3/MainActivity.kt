package com.example.week3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.week3.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var student : Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

            binding.btnSetValue.setOnClickListener(){
                var student :Student = Student("Ali", 20, "RIS")
                binding.myData = student

            }
            binding.btnDisplay.setOnClickListener(){
                var student1 :Student = Student("Yicong", 21, "RSD")
                binding.myData = student1

                binding.apply {
                  invalidateAll()
                }
        }
    }
}