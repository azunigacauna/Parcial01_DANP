package com.parcial01.loginapplication

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contact(
    val name: String,
    val email: String,
    val phone: String,
    val password: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
