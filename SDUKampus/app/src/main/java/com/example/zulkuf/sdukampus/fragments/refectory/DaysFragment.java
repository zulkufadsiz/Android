package com.example.zulkuf.sdukampus.fragments.refectory;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.zulkuf.sdukampus.R;
import com.example.zulkuf.sdukampus.fragments.DayKey;
import com.example.zulkuf.sdukampus.fragments.pool.DaysList;


/**
 * Created by zulkuf on 14/03/17.
 */

public class DaysFragment extends Fragment {
    TabLayout tabLayout;
    int day;
    DaysList list = new DaysList();
    ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pool_days_fragment, container, false);
        return view;


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }



}