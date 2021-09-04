package com.example.kotlinpractice

data class Ticket(val companyName: String, val name: String, var data: String, val seatNumber: Int)
// toString(), hashCode(), equals(), copy()

fun main() {
    val ticketA = Ticket("koreanAir", "Clara", "2021-10-10", 14)
}
