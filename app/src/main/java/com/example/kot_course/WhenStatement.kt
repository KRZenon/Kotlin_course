package com.example.kot_course

fun main(args: Array<String>) {
    print("Please enter a day number of week: ")
    var day:Int = readLine()!!.toInt()
    var Day:String

    when (day){
        1 -> Day = "Monday"
        2 -> Day = "Tuesday"
        3 -> Day = "Wednesday"
        4 -> Day = "Thursday"
        5 -> Day = "Friday"
        6 -> Day = "Saturday"
        7 -> Day = "Sunday"
        else -> Day = "Invalid day choice"
    }
    println("Today is $Day")
}