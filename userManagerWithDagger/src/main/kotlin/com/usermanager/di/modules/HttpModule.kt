package com.usermanager.di.modules

import com.fasterxml.jackson.databind.ObjectMapper
import com.usermanager.exceptions.exceptionmappers.UserExceptionMapper
import com.usermanager.resources.UserResources
import dagger.Module
import dagger.Provides
import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import javax.inject.Named
import javax.ws.rs.core.UriBuilder

@Module
class HttpModule {

    @Provides
    fun provideResource(userResources: UserResources, mapper: ObjectMapper): ResourceConfig {
        return ResourceConfig().register(userResources).register(UserExceptionMapper(mapper))
    }

    @Provides
    fun server(@Named("host") host : String, @Named("port") port :Int, config : ResourceConfig): HttpServer {
        val url = UriBuilder.fromUri(host).port(port).build()
        return GrizzlyHttpServerFactory.createHttpServer(url,config)
    }

}
