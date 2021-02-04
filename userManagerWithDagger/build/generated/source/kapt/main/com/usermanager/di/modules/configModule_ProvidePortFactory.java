package com.usermanager.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class configModule_ProvidePortFactory implements Factory<Integer> {
  private final ConfigModule module;

  public configModule_ProvidePortFactory(ConfigModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Integer get() {
    return Preconditions.checkNotNull(
        module.providePort(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Integer> create(ConfigModule module) {
    return new configModule_ProvidePortFactory(module);
  }
}
