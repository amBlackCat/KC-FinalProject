package com.example.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class BabyAdapter extends ArrayAdapter {

    List<Baby> babyBagList;

    public BabyAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        babyBagList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View notBabyBag = LayoutInflater.from(getContext()).inflate(R.layout.baby_bag_raw, parent, false);
        Baby currentBabyBag = babyBagList.get(position);

        // // // // //

        TextView babyItemName = notBabyBag.findViewById(R.id.babyItemTextShow);
        babyItemName.setText(currentBabyBag.getBabyItemTextShow());

        // //

        ImageView babyItemImg = notBabyBag.findViewById(R.id.babybagraw_imgshow);
        babyItemImg.setImageResource(currentBabyBag.getBabyItemImgShow());

        // // // // //

        ImageView deleteItem = notBabyBag.findViewById(R.id.DeleteItem);

        deleteItem.setOnClickListener(new View.OnClickListener() {
            Baby removeItem = babyBagList.get(position);
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext()).setMessage("Are you sure you want to delete that ?")
                        .setTitle("Confirmation").setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                babyBagList.remove(removeItem);
                                notifyDataSetChanged();
                            }
                        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });

                builder.show();

            }
        });

        // // // // //

        return notBabyBag;
    }
}
