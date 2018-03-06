package com.sagarwaghmare.dagger.modules;

import android.app.Activity;
import android.support.annotation.NonNull;

import com.sagarwaghmare.dagger.scopes.ActivityScope;
import com.sagarwaghmare.mydaggerapplication.activities.Activity1;
import com.sagarwaghmare.mydaggerapplication.activities.Activity10;
import com.sagarwaghmare.mydaggerapplication.activities.Activity2;
import com.sagarwaghmare.mydaggerapplication.activities.Activity3;
import com.sagarwaghmare.mydaggerapplication.activities.Activity4;
import com.sagarwaghmare.mydaggerapplication.activities.Activity5;
import com.sagarwaghmare.mydaggerapplication.activities.Activity6;
import com.sagarwaghmare.mydaggerapplication.activities.Activity7;
import com.sagarwaghmare.mydaggerapplication.activities.Activity8;
import com.sagarwaghmare.mydaggerapplication.activities.Activity9;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
@ActivityScope
public abstract class ActivityBuildersModule {

    @Module
    abstract class Activity1Module {

        @Binds
        abstract Activity activity(@NonNull Activity1 activity1);
    }

    @ActivityScope
    @ContributesAndroidInjector(modules = {Activity1Module.class, FragmentBuildersModule.class})
    abstract Activity1 activity1();

    @Module
    abstract class Activity2Module {

        @Binds
        abstract Activity activity(@NonNull Activity2 activity1);
    }

    @ActivityScope
    @ContributesAndroidInjector(modules = {Activity2Module.class, FragmentBuildersModule.class})
    abstract Activity2 activity2();


    @Module
    abstract class Activity3Module {

        @Binds
        abstract Activity activity(@NonNull Activity3 activity3);
    }

    @ActivityScope
    @ContributesAndroidInjector(modules = {Activity3Module.class, FragmentBuildersModule.class})
    abstract Activity3 activity3();

    @Module
    abstract class Activity4Module {

        @Binds
        abstract Activity activity(@NonNull Activity4 activity4);
    }

    @ActivityScope
    @ContributesAndroidInjector(modules = {Activity4Module.class, FragmentBuildersModule.class})
    abstract Activity4 activity4();

    @Module
    abstract class Activity5Module {

        @Binds
        abstract Activity activity(@NonNull Activity5 activity5);
    }

    @ActivityScope
    @ContributesAndroidInjector(modules = {Activity5Module.class, FragmentBuildersModule.class})
    abstract Activity5 activity5();

    @Module
    abstract class Activity6Module {

        @Binds
        abstract Activity activity(@NonNull Activity6 activity6);
    }

    @ActivityScope
    @ContributesAndroidInjector(modules = {Activity6Module.class, FragmentBuildersModule.class})
    abstract Activity6 activity6();

    @Module
    abstract class Activity7Module {

        @Binds
        abstract Activity activity(@NonNull Activity7 activity7);
    }

    @ActivityScope
    @ContributesAndroidInjector(modules = {Activity7Module.class, FragmentBuildersModule.class})
    abstract Activity7 activity7();

    @Module
    abstract class Activity8Module {

        @Binds
        abstract Activity activity(@NonNull Activity8 activity8);
    }

    @ActivityScope
    @ContributesAndroidInjector(modules = {Activity8Module.class, FragmentBuildersModule.class})
    abstract Activity8 activity8();

    @Module
    abstract class Activity9Module {

        @Binds
        abstract Activity activity(@NonNull Activity9 activity9);
    }

    @ActivityScope
    @ContributesAndroidInjector(modules = {Activity9Module.class, FragmentBuildersModule.class})
    abstract Activity9 activity9();

    @Module
    abstract class Activity10Module {

        @Binds
        abstract Activity activity(@NonNull Activity10 activity10);
    }

    @ActivityScope
    @ContributesAndroidInjector(modules = {Activity10Module.class, FragmentBuildersModule.class})
    abstract Activity10 activity10();
}
