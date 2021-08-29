package com.example.kotlinpractice

fun main() {
    nullcheck()
}
//    4. 조건식

fun maxBy(a : Int, b : Int) : Int {
    if(a > b) {
        return a
    } else {
        return b
    }
}

fun maxBy2(a : Int, b : Int) {
    if(a>b) a else b
}

// 코틀린에서는 함수가 리턴값이 없더라도 Unit을
// 반환시킴

fun checkNum(score : Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
    }

    var b = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : $b")

    when(score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

// Expression vs Statement

//5. array and list

//Array 메모리가 할당되서 나옴.
//        처음에 크기를 지정해줘야함

// List : 수정가능한 리스트(arrayList) / 수정 불가능한 리스트(list)

fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3

    // list는 array와 다르게 인터페이스라서
    // 인덱스 이용해서 값을 가져올 수는 있지만
    // 변경은 불가가
//   list[0] = 2 // 노노

    var result = list.get(0)

    // arrayList는 값을 바꿀 수 있지만
    // 참조값 즉 주소값이 변경되는건 아님
    // 그래서 val(상수)로 사용가능
    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

    // 이런식으로 아예 새로운 객체를 생성해서
    // 할당하는 경우는 val 사용불가
//    arrayList = arrayListOf()


}

// 6. for / while

fun forAndWhile() {
    val students = arrayListOf("joyce", "james", "Jenny", "Jennifer")
    for(name in students) {
        println("$name")
    }

    var sum : Int = 0
    // 1부터 100전(99)까지 돌아감
    // i in 1..100 은 백까지
    for(i in 1 until 100) {
        sum += i
    }
    println(sum)

    for((index, name) in students.withIndex()) {
        println("${index+1}번째 학생 : $name")
    }

    var index = 0
    while(index < 10) {
        println("current index: $index")
        index++
    }
}

// 7. Nullable , NonNull

fun nullcheck() {
    var name : String = "Clara"
    var nullName : String? = null
    var nameInUpperCase = name.toUpperCase()
    var nullNameInUpperCase = nullName?.toUpperCase()

    // ?:

    val lastName : String? = null
    var fullName = name + " " + (lastName?: "No lastName")

}

























