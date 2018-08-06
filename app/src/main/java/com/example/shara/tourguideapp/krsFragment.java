package com.example.shara.tourguideapp;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.shara.tourguideapp.R.id.Krs_list;

/**
 * A simple {@link Fragment} subclass.
 */
public class krsFragment extends Fragment {


    @Override
    public void onStop() {
        super.onStop();
    }

    public krsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_krs, container, false);
        final ArrayList<Tour> arraylist;
        arraylist = new ArrayList<Tour>();
        arraylist.add(new Tour(R.drawable.k1, getString(R.string.krsd), getString(R.string.krs)));
        arraylist.add(new Tour(R.drawable.rangan, getString(R.string.rangan), getString(R.string.rangand)));
        arraylist.add(new Tour(R.drawable.brund, getString(R.string.bru), getString(R.string.brund)));
        arraylist.add(new Tour(R.drawable.bluff, getString(R.string.gagan), getString(R.string.bird)));

        TourAdapter adapter = new TourAdapter(getActivity(), arraylist);
        ListView listview = rootView.findViewById(R.id.Krs_list);
        listview.setAdapter(adapter);
        return rootView;

    }

}
