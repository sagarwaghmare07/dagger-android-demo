package com.sagarwaghmare.mydaggerapplication.fragments;

import android.os.Bundle;
import android.util.Log;

import com.sagarwaghmare.dependencies.ActivityDependency;
import com.sagarwaghmare.dependencies.AppDependency;
import com.sagarwaghmare.dependencies.FragmentDependency;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

public class Fragment6 extends BaseFragment {

    @Inject AppDependency appDependency;
    @Inject ActivityDependency activityDependency;
    @Inject FragmentDependency fragmentDependency;

    public Fragment6() {
        // Required empty public constructor
    }

    public static Fragment6 newInstance() {
        Fragment6 fragment = new Fragment6();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        AndroidSupportInjection.inject(this);
        super.onCreate(savedInstanceState);
        Log.d("MyDaggerApplication", "Fragment6: appDependency:" + appDependency +
                " activityDependency:" + activityDependency + " fragmentDependency:" + fragmentDependency);
    }
}
