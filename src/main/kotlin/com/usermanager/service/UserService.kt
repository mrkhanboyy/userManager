package com.usermanager.service

import com.usermanager.exceptions.InvalidUserDataException
import com.usermanager.exceptions.UserNotFoundException
import com.usermanager.models.User
import com.usermanager.repository.UserRepository

class  UserService {

    private val userRepo = UserRepository()

    /**
     *
     */
    fun addUser(user: User): User {
        validateUserData(user)
        return userRepo.addUser(user)
    }

    /**
     *
     */
    fun getUserById(id: Int): User? {
       var user: User? = userRepo.getUserById(id)
        if(user == null) {
            print("user with $id not found")
            throw UserNotFoundException("user with id: $id not found")
        }
        return user
    }

    /**
     *
     */
     fun getAllUsers(): MutableList<User> {
        return userRepo.getAllUsers()
     }

    /**
     *
     */
    fun deleteUserById(id: Int): User {
        var user: User = userRepo.deleteUser(id)
        if(user == null) {
            print("user with $id not found")
            throw UserNotFoundException("user with id: $id not found")
        }
        return user
    }

    /**
     *
     */
    fun updateUser(user: User): User{
        validateUserData(user)
        var tempUser: User? = userRepo.updateUser(user)
        if(tempUser == null){
            println("user not found with id: ${user.getId()}")
            throw UserNotFoundException("user with id: ${user.getId()} not found")
        }
        return tempUser
    }

    /**
     *
     */
    private fun validateUserData(user: User){
        if(user.getName() == null || user.getName().isEmpty()){
            println("name cannot be null or blank")
            throw InvalidUserDataException("name cannot be null or black")
        }
        if(user.getAge() < 1){
            println("invalid age")
            throw InvalidUserDataException("invalid age")
        }
    }

}