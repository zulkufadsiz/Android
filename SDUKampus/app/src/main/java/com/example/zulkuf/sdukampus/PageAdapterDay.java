package com.example.zulkuf.sdukampus;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.zulkuf.sdukampus.fragments.BusFragment;
import com.example.zulkuf.sdukampus.fragments.MainMenuFragment;
import com.example.zulkuf.sdukampus.fragments.PoolFragment;
import com.example.zulkuf.sdukampus.fragments.RefectoryFragment;

/**
 * Created by zulkuf on 19/03/17.
 */

public class PageAdapterDay extends FragmentStatePagerAdapter {
    int numOfTabs;
    public PageAdapterDay(FragmentManager fm,int NumOfTabs) {
        super(fm);
        this.numOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                MainMenuFragment tab1 = new MainMenuFragment();
                return tab1;
            case 1:
                BusFragment tab2 = new BusFragment();
                return tab2;
            case 2:
                RefectoryFragment tab3 = new RefectoryFragment();
                return tab3;
            case 3:
                PoolFragment tab4 = new PoolFragment();
                return tab4;

            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}
