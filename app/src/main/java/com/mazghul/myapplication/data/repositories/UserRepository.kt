package com.mazghul.myapplication.data.repositories


import com.mazghul.myapplication.data.network.ApiRequest
import com.mazghul.myapplication.data.network.RetroApi
import com.mazghul.myapplication.data.network.responses.AuthResponse

import retrofit2.Response


class UserRepository : ApiRequest() {

    suspend fun userLogin(email: String, password: String): AuthResponse {

        return apiRequest{ RetroApi().userLogin(email, password)}

        /*val loginResponse = MutableLiveData<String>()
        RetroApi().userLogin(email, password)
            .enqueue(object : Callback<ResponseBody> {
                override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                    loginResponse.value = t.message
                }

                override fun onResponse(
                    call: Call<ResponseBody>,
                    response: Response<ResponseBody>
                ) {

                }

            })
        return loginResponse*/
    }
}