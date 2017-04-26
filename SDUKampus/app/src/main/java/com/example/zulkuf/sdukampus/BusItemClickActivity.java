package com.example.zulkuf.sdukampus;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zulkuf.sdukampus.fragments.DayKey;

/**
 * Created by YunusEmre on 24.4.2017.
 */

public class BusItemClickActivity extends AppCompatActivity{

    private ImageView imClick;
    public TextView tv1Click, tv2Click, tv3Click;
    private String busClickTime;
    private String busClickNumber;
    private String busClickRoute;

    public BusItemClickActivity(String[] info){
        busClickNumber = info[0].toString();
        busClickTime = info[1].toString();
        busClickRoute = info[2].toString();
    }
    public BusItemClickActivity(){


    }



    /*public String getBusClickTime() {
        return busClickTime;
    }

    public void setBusClickTime(String busClickTime) {
        this.busClickTime = busClickTime;
    }

    public String getBusClickNumber() {
        return busClickNumber;
    }

    public void setBusClickNumber(String busClickNumber) {
        this.busClickNumber = busClickNumber;
    }

    public String getBusClickRoute() {
        return busClickRoute;
    }

    public void setBusClickRoute(String busClickRoute) {
        this.busClickRoute = busClickRoute;
    }*/



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bus_item_click_activity);

        imClick = (ImageView) findViewById(R.id.ivBusClickNumberImage);
        tv1Click = (TextView) findViewById(R.id.tvBusClickNumber);
        tv2Click = (TextView) findViewById(R.id.tvBusClickTime);
        tv3Click = (TextView) findViewById(R.id.tvBusClickRoute);

        Bundle texts = getIntent().getExtras();
        tv1Click.setText(texts.getString("NUMBER"));
        tv2Click.setText(texts.getString("TIME"));
        tv3Click.setText(texts.getString("ROUTE"));

}




    /*public void busInformation(String[] info){
         setBusClickNumber(info[0].toString());
        busClickTime = info[1].toString();
        busClickRoute = info[2].toString();



    }*/


}


