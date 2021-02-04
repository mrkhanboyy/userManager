package com.usermanager.exceptions.exceptionmappers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/usermanager/exceptions/exceptionmappers/UserExceptionMapper;", "Ljavax/ws/rs/ext/ExceptionMapper;", "Lcom/usermanager/exceptions/userexception/UserException;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "toResponse", "Ljavax/ws/rs/core/Response;", "exception", "userManager"})
@javax.ws.rs.ext.Provider()
public final class UserExceptionMapper implements javax.ws.rs.ext.ExceptionMapper<com.usermanager.exceptions.userexception.UserException> {
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @javax.ws.rs.Produces(value = {"application/json"})
    public javax.ws.rs.core.Response toResponse(@org.jetbrains.annotations.Nullable()
    com.usermanager.exceptions.userexception.UserException exception) {
        return null;
    }
    
    @javax.inject.Inject()
    public UserExceptionMapper(@org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        super();
    }
}