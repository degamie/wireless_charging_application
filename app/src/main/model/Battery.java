package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.model;

import android.text.Editable;

public class Battery{
    public Long batteryId;
    public String batteryName;
    public String  wifiId;
    public String wifiName;
    public Integer BatteryPercentage ;

    public void setWifiId(){
        this.wifiId=+wifiId;
    }
    public void setBatteryId(Editable batteryId){
        this.batteryId= this.batteryId;
    }
    public void setBatteryName(){
        this.batteryName=batteryName;
    }

    public void setWifiName(){
        this.wifiName=wifiName;
    }
    public void setBatteryPercentage(){
        this.BatteryPercentage=BatteryPercentage;
    }
}
