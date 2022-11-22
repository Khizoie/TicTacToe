package com.example.tictactoebykhizo

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.tictactoebykhizo.R.color.purple_700

class MainActivity : AppCompatActivity(), View.OnClickListener{
    private lateinit var button1 : Button
    private lateinit var button2 : Button
    private lateinit var button3 : Button
    private lateinit var button4 : Button
    private lateinit var button5 : Button
    private lateinit var button6 : Button
    private lateinit var button7 : Button
    private lateinit var button8 : Button
    private lateinit var button9 : Button

    private lateinit var reset : Button

    private lateinit var score1: TextView
    private lateinit var score2: TextView
    private lateinit var player1: TextView
    private lateinit var player2: TextView

    var activePlayer = 1

    private var firstPlayer = ArrayList<Int>()
    private var secondPlayer = ArrayList<Int>()



    var gameActive = true

    var count = 0

    private var firstScore = 0
    private var secondScore = 0




    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        init()}
    private fun init(){
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)

        reset = findViewById(R.id.reset)

        score1 = findViewById(R.id.score1)
        score2 = findViewById(R.id.score2)


        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)

        reset.setOnClickListener(this)





    }
    override fun onClick(clickedView: View?) {


        var buttonNumber = 0

        if (clickedView is Button){
            when (clickedView.id) {

                R.id.reset -> reset()
                R.id.button1 -> buttonNumber = 1
                R.id.button2 -> buttonNumber = 2
                R.id.button3 -> buttonNumber = 3
                R.id.button4 -> buttonNumber = 4
                R.id.button5 -> buttonNumber = 5
                R.id.button6 -> buttonNumber = 6
                R.id.button7 -> buttonNumber = 7
                R.id.button8 -> buttonNumber = 8
                R.id.button9 -> buttonNumber = 9


            }
        }
        if (buttonNumber != 0){
            playGame(buttonNumber, clickedView as Button)
        }

    }

    @SuppressLint("ResetColor", "ResourceAsColor")

    private fun reset(){
        button1.text = ""
        button1.setBackgroundColor(purple_700)
        button1.isEnabled = true
        button2.text = ""
        button2.setBackgroundColor(purple_700)
        button2.isEnabled = true
        button3.text = ""
        button3.setBackgroundColor(purple_700)
        button3.isEnabled = true
        button4.text = ""
        button4.setBackgroundColor(purple_700)
        button4.isEnabled = true
        button5.text = ""
        button5.setBackgroundColor(purple_700)
        button5.isEnabled = true
        button6.text = ""
        button6.setBackgroundColor(purple_700)
        button6.isEnabled = true
        button7.text = ""
        button7.setBackgroundColor(purple_700)
        button7.isEnabled = true
        button8.text = ""
        button8.setBackgroundColor(purple_700)
        button8.isEnabled = true
        button9.text = ""
        button9.setBackgroundColor(purple_700)
        button9.isEnabled = true

        firstPlayer.clear()
        secondPlayer.clear()
        activePlayer = 1
    }


    private fun playGame(buttonNumber: Int, clickedView: Button) {




        count++


        if (!gameActive)
            return











        if (activePlayer == 1){
            clickedView.text = "X"
            clickedView.setBackgroundColor(Color.GREEN)
            activePlayer = 2
            firstPlayer.add(buttonNumber)
        }else if (activePlayer == 2){
            clickedView.text = "0"
            clickedView.setBackgroundColor(Color.RED)
            activePlayer = 1
            secondPlayer.add(buttonNumber)
        }
        clickedView.isEnabled = false

        check()

    }

    private fun check() {

        var winnerPlayer = 0
        if (firstPlayer.contains(1) && firstPlayer.contains(2) && firstPlayer.contains(3)) {
            winnerPlayer = 1
            firstScore += 1
            score1.text = firstScore.toString()
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(2) && secondPlayer.contains(3)) {
            winnerPlayer = 2
            secondScore += 1
            score2.text = secondScore.toString()
        }
        if (firstPlayer.contains(4) && firstPlayer.contains(5) && firstPlayer.contains(6)) {
            winnerPlayer = 1
            firstScore += 1
            score1.text = firstScore.toString()
        }
        if (secondPlayer.contains(4) && secondPlayer.contains(5) && secondPlayer.contains(6)) {
            winnerPlayer = 2
            secondScore += 1
            score2.text = secondScore.toString()
        }
        if (firstPlayer.contains(7) && firstPlayer.contains(8) && firstPlayer.contains(9)) {
            winnerPlayer = 1
            firstScore += 1
            score1.text = firstScore.toString()
        }
        if (secondPlayer.contains(7) && secondPlayer.contains(8) && secondPlayer.contains(9)) {
            winnerPlayer = 2
            secondScore += 1
            score2.text = secondScore.toString()
        }
        if (firstPlayer.contains(1) && firstPlayer.contains(4) && firstPlayer.contains(7)) {
            winnerPlayer = 1
            firstScore += 1
            score1.text = firstScore.toString()
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(4) && secondPlayer.contains(7)) {
            winnerPlayer = 2
            secondScore += 1
            score2.text = secondScore.toString()
        }
        if (firstPlayer.contains(2) && firstPlayer.contains(5) && firstPlayer.contains(8)) {
            winnerPlayer = 1
            firstScore += 1
            score1.text = firstScore.toString()
        }
        if (secondPlayer.contains(2) && secondPlayer.contains(5) && secondPlayer.contains(8)) {
            winnerPlayer = 2
            secondScore += 1
            score2.text = secondScore.toString()
        }
        if (firstPlayer.contains(3) && firstPlayer.contains(6) && firstPlayer.contains(9)) {
            winnerPlayer = 1
            firstScore += 1
            score1.text = firstScore.toString()
        }
        if (secondPlayer.contains(3) && secondPlayer.contains(6) && secondPlayer.contains(9)) {
            winnerPlayer = 2
            secondScore += 1
            score2.text = secondScore.toString()
        }
        if (firstPlayer.contains(1) && firstPlayer.contains(5) && firstPlayer.contains(9)) {
            winnerPlayer = 1
            firstScore += 1
            score1.text = firstScore.toString()
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(5) && secondPlayer.contains(9)) {
            winnerPlayer = 2
            secondScore += 1
            score2.text = secondScore.toString()
        }
        if (firstPlayer.contains(3) && firstPlayer.contains(5) && firstPlayer.contains(7)) {
            winnerPlayer = 1
            firstScore += 1
            score1.text = firstScore.toString()
        }
        if (secondPlayer.contains(3) && secondPlayer.contains(5) && secondPlayer.contains(7)) {
            winnerPlayer = 2
            secondScore += 1
            score2.text = secondScore.toString()
        }

        if (winnerPlayer == 1){
            Toast.makeText(applicationContext, "Player 1 won", Toast.LENGTH_SHORT).show()
            gameActive = false
        }

        else if (winnerPlayer == 2){
            Toast.makeText(applicationContext, "Player 2 won", Toast.LENGTH_SHORT).show()
            gameActive = false
        }else if(count == 9)
            Toast.makeText(applicationContext, "It's a draw", Toast.LENGTH_SHORT).show()





    }

}

private fun Button.setOnClickListener(mainActivity: MainActivity) {}

