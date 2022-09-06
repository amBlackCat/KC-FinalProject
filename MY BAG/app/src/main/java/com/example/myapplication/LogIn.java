package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        ImageView back2main = findViewById(R.id.BTN_login2main);

        back2main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent back2main = new Intent(LogIn.this, FirstPage.class);
                startActivity(back2main);
            }
        });

        ImageView nextPage = findViewById(R.id.BTN_login);

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nextPage = new Intent(LogIn.this, MainApp.class);
                startActivity(nextPage);
            }
        });
    }
}