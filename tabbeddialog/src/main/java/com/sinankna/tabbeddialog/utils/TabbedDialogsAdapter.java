package com.sinankna.tabbeddialog.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by skna on 13/10/16.
 */

public class TabbedDialogsAdapter extends FragmentStatePagerAdapter{

    private ArrayList<TabbedDialogTemplate> mFragmentsList;

    public TabbedDialogsAdapter(FragmentManager fm, ArrayList<TabbedDialogTemplate> fragmentsList) {
        super(fm);
        this.mFragmentsList = fragmentsList;
    }


    @Override
    public Fragment getItem(int position) {
        return mFragmentsList.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return mFragmentsList.size();
    }
}
