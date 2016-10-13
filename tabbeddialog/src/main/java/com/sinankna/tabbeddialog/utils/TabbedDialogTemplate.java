package com.sinankna.tabbeddialog.utils;

import android.support.v4.app.Fragment;

/**
 * Created by skna on 13/10/16.
 */

public class TabbedDialogTemplate {

    private Fragment mFragment;
    private int mLayout;
    private String mTitle;


    public TabbedDialogTemplate(Fragment fragment, int layout, String title) {
        this.mFragment=fragment;
        this.mLayout=layout;
        this.mTitle=title;
    }

    public Fragment getFragment() {
        return mFragment;
    }

    public int getLayout() {
        return mLayout;
    }

    public String getTitle() {
        return mTitle;
    }
}
