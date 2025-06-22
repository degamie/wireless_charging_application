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
import  com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatteryRecieverRepository;
@Service
public class BatteryRecieverService {
    @Autowired
    public BatteryRecieverRepository battteryRecieverRepository;
    public String getAllByBatteryLevel(Integer mBatteryLevel){
        return battteryRecieverRepository.saveAllByBatteryLevel(mBatteryLevel);
    }
    public String networkReciever(Context context){
        ConnectivityManager connectivityManager=context.getSystemService(context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=connectivityManager.getActiveNetwork();
        return networkInfo!=null && networkInfo.isConnected();
    }public Integer batteryChanged(mBatteryLevel){
        if(mBatteryLevel==0)return 0;
        while(mBatteryLevel!=0){
                else if(mBatteryLevel>0)mBatteryLevel++;
            else mBatteryLevel=0;
        }
        return mBatteryLevel;
    }@Override
    public String onReciever(Context context, Intent intent) {
        return super.onReciever(context, intent);
        int BatteryPercentage=intent.getIntExtra("level",0);
        TextView textView.setText(BatteryPercentage+"%");

    }
    }