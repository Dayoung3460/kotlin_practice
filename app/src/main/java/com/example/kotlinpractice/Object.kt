package com.example.kotlinpractice
// object는 클래스와 달리 앱 실행 시 딱 한번 객체 생성/실행됨. 싱글톤 패턴.
// object는 두가지 방법으로 쓰임
// 싱글턴 클래스를 만들 때
// 익명 클래스 객체를 만들 때
object CarFactory {
    val cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int): Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower: Int)

fun main() {
    var car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}