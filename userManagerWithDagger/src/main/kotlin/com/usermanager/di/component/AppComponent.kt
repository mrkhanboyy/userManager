package com.usermanager.di.component

import com.usermanager.di.modules.*
import dagger.Component
import org.glassfish.grizzly.http.server.HttpServer
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ServiceModule::class,
        ConfigModule::class,
        HttpModule::class,
        RepositoryModule::class,
    ObjectMapperProvider::class
    ]
)
interface AppComponent {

    fun server():HttpServer
}