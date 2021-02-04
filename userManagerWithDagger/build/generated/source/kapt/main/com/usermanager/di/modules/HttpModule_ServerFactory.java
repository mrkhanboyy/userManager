package com.usermanager.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.server.ResourceConfig;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HttpModule_ServerFactory implements Factory<HttpServer> {
  private final HttpModule module;

  private final Provider<String> hostProvider;

  private final Provider<Integer> portProvider;

  private final Provider<ResourceConfig> configProvider;

  public HttpModule_ServerFactory(
      HttpModule module,
      Provider<String> hostProvider,
      Provider<Integer> portProvider,
      Provider<ResourceConfig> configProvider) {
    assert module != null;
    this.module = module;
    assert hostProvider != null;
    this.hostProvider = hostProvider;
    assert portProvider != null;
    this.portProvider = portProvider;
    assert configProvider != null;
    this.configProvider = configProvider;
  }

  @Override
  public HttpServer get() {
    return Preconditions.checkNotNull(
        module.server(hostProvider.get(), portProvider.get(), configProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HttpServer> create(
      HttpModule module,
      Provider<String> hostProvider,
      Provider<Integer> portProvider,
      Provider<ResourceConfig> configProvider) {
    return new HttpModule_ServerFactory(module, hostProvider, portProvider, configProvider);
  }
}
