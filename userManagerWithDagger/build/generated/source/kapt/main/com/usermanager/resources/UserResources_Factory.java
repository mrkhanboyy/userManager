package com.usermanager.resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.usermanager.service.UserService;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserResources_Factory implements Factory<UserResources> {
  private final Provider<UserService> userServiceProvider;

  private final Provider<ObjectMapper> objectMapperProvider;

  public UserResources_Factory(
      Provider<UserService> userServiceProvider, Provider<ObjectMapper> objectMapperProvider) {
    assert userServiceProvider != null;
    this.userServiceProvider = userServiceProvider;
    assert objectMapperProvider != null;
    this.objectMapperProvider = objectMapperProvider;
  }

  @Override
  public UserResources get() {
    return new UserResources(userServiceProvider.get(), objectMapperProvider.get());
  }

  public static Factory<UserResources> create(
      Provider<UserService> userServiceProvider, Provider<ObjectMapper> objectMapperProvider) {
    return new UserResources_Factory(userServiceProvider, objectMapperProvider);
  }
}
