package com.sagarwaghmare.dagger.component;

import com.sagarwaghmare.dagger.modules.ActivityBuildersModule;
import com.sagarwaghmare.dagger.modules.AppModule;
import com.sagarwaghmare.dagger.scopes.ApplicationScope;
import com.sagarwaghmare.mydaggerapplication.App;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import dagger.android.support.DaggerApplication;

@ApplicationScope
@Component(modules = {
    AppModule.class,
    AndroidSupportInjectionModule.class, ActivityBuildersModule.class
})
public interface AppComponent extends AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(App application);

        AppComponent build();
    }

    void inject(App app);
}
