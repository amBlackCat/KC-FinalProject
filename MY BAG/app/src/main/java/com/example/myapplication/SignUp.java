package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        ImageView back22mainPage = findViewById(R.id.signup2main);

         back22mainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent back2themain = new Intent(SignUp.this, FirstPage.class);
                startActivity(back2themain);
            }
        });

         ImageView nextPage = findViewById(R.id.btn_signup);


        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nextPage = new Intent(SignUp.this, MainApp.class);
                startActivity(nextPage);
            }
        });




    }
}

