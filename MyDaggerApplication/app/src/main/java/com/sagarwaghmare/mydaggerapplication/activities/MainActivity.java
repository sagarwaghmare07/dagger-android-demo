package com.sagarwaghmare.mydaggerapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.sagarwaghmare.mydaggerapplication.R;

public class MainActivity extends FragmentActivity {

    private final Class[] ACTIVITY_NAMES = {Activity1.class,Activity2.class,Activity3.class,Activity4.class,Activity5.class,
            Activity6.class,Activity7.class,Activity8.class,Activity9.class,Activity10.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button launchButton;
        LinearLayout layout = findViewById(R.id.buttonsContainer);
        for (int i = 0; i < ACTIVITY_NAMES.length; i++) {
            launchButton = new Button(this);
            launchButton.setText("Launch Activity " + (i + 1));
            final int activityPos = i;
            launchButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, ACTIVITY_NAMES[activityPos]);
                    MainActivity.this.startActivity(intent);
                }
            });
            layout.addView(launchButton);
        }
    }
}
