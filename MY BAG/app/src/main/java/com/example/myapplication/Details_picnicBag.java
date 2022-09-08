package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Details_picnicBag extends AppCompatActivity {

    ArrayList<Picnic> picnic = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_picnic_bag);

        // // // // //

        Picnic item1 = new Picnic(R.drawable.candy, "Candy");
        Picnic item2 = new Picnic(R.drawable.chips, "Chips");
        Picnic item3 = new Picnic(R.drawable.soda, "Soda");
        Picnic item4 = new Picnic(R.drawable.cutting_board, "Cutting Board");
        Picnic item5 = new Picnic(R.drawable.knife_64, "Knife");
        Picnic item6 = new Picnic(R.drawable.fruits_64, "Fruits");

        // // // // //

        picnic.add(item1);
        picnic.add(item2);
        picnic.add(item3);
        picnic.add(item4);
        picnic.add(item5);
        picnic.add(item6);

        // // // // //


        PicnicAdapter picnicAdapter = new PicnicAdapter(this, 0, picnic);
        ListView picnicBagListView = findViewById(R.id.listViewPicnic);
        picnicBagListView.setAdapter(picnicAdapter);

        // // // // //

        ImageView back2main = findViewById(R.id.picnicBtnBack);

        back2main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent picnicIntent = new Intent(Details_picnicBag.this, MainApp.class);
                startActivity(picnicIntent);
            }
        });




    }
}