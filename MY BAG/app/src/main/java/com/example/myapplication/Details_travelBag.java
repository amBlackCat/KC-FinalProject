package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class Details_travelBag extends AppCompatActivity {

    ArrayList<Travel> travel = new ArrayList<>();

    // // // //

    private ArrayAdapter<Adapter> TravelAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_travel_bag);

        // // // // //

        Travel item1 = new Travel(R.drawable.shirt, "T-shirt");
        Travel item2 = new Travel(R.drawable.shorts, "Short");
        Travel item3 = new Travel(R.drawable.socks, "Socks");
        Travel item4 = new Travel(R.drawable.shoes_64, "Shoes");
        Travel item5 = new Travel(R.drawable.hoodie_64, "Hoodie");
        Travel item6 = new Travel(R.drawable.towel_64, "Towel");

        // // // // //

        travel.add(item1);
        travel.add(item2);
        travel.add(item3);
        travel.add(item4);
        travel.add(item5);
        travel.add(item6);

        // // // // //

        TravelAdapter travelAdapter = new TravelAdapter(this, 0, travel);
        ListView travelBagListView = findViewById(R.id.listViewTravel);
        travelBagListView.setAdapter(travelAdapter);

        // // // // //

        ImageView back2main = findViewById(R.id.travelBtnBack);

        back2main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent travelIntent = new Intent(Details_travelBag.this, MainApp.class);
                startActivity(travelIntent);
            }
        });


    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putSerializable("travelAdapter",(Serializable) TravelAdapter);
    }

    // // // // //

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(savedInstanceState != null){
            TravelAdapter = (ArrayAdapter<Adapter> )savedInstanceState.getSerializable("adapter");
        }

    }


}