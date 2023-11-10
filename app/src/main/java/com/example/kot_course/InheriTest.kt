package com.example.kot_course

fun main(args: Array<String>) {
    var car = Car()
    car.type = "Car"
    car.model = "Ferrari"
    car.maxSpeed = 320

    car.show()

    var motor = Motorcycle()
    motor.type = "Motorcycle"
    motor.model = "Yamaha"
    motor.maxSpeed = 180

    motor.show()
}