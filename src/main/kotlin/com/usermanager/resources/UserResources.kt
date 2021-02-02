package com.usermanager.resources

import com.fasterxml.jackson.databind.ObjectMapper
import com.usermanager.exceptions.UserNotFoundException
import com.usermanager.models.User
import com.usermanager.service.UserService
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import javax.ws.rs.core.UriBuilder

@Path("user/v1")
class UserResources {

    private  var objectMapper = ObjectMapper()
    private var userService: UserService = UserService()

    @POST
    @Path("/user")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun createNewUser(requestData: String): Response {
            val user = objectMapper.readValue(requestData, User::class.java)
            return Response.ok().entity(userService.addUser(user).toString()).build()
    }


    @GET
    @Path("/user/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    fun getUser(@PathParam("id") id:Int): Response {
        val user = userService.getUserById(id)
        return Response.ok().entity(user.toString()).build()
    }

    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    fun getAllUsers(): Response {
        return Response.ok().entity(userService.getAllUsers().toString()).build()
    }

    @PUT
    @Path("/user")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun updateUser(requestData: String): Response {
        var user = objectMapper.readValue(requestData, User::class.java)
        return Response.ok().entity(userService.updateUser(user).toString()).build()
    }


    @DELETE
    @Path("/user/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    fun deleteUserById(@PathParam("id") id:Int): Response {
        return Response.ok().entity(userService.deleteUserById(id).toString()).build()
    }


}
