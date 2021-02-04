package com.usermanager.exceptions.exceptionmappers

import com.usermanager.exceptions.userexception.InvalidUserDataException
import com.usermanager.exceptions.userexception.UserException
import com.usermanager.exceptions.userexception.UserNotFoundException
import com.usermanager.models.ErrorResponse
import java.time.LocalDateTime
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import javax.ws.rs.ext.ExceptionMapper
import javax.ws.rs.ext.Provider
import com.fasterxml.jackson.databind.ObjectMapper
import com.usermanager.service.UserService
import javax.inject.Inject

@Provider
class UserExceptionMapper  @Inject constructor(
    private val objectMapper: ObjectMapper
) : ExceptionMapper<UserException> {



    @Produces(MediaType.APPLICATION_JSON)
    override fun toResponse(exception: UserException?): Response {



        when(exception){

            is InvalidUserDataException -> {

                return Response.ok().entity(objectMapper.writeValueAsString(ErrorResponse("400",exception.message,LocalDateTime.now().toString(),exception.toString()))).build()
            }

            is UserNotFoundException -> {
                return Response.ok().entity(objectMapper.writeValueAsString(ErrorResponse("404",exception.message.toString(),LocalDateTime.now().toString(),exception.toString())) ).build()
            }

        }

        return Response.ok().entity("an error has occured").build()
    }
}