package com.gregoriopalama.daggerexample.di;

import com.gregoriopalama.daggerexample.DaggerExampleApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * This is the Component for the whole Application. It will generate the dependency tree
 *
 * @author Gregorio Palamà
 */

@Component(modules={AppModule.class, AndroidInjectionModule.class, ActivityModule.class})
public interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(DaggerExampleApplication application);
        AppComponent build();
    }
    void inject(DaggerExampleApplication application);
}
