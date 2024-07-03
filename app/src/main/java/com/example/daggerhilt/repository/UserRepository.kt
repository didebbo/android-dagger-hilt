package com.example.daggerhilt.repository

import com.example.daggerhilt.model.UserModel
import java.util.UUID

interface UserRepository {
    fun getData(): UserModel
}

class  UserRepositoryImpl: UserRepository {
    override fun getData(): UserModel = UserModel(UUID.randomUUID(),"Giuseppe","Verdi",36)
}