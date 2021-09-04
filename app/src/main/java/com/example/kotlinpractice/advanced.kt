package com.example.kotlinpractice

// 1. Lamda
// 람다식은 value처럼 다룰 수 있는 익명함수
// 메소도의 파라미터로 넘겨줄 수 있음
// 리턴 값으로 사용할 수 있음.
// val lamdaName : Type = {argumentList -> codeBody}

val square: (Int) -> (Int) = {
    number -> number * number
}

val nameAge = {name: String, age: Int ->
    "my name is $name I am $age"
}

fun main() {
    println(square(2))
    println(nameAge("Clara", 29))
    val a = "Clara said"
    val b = "mac said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana", 27))
    println(calculateGrade(980))

    val lamda = {number: Double ->
        number === 4.3213
    }
    println(invokeLamda({it > 3.22}))

    println(invokeLamda{it > 3.22})
}

// 확장함수


val pizzaIsGreat : String.() -> String = {
    this + "pizza is the best"
}

fun extendString(name: String, age: Int): String {
    val introduceMyself: String.(Int) -> String = {
        "I am $this and $it years old"
    }
    return name.introduceMyself(age)
}
// 람다의 리턴

val calculateGrade: (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 람다를 표현하는 여러가지 방법
fun invokeLamda(lamda: (Double) -> Boolean): Boolean {
    return lamda(5.2343)
}








