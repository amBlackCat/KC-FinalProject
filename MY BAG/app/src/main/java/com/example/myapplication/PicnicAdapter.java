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

public class PicnicAdapter extends ArrayAdapter {

    List<Picnic> picnicBagList;

    public PicnicAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        picnicBagList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View notPicnicbag = LayoutInflater.from(getContext()).inflate(R.layout.picnic_bag_raw, parent, false);
        Picnic currentPicnicbag = picnicBagList.get(position);

        // // // // //

        TextView picnicItemName = notPicnicbag.findViewById(R.id.picniclItemTextShow);
        picnicItemName.setText(currentPicnicbag.getPicnicItemTextShow());

        // //

        ImageView picnicItemImg = notPicnicbag.findViewById(R.id.picnicbagraw_imgshow);
        picnicItemImg.setImageResource(currentPicnicbag.getPicnicItemImgShow());

        // // // // //

        ImageView deleteItem = notPicnicbag.findViewById(R.id.DeleteItem);

        deleteItem.setOnClickListener(new View.OnClickListener() {
            Picnic removeItem = picnicBagList.get(position);
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext()).setMessage("Are you sure you want to delete that ?")
                        .setTitle("Confirmation").setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                picnicBagList.remove(removeItem);
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

        return notPicnicbag;
    }
}
