package com.usermanager.di.modules;

import com.usermanager.repository.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RepositoryModule_UserRepoFactory implements Factory<UserRepository> {
  private final RepositoryModule module;

  public RepositoryModule_UserRepoFactory(RepositoryModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UserRepository get() {
    return Preconditions.checkNotNull(
        module.userRepo(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UserRepository> create(RepositoryModule module) {
    return new RepositoryModule_UserRepoFactory(module);
  }
}
