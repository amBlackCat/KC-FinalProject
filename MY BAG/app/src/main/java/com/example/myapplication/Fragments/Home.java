package com.example.myapplication.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.myapplication.Bags;
import com.example.myapplication.BagsAdapter;
import com.example.myapplication.Details_babyBag;
import com.example.myapplication.Details_picnicBag;
import com.example.myapplication.Details_schoolBag;
import com.example.myapplication.Details_travelBag;
import com.example.myapplication.R;

import java.util.ArrayList;


public class Home extends Fragment {

    ArrayList<Bags> bagsArrayList = new ArrayList<>();

    // // // // //



    public Home() {
        // Required empty public constructor
        Bags travelBag = new Bags(R.drawable.this_travel,"Travel Bag");
        Bags schoolBag = new Bags(R.drawable.this_school, "School Bag");
        Bags picnicBag = new Bags(R.drawable.this_picnic, "Picnic Bag");
        Bags babyBag = new Bags(R.drawable.this_baby, "Baby Bag");

        bagsArrayList.add(travelBag);
        bagsArrayList.add(schoolBag);
        bagsArrayList.add(picnicBag);
        bagsArrayList.add(babyBag);

        // // // // //




    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View contentView = inflater.inflate(R.layout.fragment_home, container, false);
        BagsAdapter bagsAdapter = new BagsAdapter(getActivity(), 0, bagsArrayList);
        ListView listView = contentView.findViewById(R.id.bagsListView);
        listView.setAdapter(bagsAdapter);

        // // // // //

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Bags currentBag = bagsArrayList.get(i);

                // // // // //

                if (currentBag.getBagType() == "Travel Bag"){

                    Intent travelBagIntent = new Intent(getActivity(), Details_travelBag.class);
                    startActivity(travelBagIntent);



                }else if (currentBag.getBagType() == "School Bag") {

                    Intent schoolBagIntent = new Intent(getActivity(), Details_schoolBag.class);
                    startActivity(schoolBagIntent);



                }else if (currentBag.getBagType() == "Picnic Bag") {

                    Intent picnicBagIntent = new Intent(getActivity(), Details_picnicBag.class);
                    startActivity(picnicBagIntent);



                }else if (currentBag.getBagType() == "Baby Bag") {

                    Intent babyBagIntent = new Intent(getActivity(), Details_babyBag.class);
                    startActivity(babyBagIntent);
                }


                // // // // //





            }
        });


        return contentView;


    }
}