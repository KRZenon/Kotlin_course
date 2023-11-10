package com.example.kot_course

fun main(args: Array<String>) {
   /* print("Please enter your age: ")
    var a:Int = readLine()!!.toInt()
    if(a < 13){
        println("You are a child")
    }
    else if (a < 19){
        println("You are a teenager")
    }
    else {
        if (a < 65) {
            println("You are an adult")
        }
        else println("You are a senior")
    }*/
    print("Please enter 3 number: ")
    var num1:Int = readLine()!!.toInt()
    var num2:Int = readLine()!!.toInt()
    var num3:Int = readLine()!!.toInt()

    var max:Int = 0

    if(num1 >= num2){
        if(num1 >= num3){
            max = num1
        }
        else max = num3
    }
    else{
        if(num2 >= num3){
            max = num2
        }
        else max = num3
    }
    println("The larghest number is $max")
}