package com.example.kot_course

import kotlin.random.Random

fun main(args: Array<String>) {
    val num = Random.nextInt(0,100)
    println("Please enter a number")

    while(true){
        val uGuess:Int = readLine()!!.toInt()
        if(uGuess == num){
            println("Congratulation, you know the number in my mind")
            break
        }
        else if(uGuess < num){
            println("Increase the number")
        }
        else println("Decrease the number")
    }
}