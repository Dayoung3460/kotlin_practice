package com.example.kotlinpractice

import java.lang.Exception

fun main() {
//    val list = listOf("kotlin", "is", "fun")
//    val count = list.count {  }
}

fun Int.isOdd(): Boolean {
    return this % 2 === 1
}

fun isEven(number: Int = 10): Boolean {
    return number % 2 === 0
}

fun print10Numbers() {
    for(i in 1..10) {
        println(i)
    }
}
