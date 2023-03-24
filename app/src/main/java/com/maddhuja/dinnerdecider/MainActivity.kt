package com.maddhuja.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Random

class MainActivity : AppCompatActivity() {
    val foodList = arrayListOf("Chinese", "Pizza", "KFC","Momo")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decideBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            if (newFood.isEmpty() || newFood.isBlank()){
                Toast.makeText(applicationContext, "Enter a food name", Toast.LENGTH_SHORT).show()

            }
            else {
                foodList.add(newFood)
            }

            addFoodTxt.text.clear()
        }




    }
}