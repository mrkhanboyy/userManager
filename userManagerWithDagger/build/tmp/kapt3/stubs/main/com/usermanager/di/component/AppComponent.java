package com.usermanager.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/usermanager/di/component/AppComponent;", "", "server", "Lorg/glassfish/grizzly/http/server/HttpServer;", "userManager"})
@dagger.Component(modules = {com.usermanager.di.module.ServiceModule.class, com.usermanager.di.module.configModule.class, com.usermanager.di.module.HttpModule.class, com.usermanager.di.module.RepositoryModule.class, com.usermanager.di.module.ObjectMapperProvider.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.glassfish.grizzly.http.server.HttpServer server();
}