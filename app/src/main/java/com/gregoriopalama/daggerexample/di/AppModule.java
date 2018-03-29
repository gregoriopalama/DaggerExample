package com.gregoriopalama.daggerexample.di;

import android.app.Application;

import com.gregoriopalama.daggerexample.DaggerExampleApplication;
import com.gregoriopalama.daggerexample.R;

import dagger.Module;
import dagger.Provides;

/**
 * This Module will provide the Application Context to the whole application.
 * It also provides the string we want to show in the Text View of the MainActivity
 *
 * @author Gregorio Palamà
 */

@Module
public class AppModule {

    @Provides
    public String providesHelloDagger(Application application) {
        return application.getResources().getString(R.string.hello_dagger);
    }

    @Provides
    public Application providesApplication(DaggerExampleApplication application) {
        return application;
    }
}
