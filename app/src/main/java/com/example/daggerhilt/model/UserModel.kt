package com.example.daggerhilt.model

import java.util.UUID

data class UserModel(private val id: UUID, private val name: String, private val surname: String, private val age: Int) {
    val getName get() = name
    val getSurname get() = surname
    val getAge get() = age.toString()
    val getFullName get() = "$name $surname"
}
