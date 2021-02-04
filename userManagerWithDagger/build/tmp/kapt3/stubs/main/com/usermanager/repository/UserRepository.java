package com.usermanager.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\u000e"}, d2 = {"Lcom/usermanager/repository/UserRepository;", "", "()V", "addUser", "Lcom/usermanager/models/User;", "user", "deleteUser", "id", "", "getAllUsers", "", "getUserById", "updateUser", "Companion", "userManager"})
@javax.inject.Singleton()
public final class UserRepository {
    @org.jetbrains.annotations.NotNull()
    private static java.util.List<com.usermanager.models.User> userDatabase;
    @org.jetbrains.annotations.NotNull()
    public static final com.usermanager.repository.UserRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.usermanager.models.User addUser(@org.jetbrains.annotations.NotNull()
    com.usermanager.models.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.usermanager.models.User getUserById(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.usermanager.models.User> getAllUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.usermanager.models.User deleteUser(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.usermanager.models.User updateUser(@org.jetbrains.annotations.NotNull()
    com.usermanager.models.User user) {
        return null;
    }
    
    public UserRepository() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/usermanager/repository/UserRepository$Companion;", "", "()V", "userDatabase", "", "Lcom/usermanager/models/User;", "getUserDatabase", "()Ljava/util/List;", "setUserDatabase", "(Ljava/util/List;)V", "userManager"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.usermanager.models.User> getUserDatabase() {
            return null;
        }
        
        public final void setUserDatabase(@org.jetbrains.annotations.NotNull()
        java.util.List<com.usermanager.models.User> p0) {
        }
        
        private Companion() {
            super();
        }
    }
}