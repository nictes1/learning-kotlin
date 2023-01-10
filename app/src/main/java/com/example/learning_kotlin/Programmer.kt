package com.example.learning_kotlin


class Programmer(val name: String,
                 var age: Int,
                 val languages: Array<Language>,
                 val friends: Array<Programmer>? = null) {

    enum class Language {
        KOTLIN,
        SWIFT,
        JAVA,
        JAVASCRIPT
    }

    fun code() {
        for (language in languages) {
            println("Estoy programando en $language")
        }
    }

}


class Programmer2(name: String, age: Int, val language: String): Person(name, age), Vehicle {

    override fun work() {
        println("Esta persona está programando")
    }

    fun sayLanguage() {
        println("Este programador usa el lenguaje $language")
    }

    override fun goToWork() {
        println("Esta persona va a Google")
    }

    override fun drive() {
        println("Esta persona conduce un coche")
    }

}
