package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Log;

import java.util.logging.Handler;

public class WifiActiveService  extends Service {
    public final String TAG=WifiActiveService.class.getSimpleName();
    String onStartCommand(Intent intent,int flag,int StartId){
        WifiManager wifiManager=(WifiManager) getSystemService(Context.WIFI_SERVICE);
        new Handler().postDelayed(new Runnable());
    }
    public void run(){
        WifiInfo wifiInfo=WifiManager.getConnectionInfo();
        String mac= wifiInfo.getMacAddress();
        String ssid=WifiInfo.getssid();
        if(Log.isLoggable(TAG,Log.VERBOSE)){
            Log.v(TAG,"The SSID and Mac Message are available "+ssid+mac);
        }
    }
}
