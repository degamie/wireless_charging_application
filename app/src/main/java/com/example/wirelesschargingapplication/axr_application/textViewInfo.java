package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import android.os.Bundle;
import android.widget.TextView;

import com.example.wirelesschargingapplication.R;

public class textViewInfo {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_main);
        TextView textViewInfo=(textViewInfo) findViewById(R.id.text_view_id);

        textViewInfo.setText(R.string.user_wireless_charging);
    }
}
    //        WirelessChargingText

