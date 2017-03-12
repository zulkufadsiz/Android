package com.example.zulkuf.sdukampus.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zulkuf.sdukampus.R;

/**
 * Created by zulkuf on 07/03/17.
 */

public class BusFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bus_fragment, container, false);
    }
}
