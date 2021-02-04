package com.usermanager.di.component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.usermanager.di.modules.HttpModule;
import com.usermanager.di.modules.HttpModule_ProvideResourceFactory;
import com.usermanager.di.modules.HttpModule_ServerFactory;
import com.usermanager.di.modules.ObjectMapperProvider;
import com.usermanager.di.modules.ObjectMapperProvider_ProvidesObjectMapperFactory;
import com.usermanager.di.modules.RepositoryModule;
import com.usermanager.di.modules.RepositoryModule_UserRepoFactory;
import com.usermanager.di.modules.ServiceModule;
import com.usermanager.di.modules.ServiceModule_UserServiceFactory;
import com.usermanager.di.modules.ConfigModule;
import com.usermanager.di.modules.configModule_ProvideHostFactory;
import com.usermanager.di.modules.configModule_ProvidePortFactory;
import com.usermanager.repository.UserRepository;
import com.usermanager.resources.UserResources;
import com.usermanager.resources.UserResources_Factory;
import com.usermanager.service.UserService;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.server.ResourceConfig;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<String> provideHostProvider;

  private Provider<Integer> providePortProvider;

  private Provider<UserRepository> userRepoProvider;

  private Provider<UserService> userServiceProvider;

  private Provider<ObjectMapper> providesObjectMapperProvider;

  private Provider<UserResources> userResourcesProvider;

  private Provider<ResourceConfig> provideResourceProvider;

  private Provider<HttpServer> serverProvider;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideHostProvider = configModule_ProvideHostFactory.create(builder.configModule);

    this.providePortProvider = configModule_ProvidePortFactory.create(builder.configModule);

    this.userRepoProvider = RepositoryModule_UserRepoFactory.create(builder.repositoryModule);

    this.userServiceProvider =
        ServiceModule_UserServiceFactory.create(builder.serviceModule, userRepoProvider);

    this.providesObjectMapperProvider =
        ObjectMapperProvider_ProvidesObjectMapperFactory.create(builder.objectMapperProvider);

    this.userResourcesProvider =
        UserResources_Factory.create(userServiceProvider, providesObjectMapperProvider);

    this.provideResourceProvider =
        HttpModule_ProvideResourceFactory.create(
            builder.httpModule, userResourcesProvider, providesObjectMapperProvider);

    this.serverProvider =
        HttpModule_ServerFactory.create(
            builder.httpModule, provideHostProvider, providePortProvider, provideResourceProvider);
  }

  @Override
  public HttpServer server() {
    return serverProvider.get();
  }

  public static final class Builder {
    private ConfigModule configModule;

    private RepositoryModule repositoryModule;

    private ServiceModule serviceModule;

    private ObjectMapperProvider objectMapperProvider;

    private HttpModule httpModule;

    private Builder() {}

    public AppComponent build() {
      if (configModule == null) {
        this.configModule = new ConfigModule();
      }
      if (repositoryModule == null) {
        this.repositoryModule = new RepositoryModule();
      }
      if (serviceModule == null) {
        this.serviceModule = new ServiceModule();
      }
      if (objectMapperProvider == null) {
        this.objectMapperProvider = new ObjectMapperProvider();
      }
      if (httpModule == null) {
        this.httpModule = new HttpModule();
      }
      return new DaggerAppComponent(this);
    }

    public Builder serviceModule(ServiceModule serviceModule) {
      this.serviceModule = Preconditions.checkNotNull(serviceModule);
      return this;
    }

    public Builder configModule(ConfigModule configModule) {
      this.configModule = Preconditions.checkNotNull(configModule);
      return this;
    }

    public Builder httpModule(HttpModule httpModule) {
      this.httpModule = Preconditions.checkNotNull(httpModule);
      return this;
    }

    public Builder repositoryModule(RepositoryModule repositoryModule) {
      this.repositoryModule = Preconditions.checkNotNull(repositoryModule);
      return this;
    }

    public Builder objectMapperProvider(ObjectMapperProvider objectMapperProvider) {
      this.objectMapperProvider = Preconditions.checkNotNull(objectMapperProvider);
      return this;
    }
  }
}
