package com.sagarwaghmare.mydaggerapplication.activities;

import android.os.Bundle;
import android.util.Log;

import com.sagarwaghmare.dependencies.ActivityDependency;
import com.sagarwaghmare.dependencies.AppDependency;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class Activity4 extends BaseActivity {

    @Inject AppDependency appDependency;
    @Inject ActivityDependency activityDependency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);

        Log.d("MyDaggerApplication", "Activity4: appDependency:" + appDependency +
                " activityDependency:" + activityDependency);

        super.onCreate(savedInstanceState);
    }
}
