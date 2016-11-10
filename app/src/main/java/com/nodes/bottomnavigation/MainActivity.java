package com.nodes.bottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottomNavigation);

        final TextView fragmentNameTv = (TextView)
                findViewById(R.id.fragmentName);

        fragmentNameTv.setText(getResources().getString(R.string.fragment_home_title));

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.action_home:
                        fragmentNameTv.setText(getResources().getString(R.string.fragment_home_title));
                        break;

                    case R.id.action_car:
                        fragmentNameTv.setText(getResources().getString(R.string.fragment_car_title));
                        break;

                    case R.id.action_bike:
                        fragmentNameTv.setText(getResources().getString(R.string.fragment_bike_title));
                        break;

                    case R.id.action_walk:
                        fragmentNameTv.setText(getResources().getString(R.string.fragment_walk_title));
                        break;
                }
                return false;
            }
        });
    }
}
