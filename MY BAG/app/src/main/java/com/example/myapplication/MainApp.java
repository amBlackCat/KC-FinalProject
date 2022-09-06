package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainApp extends AppCompatActivity {

    ArrayList<Bags> bagsArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);

        // // // // //

        ViewPager vp = findViewById(R.id.vp);
        MainPageAdapter Adapter = new MainPageAdapter(getSupportFragmentManager());
        vp.setAdapter(Adapter);

        TabLayout mainAppTab = findViewById(R.id.mainApp_tabLayout);
        mainAppTab.setupWithViewPager(vp);

        // // // // //

        mainAppTab.getTabAt(0).setIcon(R.drawable.icon3);
        mainAppTab.getTabAt(1).setIcon(R.drawable.calendar_3_64);
        mainAppTab.getTabAt(2).setIcon(R.drawable.help_3_64);
        mainAppTab.getTabAt(3).setIcon(R.drawable.user_2_64);

        // // // // //





    }
}