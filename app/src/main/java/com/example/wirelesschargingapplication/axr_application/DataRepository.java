package com.example.wirelesschargingapplication.axr_application;
import android.content.Context;
import android.content.Intent;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatteryReciever;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.WifiBroadCastReciever;
 import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.wifiChangeBroadCastLister;
public interface DataRepository  extends BatteryReciever implements  wifiChangeBroadCastLister{//inheriting BatteryReciever class and wifiChangeBroadCastLister
    //Obj declare
    public wifiChangeBroadCastLister wifiChangeBroadCastLister;
    public DataRepository dataRepository;
    //Method Declare
    public String networkReciever(Context context);

    public String onReciever(Context context, Intent intent) ;
    public Integer batteryChanged(mBatteryLevel);
}
