package com.example.petshop

class Sadmood(date: String) : Mood(date) {
    override fun getMood(): String {
        return "Sad"
    }
}