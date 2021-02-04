package com.usermanager.service

import com.usermanager.exceptions.userexception.InvalidUserDataException
import com.usermanager.exceptions.userexception.UserNotFoundException
import com.usermanager.models.User
import com.usermanager.repository.UserRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class  UserService @Inject constructor(
    private val userRepo: UserRepository
){

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
            throw InvalidUserDataException("name cannot be null or blank")
        }
        if(user.getAge() < 1){
            throw InvalidUserDataException("invalid age")
        }
    }

}