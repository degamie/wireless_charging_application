package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatteryWireless
import static android.content.Context.WIFI_SERVICE;

import android.content.Context;
import android.content.Intent;
import android.hardware.BatteryState;
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
public class BatteryWireless extends MainActivity {
    public BatteryState batteryState;
    public BatteryWireless batteryWireless = new BatteryWireless();
    public View view;

    public void getWifiInfo(View view) {
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        int ip = WifiInfo.getIpAddress();
        String macAddress = WifiInfo.getMacAddress();
        String bssId = WifiInfo.getBSSID();
        int rssid = wifiInfo.getRssi();
        String linkSpeed = WifiInfo.getLinkSpeed();
        int ssid = WifiInfo.getSSID();
        int networkId = WifiInfo.getNetworkId();
    }
}
public class BatteryWireless extends AppCompatActivity {
    public BatteryWireless batteryWireless;
    public WifiBroadCastReciever wifiBroadCastReciever;
    public WifiManager wifiManager;
    public TextView textWifiInfo;
    public Button btnInfo;
}
    public class BatteryWireless extends WifiDetails{
        public Boolean iswifiVal=false;
        public BatteryWireless batteryWireless;
        public WifiDetails wifiDetails=new WifiDetails();

        @Override
        public String setWifiDetails(BatteryState batteryState) {
            batteryState.getCapacity();
            WifiManager.WIFI_STATE_ENABLED;

            super.setWifiDetails();
            if(wifiDetails==wifiDetails.getAllWifiDetails()){
                iswifiVal=true;
            }else iswifiVal=false;
        }return iswifiVal ;
    }

public class BatteryWireless extends WifiDetails{
    public Boolean iswifiVal=false;
    public BatteryWireless batteryWireless;
    public WifiDetails wifiDetails=new WifiDetails();

    @Override
    public String setWifiDetails() {
        super.setWifiDetails();
        if(wifiDetails==wifiDetails.getAllWifiDetails()){
            iswifiVal=true;
        }else iswifiVal=false;
    }return iswifiVal ;
}
public class BatteryWireless extends WifiBroadCastReciever{

    public void onReponse(Context context, Intent intent,View view){

        System.out.println("Response Connected",MainActivity.getWifiInfo(view));
    }
}
