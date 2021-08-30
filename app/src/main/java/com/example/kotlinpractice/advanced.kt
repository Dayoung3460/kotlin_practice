package com.example.kotlinpractice

// 1. Lamda
// 람다식은 value처럼 다룰 수 있는 익명함수
// 메소도의 파라미터로 넘겨줄 수 있음
// 리턴 값으로 사용할 수 있음.
// val lamdaName : Type = {argumentList -> codeBody}

val square: (Int) -> (Int) = {
    number -> number * number
}

fun main() {
    println(square(2))
}