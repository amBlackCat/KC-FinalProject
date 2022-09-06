package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class SchoolBagAdapter extends ArrayAdapter {


    List<Days> schoolBagList;


    public SchoolBagAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        schoolBagList = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View notSchoolBag = LayoutInflater.from(getContext()).inflate(R.layout.school_bag_raw, parent, false);

        Days cuurentSchoolBag = schoolBagList.get(position);


        TextView dayText = notSchoolBag.findViewById(R.id.dayShow);

        dayText.setText(cuurentSchoolBag.getDay());


        return notSchoolBag;





    }



}
