package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Details_babyBag extends AppCompatActivity {

    ArrayList<Baby> baby = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_baby_bag);

        // // // // //

        Baby item1 = new Baby(R.drawable.baby_clothes, "clothes");
        Baby item2 = new Baby(R.drawable.bib, "Bib");
        Baby item3 = new Baby(R.drawable.baby_toy, "Toys");
        Baby item4 = new Baby(R.drawable.baby_bottle, "Bottle");
        Baby item5 = new Baby(R.drawable.pampers, "Pampers");
        Baby item6 = new Baby(R.drawable.wipes_64, "Wet wipes");

        // // // // //

        baby.add(item1);
        baby.add(item2);
        baby.add(item3);
        baby.add(item4);
        baby.add(item5);
        baby.add(item6);

        // // // // //

        BabyAdapter babyAdapter = new BabyAdapter(this, 0, baby);
        ListView babyBagListview = findViewById(R.id.listViewBaby);
        babyBagListview.setAdapter(babyAdapter);

        // // // // //

        ImageView back2main = findViewById(R.id.babyBtnBack);

        back2main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent babyIntent = new Intent(Details_babyBag.this, MainApp.class);
                startActivity(babyIntent);
            }
        });
    }
}