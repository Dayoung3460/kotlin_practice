package com.example.kotlinpractice

// open 해줘야 오버라이딩 해줄 수 있음
// name: 주생성자. 생성자 파라미터를 지정하고
// 그 생성자 파라미터에 의해 초기화되는 프로퍼티를 정의.
// 코틀린의 클래스는 하나의 주생성자와 다수의 부생성자 가실 주 있음
//
open class Human(val name : String = "anonymous"){
    // 부생성자. 기본 상속자를 상속받아야함
    // name 받아 먹어야함
    constructor(name : String, age : Int) : this(name) {
        println("my name is ${name}, ${age}years old")
    }
 // 주 생성자. 가장 먼저 생성됨/ 초기화 코드 넣어주면 됨.
    init {
        println("New human has been born")
    }

    fun eatingCake() {
        println("this is so yummy")
    }

    open fun singASong() {
        println("lalala")
    }
}

class Korean : Human() {
    override fun singASong() {
        super.singASong()
        println("라라라")
        println("my name is ${name}")
    }

}

fun main() {
    val korean = Korean()
    korean.singASong()
//    var human = Human("Clara")
//    var stranger = Human()
//    human.eatingCake()
//    val mom = Human("Kuri", 52)
//    println("this human's name is ${stranger.name}")
}
