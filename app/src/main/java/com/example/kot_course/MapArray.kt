package com.example.kot_course

fun main(args: Array<String>) {
    var age = mapOf<String,Int>("david" to 20, "ronaldo" to 25)
    println("age of david: " + age["david"])
    println("age of ronaldo: " + age["ronaldo"])
    println("-----------------------------")
    var mutableAge = mutableMapOf<String,Int>("david" to 20, "ronaldo" to 25)
    mutableAge.put("buffon",30)
    println("age of david: " + mutableAge["david"])
    println("age of ronaldo: " + mutableAge["ronaldo"])
    println("age of Buffon: " + mutableAge.get("buffon"))
}
