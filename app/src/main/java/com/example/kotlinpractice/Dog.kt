package com.example.kotlinpractice

class Dog: Animal("Dog") {
    override fun makeSound() {
        println("wuff")
    }
}