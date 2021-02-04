package com.usermanager.di.modules

import com.usermanager.repository.UserRepository
import com.usermanager.service.UserService
import dagger.Module
import dagger.Provides


@Module
class ServiceModule {

    @Provides
    fun userService(userRepo: UserRepository): UserService{
        return UserService(userRepo)
    }

}