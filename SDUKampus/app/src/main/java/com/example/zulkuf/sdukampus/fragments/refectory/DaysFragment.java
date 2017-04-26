package com.example.zulkuf.sdukampus.fragments.refectory;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zulkuf.sdukampus.fragments.DayKey;

/**
 * Created by zulkuf on 14/03/17.
 */

public class DaysFragment extends Fragment implements DayKey {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void dayKey(int key) {

    }

}
