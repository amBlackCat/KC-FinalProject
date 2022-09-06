package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Details_schoolBag extends AppCompatActivity {

    ArrayList<Days> days = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_school_bag);

        Days sunday = new Days("Sunday");
        Days monday = new Days("Monday");
        Days tuesday = new Days("Tuesday");
        Days wednesday = new Days("Wednesday");
        Days thursday = new Days("Thursday");



        // // // // //


        days.add(sunday);
        days.add(monday);
        days.add(tuesday);
        days.add(wednesday);
        days.add(thursday);



        // // // // //


        SchoolBagAdapter schoolBagAdapter = new SchoolBagAdapter(this, 0, days);

        ListView bagsListView = findViewById(R.id.listViewSchool);
        bagsListView.setAdapter(schoolBagAdapter);











    }


}