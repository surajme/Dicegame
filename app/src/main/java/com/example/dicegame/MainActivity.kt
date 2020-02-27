package com.example.dicegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)

        //How button will function!
        rollButton.setOnClickListener {

            rollDice() //Method called after button click
        }
    }
    //properties under method call 'rollDice'
    private fun rollDice() {

        val randomInt = Random.nextInt(12) + 1 //Random get numbers b/w 1-6

        //Choose the right drawable resource based on the value of randomInt:
       val drawableResource =  when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val diceImage: ImageView = findViewById(R.id.dice_image)

        //Finally, assign the drawableResource from above to diceImage:
        diceImage.setImageResource(drawableResource)
    }
}
