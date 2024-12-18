package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.wirelesschargingapplication.R;

public class BatteryWireless extends AppCompatActivity {
    TextView textWifiInfo;
    Button btnInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_main);
        textWifiInfo=(textViewInfo) findViewById(R.id.idText);
        btnInfo=(Button) findViewById(R.id.idBtm);
    }
}
