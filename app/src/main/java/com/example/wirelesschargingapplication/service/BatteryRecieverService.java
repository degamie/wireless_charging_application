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
    public String getAllByconnectivityManager(ConnectivityManager connectivityManager){
        return battteryRecieverRepository.saveAllByconnectivityManager(connectivityManager);//Fetching Battery Reciever
    }
    public String setAllByBatteryLevel(Integer mBatteryLevel){
        return  battteryRecieverRepository.findAllByBatteryLevel(mBatteryLevel);
    }
    public String getAllByNetworkInfo(String networkInfo){
        return battteryRecieverRepository.saveAllByNetworkInfo(networkInfo);
    }
    public String setAllByNetworkInfo(String networkInfo){
        return battteryRecieverRepository.findAllByNetworkInfo(networkInfo);
    }
//    public String findAllByTextInfo(String textInfo)
    public String networkReciever(Context context){
        ConnectivityManager connectivityManager=context.getSystemService(context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=connectivityManager.getActiveNetwork();
        return networkInfo!=null && networkInfo.isConnected();
    }public Integer batteryChanged(Integer mBatteryLevel){
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
    public String setAllBymAcOnUsb(Integer mAcOnUsb){
        return battteryRecieverRepository.findAllBymAcOnUsb(mAcOnUsb);//Binding All Ac Type's Usb's Connect
}
    public String upateAllBynetworkInfo(String networkInfo,Integer mBatteryLevel){
        batteryRecieverRepository= battteryRecieverRepository.findAllBynetworkInfo(networkInfo);
        networkInfo.contains(mBatteryLevel);
        battteryRecieverRepository.saveAllbyNetworkInfo(networkInfo);
    }
    }