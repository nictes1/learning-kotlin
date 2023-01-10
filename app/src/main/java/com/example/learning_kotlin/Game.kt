package com.example.learning_kotlin

interface Game {

    val game: String

    fun play()

    fun stream() {
        println("Estoy haciendo stream de mi juego $game")
    }
}