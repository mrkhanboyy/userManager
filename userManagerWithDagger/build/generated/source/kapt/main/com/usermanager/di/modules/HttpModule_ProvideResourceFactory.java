package com.usermanager.di.modules;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.usermanager.resources.UserResources;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.glassfish.jersey.server.ResourceConfig;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HttpModule_ProvideResourceFactory implements Factory<ResourceConfig> {
  private final HttpModule module;

  private final Provider<UserResources> userResourcesProvider;

  private final Provider<ObjectMapper> mapperProvider;

  public HttpModule_ProvideResourceFactory(
      HttpModule module,
      Provider<UserResources> userResourcesProvider,
      Provider<ObjectMapper> mapperProvider) {
    assert module != null;
    this.module = module;
    assert userResourcesProvider != null;
    this.userResourcesProvider = userResourcesProvider;
    assert mapperProvider != null;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public ResourceConfig get() {
    return Preconditions.checkNotNull(
        module.provideResource(userResourcesProvider.get(), mapperProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ResourceConfig> create(
      HttpModule module,
      Provider<UserResources> userResourcesProvider,
      Provider<ObjectMapper> mapperProvider) {
    return new HttpModule_ProvideResourceFactory(module, userResourcesProvider, mapperProvider);
  }
}
