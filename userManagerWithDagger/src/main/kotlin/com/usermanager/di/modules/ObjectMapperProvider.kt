package com.usermanager.di.modules

import com.fasterxml.jackson.databind.ObjectMapper
import dagger.Module
import dagger.Provides

@Module
class ObjectMapperProvider {

    @Provides
    fun providesObjectMapper(): ObjectMapper{
        return ObjectMapper()
    }

}