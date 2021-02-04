package com.usermanager.resources;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\bH\u0007J\u0012\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/usermanager/resources/UserResources;", "", "userService", "Lcom/usermanager/service/UserService;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lcom/usermanager/service/UserService;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "createNewUser", "Ljavax/ws/rs/core/Response;", "requestData", "", "deleteUserById", "id", "", "getAllUsers", "getUser", "updateUser", "userManager"})
@javax.ws.rs.Path(value = "user/v1")
public final class UserResources {
    private final com.usermanager.service.UserService userService = null;
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Consumes(value = {"application/json"})
    @javax.ws.rs.Produces(value = {"application/json"})
    @javax.ws.rs.Path(value = "/user")
    @javax.ws.rs.POST()
    public final javax.ws.rs.core.Response createNewUser(@org.jetbrains.annotations.NotNull()
    java.lang.String requestData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Produces(value = {"application/json"})
    @javax.ws.rs.Path(value = "/user/{id}")
    @javax.ws.rs.GET()
    public final javax.ws.rs.core.Response getUser(@javax.ws.rs.PathParam(value = "id")
    int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Produces(value = {"application/json"})
    @javax.ws.rs.Path(value = "/users")
    @javax.ws.rs.GET()
    public final javax.ws.rs.core.Response getAllUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Consumes(value = {"application/json"})
    @javax.ws.rs.Produces(value = {"application/json"})
    @javax.ws.rs.Path(value = "/user")
    @javax.ws.rs.PUT()
    public final javax.ws.rs.core.Response updateUser(@org.jetbrains.annotations.NotNull()
    java.lang.String requestData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Produces(value = {"application/json"})
    @javax.ws.rs.Path(value = "/user/{id}")
    @javax.ws.rs.DELETE()
    public final javax.ws.rs.core.Response deleteUserById(@javax.ws.rs.PathParam(value = "id")
    int id) {
        return null;
    }
    
    @javax.inject.Inject()
    public UserResources(@org.jetbrains.annotations.NotNull()
    com.usermanager.service.UserService userService, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        super();
    }
}