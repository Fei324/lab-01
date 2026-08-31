package com.example.petshop

class Happymood(date: String) : Mood(date) {
    override fun getMood(): String {
        return "Happy"
    }
}