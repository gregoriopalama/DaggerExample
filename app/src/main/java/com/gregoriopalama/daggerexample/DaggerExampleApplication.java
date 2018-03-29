package com.gregoriopalama.daggerexample;

import android.app.Activity;
import android.app.Application;

import com.gregoriopalama.daggerexample.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * This is the application. It uses the generated DaggerAppComponent, and inject itself.
 * It also implements HasActivityInjector, in order to provide the possibility to inject
 * activities directly from inside of them.
 *
 * @author Gregorio Palamà
 */

public class DaggerExampleApplication extends Application implements HasActivityInjector {
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
