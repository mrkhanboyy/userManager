package com.usermanager.exceptions.exceptionmappers;

import com.fasterxml.jackson.databind.ObjectMapper;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserExceptionMapper_Factory implements Factory<UserExceptionMapper> {
  private final Provider<ObjectMapper> objectMapperProvider;

  public UserExceptionMapper_Factory(Provider<ObjectMapper> objectMapperProvider) {
    assert objectMapperProvider != null;
    this.objectMapperProvider = objectMapperProvider;
  }

  @Override
  public UserExceptionMapper get() {
    return new UserExceptionMapper(objectMapperProvider.get());
  }

  public static Factory<UserExceptionMapper> create(Provider<ObjectMapper> objectMapperProvider) {
    return new UserExceptionMapper_Factory(objectMapperProvider);
  }
}
