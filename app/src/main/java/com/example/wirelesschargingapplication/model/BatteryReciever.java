package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import static androidx.compose.ui.semantics.SemanticsPropertiesKt.setText;

import android.content.Context;
import android.content.Intent;
import android.hardware.BatteryState;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.TextView;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.BatteryWireless;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BroadCastReciever;

@Getter
@Setter
@AllParamsConstructor
@NoParamsConstructor
public class BatteryReciever  extends BroadCastReciever {//BatteryReciever class inherititing BroadCastReciever
    @Id
    @GeneratedValue(strategy=GENERATIONTYPE.IDENTITY)
    @Column(unique=true,nullable=false)
    public Context context;
    @Column(unique=true,nullable=false)
    public Integer mBatteryLevel;
    @Column(unique=true,nullable=false)
    public String setBatteryLevel(Integer mBatteryLevel){this.mBatteryLevel=mBatteryLevel;}//Binding MBatteryLevel

    public TextView textView;
    @Column(unique=true,nullable=false)
    public String  networkInfo=null;
    @Column(unique=true,nullable=false)
    public ConnectivityManager connectivityManager = null;
    @Column(unique=true,nullable=false)
    public BatteryReciever batteryReciever;
    }