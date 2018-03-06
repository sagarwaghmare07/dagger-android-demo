package com.sagarwaghmare.dependencies;

import android.support.v4.app.Fragment;
import android.util.Log;

import com.sagarwaghmare.dagger.scopes.FragmentScope;

import javax.inject.Inject;

@FragmentScope
public class FragmentDependency {

    @Inject
    public FragmentDependency(Fragment fragment) {
        // Log.d("MyDaggerApplication", "FragmentDependency: Fragment: " + fragment);
    }

}
