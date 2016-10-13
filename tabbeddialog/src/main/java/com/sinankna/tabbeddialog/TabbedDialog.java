package com.sinankna.tabbeddialog;

import android.support.v4.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sinankna.tabbeddialog.utils.CustomViewPager;
import com.sinankna.tabbeddialog.utils.TabbedDialogTemplate;
import com.sinankna.tabbeddialog.utils.TabbedDialogsAdapter;

import java.util.ArrayList;

/**
 * Created by skna on 13/10/16.
 */

public class TabbedDialog extends DialogFragment {

    private ArrayList<TabbedDialogTemplate> mFragmentsList = new ArrayList<TabbedDialogTemplate>();

    private TabLayout mTabLayout;
    private CustomViewPager mViewPager;
    private TabbedDialogsAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.dialog_main,null);

        mTabLayout = (TabLayout) view.findViewById(R.id.main_tablayout);
        mViewPager = (CustomViewPager) view.findViewById(R.id.main_viewpager);
        mAdapter = new TabbedDialogsAdapter(getChildFragmentManager(), mFragmentsList);

        for(int i=0;i<mFragmentsList.size();i++) {
            mTabLayout.addTab(mTabLayout.newTab().setText(mFragmentsList.get(i).getTitle()));
        }

        mViewPager.setAdapter(mAdapter);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        return view;
    }

    public void addFragment(TabbedDialogTemplate fragment) {
        mFragmentsList.add(fragment);
    }

    public void removeFragment(TabbedDialogTemplate fragment) {
        mFragmentsList.remove(fragment);
    }

}
