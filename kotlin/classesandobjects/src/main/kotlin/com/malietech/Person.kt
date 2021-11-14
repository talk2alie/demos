package com.malietech

interface Signatory {
    fun sign()
}

open class Person(val name: String, var age: Int, var isMarried: Boolean = false) : Signatory {
    override fun sign() = println("I, $name, aged, $age, can sign documents")

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val p = Person("Kevin", 21)
            p.sign()

            p.age = 38
            p.sign()

            Person.add(5)
        }

        fun add(num: Int) {
            print(num)
        }
    }
}

class Student(name: String, age: Int) : Person(name, age) {
    var height: Double = 0.0

    constructor(name: String, age: Int, height: Double): this(name, age) {
        this.height = height
    }
}

fun main(args: Array<String>) {
    val p = Person("Kevin", 21)
    p.sign()

    p.age = 38
    p.sign()

    Person.add(10)
    println()

    val user = User("Kevin", 1)
    println(user)

    val otherUser = user.copy(id = 2)
    println(otherUser)
}


data class User(val name: String, val id: Int) {
    override fun toString(): String {
        return "$name, $id"
    }
}

