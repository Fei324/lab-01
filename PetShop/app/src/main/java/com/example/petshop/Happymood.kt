package com.example.petshop
// this section i get help with google gemini, "how to do abstract base class in Kotlin"
class Happymood(date: String) : Mood(date) {
    override fun getMood(): String {
        return "Happy"
    }
}
