package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var rollBtn :Button
    lateinit var numberText: TextView
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollBtn = findViewById(R.id.rollBtn)
        val rollBtn: Button = findViewById(R.id.rollBtn)
        numberText =findViewById(R.id.numberTextView)
        diceImage = findViewById(R.id.diceImage)

        rollBtn.setOnClickListener{ rollDice() }

    }
    private fun rollBtn(){
        val randomInt =(1..6).random()

        val drawableResources = when(randomInt){
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
        }



        val numberText: TextView= findViewById(R.id.numberTextView)
        Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT.show())
        numberText.text=randomInt.toString()

    }
}