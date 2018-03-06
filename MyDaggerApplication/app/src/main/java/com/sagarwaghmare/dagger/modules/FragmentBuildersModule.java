package com.sagarwaghmare.dagger.modules;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import com.sagarwaghmare.dagger.scopes.FragmentScope;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment1;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment10;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment11;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment12;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment13;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment14;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment15;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment16;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment17;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment18;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment19;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment2;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment20;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment3;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment4;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment5;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment6;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment7;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment8;
import com.sagarwaghmare.mydaggerapplication.fragments.Fragment9;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
@FragmentScope
public abstract class FragmentBuildersModule {

    @Module
    abstract class Fragment1Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment1 fragment1);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment1Module.class)
    abstract Fragment1 fragment1();

    @Module
    abstract class Fragment2Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment2 fragment2);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment2Module.class)
    abstract Fragment2 fragment2();

    @Module
    abstract class Fragment3Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment3 fragment3);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment3Module.class)
    abstract Fragment3 fragment3();

    @Module
    abstract class Fragment4Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment4 fragment4);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment4Module.class)
    abstract Fragment4 fragment4();

    @Module
    abstract class Fragment5Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment5 fragment5);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment5Module.class)
    abstract Fragment5 fragment5();

    @Module
    abstract class Fragment6Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment6 fragment6);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment6Module.class)
    abstract Fragment6 fragment6();

    @Module
    abstract class Fragment7Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment7 fragment7);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment7Module.class)
    abstract Fragment7 fragment7();

    @Module
    abstract class Fragment8Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment8 fragment8);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment8Module.class)
    abstract Fragment8 fragment8();

    @Module
    abstract class Fragment9Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment9 fragment9);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment9Module.class)
    abstract Fragment9 fragment9();

    @Module
    abstract class Fragment10Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment10 fragment10);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment10Module.class)
    abstract Fragment10 fragment10();

    @Module
    abstract class Fragment11Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment11 fragment11);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment11Module.class)
    abstract Fragment11 fragment11();

    @Module
    abstract class Fragment12Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment12 fragment12);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment12Module.class)
    abstract Fragment12 fragment12();

    @Module
    abstract class Fragment13Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment13 fragment13);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment13Module.class)
    abstract Fragment13 fragment13();

    @Module
    abstract class Fragment14Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment14 fragment14);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment14Module.class)
    abstract Fragment14 fragment14();

    @Module
    abstract class Fragment15Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment15 fragment15);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment15Module.class)
    abstract Fragment15 fragment15();

    @Module
    abstract class Fragment16Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment16 fragment16);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment16Module.class)
    abstract Fragment16 fragment16();

    @Module
    abstract class Fragment17Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment17 fragment17);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment17Module.class)
    abstract Fragment17 fragment17();

    @Module
    abstract class Fragment18Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment18 fragment18);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment18Module.class)
    abstract Fragment18 fragment18();

    @Module
    abstract class Fragment19Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment19 fragment19);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment19Module.class)
    abstract Fragment19 fragment19();

    @Module
    abstract class Fragment20Module {
        @Binds
        abstract Fragment fragment(@NonNull Fragment20 fragment20);
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = Fragment20Module.class)
    abstract Fragment20 fragment20();


}
