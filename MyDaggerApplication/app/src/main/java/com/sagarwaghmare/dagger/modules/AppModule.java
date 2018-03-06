package com.sagarwaghmare.dagger.modules;

import android.os.Handler;

import com.sagarwaghmare.dagger.scopes.ApplicationScope;
import com.sagarwaghmare.mydaggerapplication.App;

import dagger.Module;
import dagger.Provides;

@ApplicationScope
@Module
public class AppModule {

    @Provides
    Handler provideHandler(App app) {
        return new Handler();
    }

}
