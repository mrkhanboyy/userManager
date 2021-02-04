package com.usermanager.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/usermanager/service/UserService;", "", "userRepo", "Lcom/usermanager/repository/UserRepository;", "(Lcom/usermanager/repository/UserRepository;)V", "addUser", "Lcom/usermanager/models/User;", "user", "deleteUserById", "id", "", "getAllUsers", "", "getUserById", "updateUser", "validateUserData", "", "userManager"})
@javax.inject.Singleton()
public final class UserService {
    private final com.usermanager.repository.UserRepository userRepo = null;
    
    /**
     */
    @org.jetbrains.annotations.NotNull()
    public final com.usermanager.models.User addUser(@org.jetbrains.annotations.NotNull()
    com.usermanager.models.User user) {
        return null;
    }
    
    /**
     */
    @org.jetbrains.annotations.Nullable()
    public final com.usermanager.models.User getUserById(int id) {
        return null;
    }
    
    /**
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.usermanager.models.User> getAllUsers() {
        return null;
    }
    
    /**
     */
    @org.jetbrains.annotations.NotNull()
    public final com.usermanager.models.User deleteUserById(int id) {
        return null;
    }
    
    /**
     */
    @org.jetbrains.annotations.NotNull()
    public final com.usermanager.models.User updateUser(@org.jetbrains.annotations.NotNull()
    com.usermanager.models.User user) {
        return null;
    }
    
    /**
     */
    private final void validateUserData(com.usermanager.models.User user) {
    }
    
    @javax.inject.Inject()
    public UserService(@org.jetbrains.annotations.NotNull()
    com.usermanager.repository.UserRepository userRepo) {
        super();
    }
}