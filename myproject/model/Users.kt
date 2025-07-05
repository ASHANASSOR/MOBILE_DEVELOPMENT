package com.example.myproject.model

data class Users(

    val name: String,
    val email: String,
    val password: String
) {
    val id: Long
        get() {
            TODO()
        }
}
