package com.mazghul.myapplication.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.mazghul.myapplication.R
import com.mazghul.myapplication.databinding.ActivityLoginBinding
import com.mazghul.myapplication.util.toast

class LoginActivity : AppCompatActivity(), AuthListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)
        binding.viewmodel = viewModel

        viewModel.authListener = this
    }

    override fun onStarted() {
        toast("Started")
    }

    override fun onSuccess() {
        toast("Success")
    }

    override fun onFailure(message: String) {
        toast(message)
    }
}
