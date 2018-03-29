package com.gregoriopalama.daggerexample.di;

import com.gregoriopalama.daggerexample.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Instead of creating a sub-component for each activity, since Dagger 2.11
 * we can use @ContributesAndroidInjector, that will add activity's dependencies
 * into the dependency tree
 *
 * @author Gregorio Palamà
 */

@Module
public abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract MainActivity bindsMainActivity();
}
