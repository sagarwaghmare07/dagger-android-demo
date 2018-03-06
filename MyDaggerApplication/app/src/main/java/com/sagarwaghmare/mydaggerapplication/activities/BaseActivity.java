package com.sagarwaghmare.mydaggerapplication.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.sagarwaghmare.mydaggerapplication.R;
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

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public abstract class BaseActivity extends FragmentActivity implements HasSupportFragmentInjector {

    @Inject
    DispatchingAndroidInjector<Fragment> supportFragmentInjector;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Button launchButton;
        LinearLayout layout = findViewById(R.id.buttonsContainer);
        for (int i = 1; i <= 20; i++) {
            launchButton = new Button(this);
            launchButton.setText("Launch Fragment " + i);
            final int fragmentPos = i;
            launchButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switchFragment(fragmentPos);
                }
            });
            layout.addView(launchButton);
        }
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return supportFragmentInjector;
    }

    void switchFragment(int fragmentPosition) {
        Fragment fragment = Fragment1.newInstance();
        switch (fragmentPosition) {
            case 1:
                fragment = Fragment1.newInstance();
                break;
            case 2:
                fragment = Fragment2.newInstance();
                break;
            case 3:
                fragment = Fragment3.newInstance();
                break;
            case 4:
                fragment = Fragment4.newInstance();
                break;
            case 5:
                fragment = Fragment5.newInstance();
                break;
            case 6:
                fragment = Fragment6.newInstance();
                break;
            case 7:
                fragment = Fragment7.newInstance();
                break;
            case 8:
                fragment = Fragment8.newInstance();
                break;
            case 9:
                fragment = Fragment9.newInstance();
                break;
            case 10:
                fragment = Fragment10.newInstance();
                break;
            case 11:
                fragment = Fragment11.newInstance();
                break;
            case 12:
                fragment = Fragment12.newInstance();
                break;
            case 13:
                fragment = Fragment13.newInstance();
                break;
            case 14:
                fragment = Fragment14.newInstance();
                break;
            case 15:
                fragment = Fragment15.newInstance();
                break;
            case 16:
                fragment = Fragment16.newInstance();
                break;
            case 17:
                fragment = Fragment17.newInstance();
                break;
            case 18:
                fragment = Fragment18.newInstance();
                break;
            case 19:
                fragment = Fragment19.newInstance();
                break;
            case 20:
                fragment = Fragment20.newInstance();
                break;
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
    }
}
