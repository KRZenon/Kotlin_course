package com.example.kot_course

fun main(args: Array<String>) {
    println("Enter number 1:")
    var a:Int = readLine()!!.toInt()
    println("Enter number 2:")
    var b:Int = readLine()!!.toInt()
    show(a,b)
    var s = sum(a,b)
    println("Sum of 2 numbers = $s")
    var m = findMini(a,b)
    println("The minimum number = $m")
}

fun show(a:Int, b:Int){
    println("You entered $a and $b")
}

fun sum(a:Int, b:Int) : Int{
    return a + b
}

fun findMini(a:Int, b:Int) : Int{
    if(a > b){
        return b
    }
    else return a
}