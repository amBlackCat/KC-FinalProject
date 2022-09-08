package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Details_schoolBag extends AppCompatActivity {

    ArrayList<Days> days = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_school_bag);

        Days sunday = new Days("Sunday","subject", "subject","subject","subject","subject","subject","subject", 0);
        Days monday = new Days("Monday", "subject", "subject","subject","subject","subject","subject","subject",1);
        Days tuesday = new Days("Tuesday", "subject", "subject","subject","subject","subject","subject","subject",2);
        Days wednesday = new Days("Wednesday", "subject", "subject","subject","subject","subject","subject","subject",3);
        Days thursday = new Days("Thursday", "subject", "subject","subject","subject","subject","subject","subject",4);

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

        // // // // //


        ImageView back2main = findViewById(R.id.schoolBtnBack);

        back2main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent schoolIntent = new Intent(Details_schoolBag.this, MainApp.class);
                startActivity(schoolIntent);
            }
        });

        // // // // //

        bagsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Days x = days.get(i);

                Intent intent = new Intent(Details_schoolBag.this, School_editSubjects. class);
                intent.putExtra("day", x);
                startActivity(intent);
            }
        });

        // // // // //

        TextView sShow1 = findViewById(R.id.subj1);
        TextView sShow2 = findViewById(R.id.subj2);
        TextView sShow3 = findViewById(R.id.subj3);
        TextView sShow4 = findViewById(R.id.subj4);
        TextView sShow5 = findViewById(R.id.subj5);
        TextView sShow6 = findViewById(R.id.subj6);
        TextView sShow7 = findViewById(R.id.subj7);

        // // // // // //




    }

}