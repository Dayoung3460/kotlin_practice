package com.example.kotlinpractice

class Book private constructor(val id: Int, val name: String) {
    // private 클래스의 메소드나 프로퍼티를 읽어올 수 있게 해줌.
    // 자바의 static 역할을 함
    companion object BookFactory: IdProvider {
        override fun getId(): Int {
            return 444
        }
        val myBook = "new book"
        fun create() = Book(getId(), myBook)
    }
}

interface IdProvider {
    fun getId(): Int
}

fun main() {
    val book = Book.create()
    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name}")
}