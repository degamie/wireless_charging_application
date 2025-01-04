package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

public class BatteryListener extends BroadcastReceiver {
    @Override
    public final String TAG="BatteryListener";
    public  IntentAction intentAction;
    public void onRecieve(Context context, Intent intent){
        intent=intent.getAction();
        if(intentAction.equalsIgnoreCase("android.intent.action.ACTION_POWER_CONNECTED")){Log.i(TAG,"Battery Connected");}
        else {Log.i(TAG,"Battery Disconnected");}
    }
    protected void onStart(){
        super.onStart();
        BroadcastReceiver broadcastReceiver=new BroadcastReceiver();
        IntentFilter intentFilter=new IntentFilter();
        intentFilter.addAction(Intent.ACTION_POWER_CONNECTED);
        intentFilter.addAction(Intent.ACTION_POWER_DISCONNECTED);
        this.registerReciever(broadcastReceiver,intentFilter);
    }
}
