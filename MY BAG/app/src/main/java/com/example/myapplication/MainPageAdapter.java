package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.myapplication.Fragments.Calender;
import com.example.myapplication.Fragments.Contact;
import com.example.myapplication.Fragments.Home;
import com.example.myapplication.Fragments.Profile;

public class MainPageAdapter extends FragmentPagerAdapter {


    public MainPageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new Home();
            case 1:
                return new Calender();
            case 2 :
                return new Contact();
            case 3:
                return new Profile();



        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
