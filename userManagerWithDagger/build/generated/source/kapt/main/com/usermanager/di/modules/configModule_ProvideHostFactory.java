package com.usermanager.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class configModule_ProvideHostFactory implements Factory<String> {
  private final ConfigModule module;

  public configModule_ProvideHostFactory(ConfigModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public String get() {
    return Preconditions.checkNotNull(
        module.provideHost(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<String> create(ConfigModule module) {
    return new configModule_ProvideHostFactory(module);
  }
}
