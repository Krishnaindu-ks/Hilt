package com.ks.fieldinjection

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MyModule {
    @Provides
    fun provideGreeting():String {
        return "Hello,Dagger-Hilt"
    }
}