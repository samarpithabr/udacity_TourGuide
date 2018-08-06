package com.example.shara.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private Context context;




    public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new krsFragment();
        } else if (position == 1) {
            return new BluffFragment();
        } else if (position == 2) {
            return new AdhiFragment();

        } else if (position == 3) {
            return new SriFragment();

        } else {
            return null;
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.Places);
        } else if (position == 1) {
            return context.getString(R.string.rest);
        } else if (position == 2) {
            return context.getString(R.string.hot);
        } else
            return context.getString(R.string.shop);


    }

  /*  public View getTabView(int position) {
        // Given you have a custom layout in `res/layout/custom_tab.xml` with a TextView and ImageView
        View v = LayoutInflater.from(context).inflate(R.layout.list, null);
        ImageView img = (ImageView) v.findViewById(R.id.list_id);
        img.setImageResource(imageResId[position]);
        TextView tv = (TextView) v.findViewById(R.id.event_name);
        tv.setText(tabTitles[position]);
        TextView tv1 = (TextView) v.findViewById(R.id.restaurant_name);

        return v;
    }*/


}