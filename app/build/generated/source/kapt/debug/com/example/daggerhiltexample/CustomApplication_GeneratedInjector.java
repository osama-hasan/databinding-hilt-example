package com.example.daggerhiltexample;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = CustomApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface CustomApplication_GeneratedInjector {
  void injectCustomApplication(CustomApplication customApplication);
}
