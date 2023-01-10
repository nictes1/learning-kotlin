package com.example.learning_kotlin

class Designer (name: String, age: Int): Person(name, age) {
    override fun work(){
        println("Esta persona esta escribiendo")
        super.work()
    }
}