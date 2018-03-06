package com.sagarwaghmare.dependencies;

import android.util.Log;

import com.sagarwaghmare.dagger.scopes.ApplicationScope;

import javax.inject.Inject;

@ApplicationScope
public class AppDependency {

    @Inject
    public AppDependency() {
        // Log.d("MyDaggerApplication", "AppDependency: this: " + this);
    }
}
