package com.usermanager.di.modules

import com.usermanager.repository.UserRepository
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun userRepo(): UserRepository{
        return UserRepository()
    }


}