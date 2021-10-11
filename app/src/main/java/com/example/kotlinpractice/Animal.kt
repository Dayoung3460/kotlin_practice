package com.example.kotlinpractice

// abstract 붙이면 Animal 인스턴스 못만듦.
abstract class Animal(
        val name: String,
        val legCount: Int = 4
        ) {
    abstract fun makeSound()
}