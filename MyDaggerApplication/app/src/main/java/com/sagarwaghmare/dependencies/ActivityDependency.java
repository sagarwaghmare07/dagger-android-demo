package com.sagarwaghmare.dependencies;

import android.app.Activity;
import android.util.Log;

import com.sagarwaghmare.dagger.scopes.ActivityScope;

import javax.inject.Inject;

@ActivityScope
public class ActivityDependency {

    @Inject
    public ActivityDependency(Activity activity) {
        // Log.d("MyDaggerApplication", "ActivityDependency: Activity: " + activity);
    }
}
