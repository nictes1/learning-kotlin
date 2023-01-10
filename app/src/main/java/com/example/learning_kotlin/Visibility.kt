package com.example.learning_kotlin

private class Visibility {
    var name: String? = null

    private fun sayMyName() {
        name?.let {
            println("Mi nombre es $it")
        } ?: run {
            println("No tengo nombre")
        }
    }

}

open class VisibilityTwo {
    protected fun sayMyNameTwo() {
        val visibility = Visibility()
        visibility.name = "Nicolas"
    }

}

class VisibilityThree: VisibilityTwo() {
    internal val age: Int? = null
    fun sayMyNameThree() {
        sayMyNameTwo()
    }
}