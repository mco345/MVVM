package com.example.mvvm

class Model {
    var password: MutableList<Int> = mutableListOf()

    fun inputPassword(i: Int){
        if(password.size < 4){
            password.add(i)
        }
    }

    fun checkPassword(): Boolean{

        var savePassword = mutableListOf(1,2,3,4)

        return savePassword == password
    }
}