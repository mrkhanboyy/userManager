package com.usermanager.di.modules;

import com.fasterxml.jackson.databind.ObjectMapper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ObjectMapperProvider_ProvidesObjectMapperFactory
    implements Factory<ObjectMapper> {
  private final ObjectMapperProvider module;

  public ObjectMapperProvider_ProvidesObjectMapperFactory(ObjectMapperProvider module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectMapper get() {
    return Preconditions.checkNotNull(
        module.providesObjectMapper(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectMapper> create(ObjectMapperProvider module) {
    return new ObjectMapperProvider_ProvidesObjectMapperFactory(module);
  }
}
