// Generated by Dagger (https://dagger.dev).
package com.example.daggerhiltexample.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModel_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  @Override
  public OkHttpClient get() {
    return provideOkHttpClient();
  }

  public static NetworkModel_ProvideOkHttpClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient provideOkHttpClient() {
    return Preconditions.checkNotNullFromProvides(NetworkModel.INSTANCE.provideOkHttpClient());
  }

  private static final class InstanceHolder {
    private static final NetworkModel_ProvideOkHttpClientFactory INSTANCE = new NetworkModel_ProvideOkHttpClientFactory();
  }
}
