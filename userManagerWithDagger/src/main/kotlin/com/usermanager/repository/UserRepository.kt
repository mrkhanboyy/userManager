package com.usermanager.repository

import com.usermanager.models.User
import javax.inject.Singleton

@Singleton
class UserRepository {

    companion object {
        var userDatabase: MutableList<User> = mutableListOf()
    }

    fun addUser(user: User): User{
        userDatabase.add(user)
        return user
    }

    fun getUserById(id: Int): User? {
        for(user in userDatabase){
            if(user.getId() == id){
                return user
            }
        }
        return null
    }

    fun getAllUsers(): MutableList<User> {
        return userDatabase
    }

    fun deleteUser(id: Int): User{
        var index:Int = 0
        for(i in 0 until userDatabase.size){
            if(userDatabase[i].getId() == id){
              index = i
                break
            }
        }
       return userDatabase.removeAt(index)
    }

    fun updateUser(user: User): User? {

        var tempUser: User? = null
        for(i in 0 until userDatabase.size){

            //checks if user do not exist then return null
            if(i == (userDatabase.size-1) && userDatabase[i].getId() != user.getId()){
                   tempUser = null
            }

            // if user exist then update user
            if(userDatabase[i].getId() == user.getId()){
                tempUser = userDatabase[i]
                tempUser.setName(user.getName())
                tempUser.setAge(user.getAge())

            }

        }
        return tempUser
    }

}