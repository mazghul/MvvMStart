package com.mazghul.myapplication.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.mazghul.myapplication.data.repositories.UserRepository
import com.mazghul.myapplication.util.ApiException
import com.mazghul.myapplication.util.Coroutines

class AuthViewModel : ViewModel() {

    var email: String? = null
    var password: String? = null

    var authListener: AuthListener? = null

    fun onLoginClick(view: View) {
        authListener?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListener?.onFailure("Invalid Email or password")
            return
        }


        Coroutines.main {
            try {
                val response = UserRepository().userLogin(email!!, password!!)
                response.user?.let {
                    authListener?.onSuccess(it)
                    return@main
                }
                authListener?.onFailure(response.message!!)
            } catch (e: ApiException){
                authListener?.onFailure(e.message!!)
            }

        }
    }

}