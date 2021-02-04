package com.usermanager.service;

import com.usermanager.repository.UserRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserService_Factory implements Factory<UserService> {
  private final Provider<UserRepository> userRepoProvider;

  public UserService_Factory(Provider<UserRepository> userRepoProvider) {
    assert userRepoProvider != null;
    this.userRepoProvider = userRepoProvider;
  }

  @Override
  public UserService get() {
    return new UserService(userRepoProvider.get());
  }

  public static Factory<UserService> create(Provider<UserRepository> userRepoProvider) {
    return new UserService_Factory(userRepoProvider);
  }
}
