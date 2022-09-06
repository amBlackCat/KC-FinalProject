package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        ImageView signUpBtnPage = findViewById(R.id.BTN_signupPage);
        ImageView loginBtnPage = findViewById(R.id.BTN_loginPage);


        signUpBtnPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2SignupPage = new Intent(FirstPage.this, SignUp.class);
                startActivity(intent2SignupPage);
            }
        });

        loginBtnPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2LoginPage = new Intent(FirstPage.this, LogIn.class);
                startActivity(intent2LoginPage);
            }
        });



    }
}