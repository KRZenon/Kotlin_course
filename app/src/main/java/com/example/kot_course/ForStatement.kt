package com.example.kot_course

fun main(args: Array<String>) {
    /*for(number in 1 .. 10){
        println(number)
    }*/
   /* println("------------------------------------")
    var sum:Int = 0
    for(x in 0..5){
        println(x)
        sum += x
    }
    println("Sum of num: $sum")*/
    /*println("------------------------------------")
    var sum:Int = 0
    for(x in 0..5){
        if(x % 2 == 0){
            println(x)
            sum += x
        }
    }
    println("Sum of the even num: $sum")*/
    /*var myNumA = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    for(y in 0..(myNumA.size)-1){
        println("myNumA[$y] = ${myNumA[y]}" )
    }*/
    /*var myNumA = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    for(y in myNumA.indices){
        println("myNumA[$y] = ${myNumA[y]}" )
    }*/
    var myNumA = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    myNumA.forEach { println(it)}
}