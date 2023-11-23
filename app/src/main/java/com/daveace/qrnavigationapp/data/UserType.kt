package com.daveace.qrnavigationapp.data

import com.daveace.qrnavigationapp.data.DefaultInstance.Companion.newInstance

data class UserType(
    val id:Int = 0,
    val name:String = "",
    val user: User = newInstance(User::class) as User
) {

    enum class Type(private val type:String){
        ADULT("Adult"),
        CHILD("Child"),
        STUDENT("Student"),
        STAFF("Staff");

        fun type():String = type
    }
}