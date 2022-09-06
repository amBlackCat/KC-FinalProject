package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class BagsAdapter extends ArrayAdapter {

    List<Bags> bagsList;

    public BagsAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        bagsList = objects;
    }




    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View bagsView = LayoutInflater.from(getContext()).inflate(R.layout.bag_row, parent, false);

        Bags currentBag = bagsList.get(position);

        // // // // //

        ImageView bagImgView = bagsView.findViewById(R.id.imgBagShow);
        TextView bagNameView = bagsView.findViewById(R.id.bagTypeName);

        // // // // //

        bagImgView.setImageResource(currentBag.getBagImg());
        bagNameView.setText(currentBag.getBagType());

        // // // // //

        return bagsView;

    }
}
