package com.mazghul.myapplication.data.network.responses

import com.mazghul.myapplication.data.db.entities.User

data class AuthResponse(
    val isSuccessful: Boolean?,
    val message: String?,
    val user: User?
)