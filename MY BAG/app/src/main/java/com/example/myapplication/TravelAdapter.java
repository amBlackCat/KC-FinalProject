package com.example.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class TravelAdapter extends ArrayAdapter {

    List<Travel> travelBagList;

    // // //

    Context context;

    public TravelAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        travelBagList = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View notTravelBag = LayoutInflater.from(getContext()).inflate(R.layout.travel_bag_raw, parent, false);
        Travel currentTravelBag = travelBagList.get(position);

        // // // // //

        TextView travelItemName = notTravelBag.findViewById(R.id.travelItemTextShow);
        travelItemName.setText(currentTravelBag.getTravelItemTextShow());

        // //

        ImageView travelItemImg = notTravelBag.findViewById(R.id.travelbagraw_imgshow);
        travelItemImg.setImageResource(currentTravelBag.getTravelItemImgShow());

        // // // // //

        ImageView deleteItem = notTravelBag.findViewById(R.id.DeleteItem);

        deleteItem.setOnClickListener(new View.OnClickListener() {
            Travel removeItem = travelBagList.get(position);
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext()).setMessage("Are you sure you want to delete that ?")
                        .setTitle("Confirmation").setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                travelBagList.remove(removeItem);
                                notifyDataSetChanged();
                            }
                        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });

                // // // // //


                builder.show();
            }
        });

        // // // // //

        return notTravelBag;


    }
}
