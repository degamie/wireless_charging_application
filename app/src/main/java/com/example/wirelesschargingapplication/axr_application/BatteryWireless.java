package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.wirelesschargingapplication.MainActivity;
import com.example.wirelesschargingapplication.R;

//public class BatteryWireless extends AppCompatActivity implements WifiBroadCastReciever.wifiChangeBroadCastLister{
public class BatteryWireless extends AppCompatActivity {
    public WifiBroadCastReciever wifiBroadCastReciever;
    public WifiManager wifiManager;
    TextView textWifiInfo;
    Button btnInfo;
}
public class BatteryWireless extends MainActivity{
    public BatteryWireless batteryWireless=new BatteryWireless();
    public  View view;
        public void getWifiInfo(View view){
        WifiManager wifiManager=(WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo=wifiManager.getConnectionInfo();
        int ip=WifiInfo.getIpAddress();
        String macAddress=WifiInfo.getMacAddress();
        String bssId=WifiInfo.getBSSID();
        int rssid=wifiInfo.getRssi();
        String linkSpeed=WifiInfo.getLinkSpeed();
        int ssid=WifiInfo.getSSID();
        int networkId=WifiInfo.getNetworkId();
    }
    public void onReponse(Context context, Intent intent){

        System.out.println("Response Connected"+getWifiInfo(view));
    }
}
public class BatteryWireless extends WifiBroadCastReciever{

}

