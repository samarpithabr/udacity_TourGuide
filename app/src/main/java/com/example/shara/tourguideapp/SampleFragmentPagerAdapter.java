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
            return new SriFragment();

        } else
            return new AdhiFragment();
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
}