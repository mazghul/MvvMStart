package com.mazghul.myapplication.ui.auth

import com.mazghul.myapplication.data.db.entities.User
import com.mazghul.myapplication.data.network.responses.AuthResponse
import retrofit2.Response

interface AuthListener {
    fun onStarted()
    fun onSuccess(user: User)
    fun onFailure(message: String)
}