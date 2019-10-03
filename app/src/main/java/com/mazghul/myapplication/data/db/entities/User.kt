package com.mazghul.myapplication.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

const val CURRENT_USER_ID = 0

@Entity
data class User(
    val created_at: String,
    val email: String,
    val email_verified_at: String,
    val id: Int,
    val name: String,
    val updated_at: String
){
    @PrimaryKey(autoGenerate = false)
    var uid: Int = CURRENT_USER_ID
}