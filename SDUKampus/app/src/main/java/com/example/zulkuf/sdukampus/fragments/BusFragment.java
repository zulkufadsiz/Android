package com.example.zulkuf.sdukampus.fragments;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.zulkuf.sdukampus.ListViewDenemesi;
import com.example.zulkuf.sdukampus.R;

/**
 * Created by zulkuf on 07/03/17.
 */

public class BusFragment extends Fragment {

    private String[] time  = {"Dört","Sekiz","Onİki","OnSekiz","OtuzYedi","KırkAltı","KırkYedi"};
    private String[] location  = {"Batı","Tıp","Doğu","Tönge","Mevlana","Batıkent","Halıkent"};
    private String[] numbers  = {"4","8","12","18","37","46","47"};
    private ListView mBusList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bus_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBusList = (ListView)view.findViewById(R.id.busListView);
        MyArrayAdapter myArrayAdapter = new MyArrayAdapter(getContext());

        mBusList.setAdapter(myArrayAdapter);

    }

    private class MyArrayAdapter extends ArrayAdapter<String> {
        public MyArrayAdapter(@NonNull Context context) {
            super(context, R.layout.custom_bus_list_item,time);
        }

        @Override
        public int getItemViewType(int position) {
            return super.getItemViewType(position);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view  = layoutInflater.inflate(R.layout.custom_bus_list_item,parent,false);

            ImageView img = (ImageView)view.findViewById(R.id.ivBusNumberImage);
            TextView tv1 = (TextView)view.findViewById(R.id.tvBusTime);
            TextView tv2 = (TextView)view.findViewById(R.id.tvBusRoute);
            TextView tv3 = (TextView)view.findViewById(R.id.tvBusNumber);


            tv1.setText(time[position]);
            tv2.setText(location[position]);
            tv3.setText(numbers[position]);


            return view;
        }
    }
}
