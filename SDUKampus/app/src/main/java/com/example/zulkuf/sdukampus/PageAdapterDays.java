package com.example.zulkuf.sdukampus;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.zulkuf.sdukampus.fragments.pool.DaysFragment;

/**
 * Created by zulkuf on 07/03/17.
 */

public  class PageAdapterDays extends FragmentStatePagerAdapter {

    int mNumofTabs;
    public PageAdapterDays(FragmentManager fm,int NumOfTabs) {
        super(fm);
        this.mNumofTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                DaysFragment tab1 = new DaysFragment();
                return tab1;
            case 1:
                DaysFragment tab2 = new DaysFragment();
                return tab2;
            case 2:
                DaysFragment tab3 = new DaysFragment();
                return tab3;
            case 3:
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return mNumofTabs;
    }
}
