package com.example.zulkuf.sdukampus.fragments;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zulkuf.sdukampus.R;
import com.example.zulkuf.sdukampus.data.Channel;
import com.example.zulkuf.sdukampus.data.Item;
import com.example.zulkuf.sdukampus.data.News;
import com.example.zulkuf.sdukampus.service.WeatherServiceCallback;
import com.example.zulkuf.sdukampus.service.YahooWeatherService;

import java.util.List;

/**
 * Created by zulkuf on 07/03/17.
 */

public class MainMenuFragment extends Fragment implements WeatherServiceCallback {
    //News
    private String TAG = MainMenuFragment.class.getSimpleName();
    private Context mContext = getActivity();

    private SwipeRefreshLayout mSwipeRefreshLayout;
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private List<News> mNewsList;


    //Weather
    private ImageView weatherImageIcon;
    private  TextView temperature;
    private  TextView condition;
    private  TextView location;

    private YahooWeatherService service;
    private ProgressDialog dialog;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //Ekran oluşturulur.
        View view = inflater.inflate(R.layout.mainmenu_fragment, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Componentler çağırılır.
        weatherImageIcon = (ImageView)view.findViewById(R.id.weatherIcon);
        temperature  = (TextView)view.findViewById(R.id.weatherTemperature);
        condition  = (TextView)view.findViewById(R.id.weatherCondition);
        location  = (TextView)view.findViewById(R.id.weatherLocation);

        service = new YahooWeatherService(this);

        //Progress Dialog oluşturuldu.
        dialog = new ProgressDialog(getActivity());
        dialog.setMessage("Yükleniyor");
        dialog.show();

        service.refreshWeather("isparta, tr");



    }

    @Override
    public void serviceSuccess(Channel channel) {
            dialog.hide();
        Item item = channel.getItem();
        int reSourceId = getResources().getIdentifier("@drawable/icon_" + item.getCondition().getCode(),null,getActivity().getPackageName());
        @SuppressWarnings("deprecation")
        //Hava Durumu ikonu atandı
        Drawable weatherIconDrawable = getResources().getDrawable(reSourceId);
        weatherImageIcon.setImageDrawable(weatherIconDrawable);

        //Sıcaklık durum ve il değerleri atandı.
        temperature.setText(item.getCondition().getTemperature() + "\u00B0"+channel.getUnits().getTemperature());
        condition.setText(item.getCondition().getDescription());
        location.setText(channel.getLocation().getCity());
    }

    @Override
    public void serviceFailure(Exception exception) {
        //Servis hata mesajı.
        dialog.hide();
        Toast.makeText(getContext(),exception.getMessage(),Toast.LENGTH_SHORT).show();
    }

}
