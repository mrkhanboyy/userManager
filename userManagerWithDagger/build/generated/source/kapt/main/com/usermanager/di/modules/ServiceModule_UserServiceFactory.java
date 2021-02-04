package com.usermanager.di.modules;

import com.usermanager.repository.UserRepository;
import com.usermanager.service.UserService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ServiceModule_UserServiceFactory implements Factory<UserService> {
  private final ServiceModule module;

  private final Provider<UserRepository> userRepoProvider;

  public ServiceModule_UserServiceFactory(
      ServiceModule module, Provider<UserRepository> userRepoProvider) {
    assert module != null;
    this.module = module;
    assert userRepoProvider != null;
    this.userRepoProvider = userRepoProvider;
  }

  @Override
  public UserService get() {
    return Preconditions.checkNotNull(
        module.userService(userRepoProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UserService> create(
      ServiceModule module, Provider<UserRepository> userRepoProvider) {
    return new ServiceModule_UserServiceFactory(module, userRepoProvider);
  }
}
