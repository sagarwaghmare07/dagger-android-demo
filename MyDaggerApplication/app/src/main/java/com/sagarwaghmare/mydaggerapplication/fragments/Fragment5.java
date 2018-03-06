package com.sagarwaghmare.mydaggerapplication.fragments;

import android.os.Bundle;
import android.util.Log;

import com.sagarwaghmare.dependencies.ActivityDependency;
import com.sagarwaghmare.dependencies.AppDependency;
import com.sagarwaghmare.dependencies.FragmentDependency;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

public class Fragment5 extends BaseFragment {

    @Inject AppDependency appDependency;
    @Inject ActivityDependency activityDependency;
    @Inject FragmentDependency fragmentDependency;

    public Fragment5() {
        // Required empty public constructor
    }

    public static Fragment5 newInstance() {
        Fragment5 fragment = new Fragment5();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        AndroidSupportInjection.inject(this);
        super.onCreate(savedInstanceState);
        Log.d("MyDaggerApplication", "Fragment5: appDependency:" + appDependency +
                " activityDependency:" + activityDependency + " fragmentDependency:" + fragmentDependency);
    }
}
