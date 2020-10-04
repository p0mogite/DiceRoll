package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var first = 0
    var second = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null) {
            first= savedInstanceState.getInt("first")
            second = savedInstanceState.getInt("second")
            setImage(first, second)
        }
        setImage(first, second)
        button.setOnClickListener() {
            roll();
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("first", first)
        outState.putInt("second", second)
    }

    fun roll() {
        first = (1..7).random()
        second = (1..7).random()
        setImage(first, second)
    }

    fun setImage(first1: Int, second1: Int) {
        val first: ImageView = findViewById(R.id.first)
        val second: ImageView = findViewById(R.id.second)
        when(first1) {
            1 -> first.setImageResource(R.drawable.ic_one)
            2 -> first.setImageResource(R.drawable.ic_two)
            3 -> first.setImageResource(R.drawable.ic_three)
            4 -> first.setImageResource(R.drawable.ic_four)
            5 -> first.setImageResource(R.drawable.ic_five)
            6 -> first.setImageResource(R.drawable.ic_six)
        }
        when(second1) {
            1 -> second.setImageResource(R.drawable.ic_one)
            2 -> second.setImageResource(R.drawable.ic_two)
            3 -> second.setImageResource(R.drawable.ic_three)
            4 -> second.setImageResource(R.drawable.ic_four)
            5 -> second.setImageResource(R.drawable.ic_five)
            6 -> second.setImageResource(R.drawable.ic_six)
        }
    }
}