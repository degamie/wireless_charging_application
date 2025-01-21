package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pDeviceList;
import android.net.wifi.p2p.WifiP2pManager;
import android.service.credentials.Action;
import android.util.Log;
import android.webkit.WebView;

import org.json.JSONArray;

import java.util.List;

public class BatteryListener extends BroadcastReceiver {
    public Reciever reciever;
    public WifiP2pManager.PeerListListener =new WifiP2pManager.PeerListListener<>();
    @Override
    public void onPeersAvailable(WifiP2pDeviceList peersList){
        List<WifiP2pDevice>refreshedPeeers=peersList.getDeviceList();
        if(!refreshedPeeers.equals(peersList)){
            peersList.clear();
        }
    }
    public void onExecute(String action, JSONArray args, CallbackContext callbackContext){
        if(action.equals("Start Battery")){
            if(this.BatteryContextCallBack!=null){
                removeBatteryListener();
                this.batteryCallbackContext=callbackContext;
            }
            IntentFilter intentFilter=new IntentFilter();
            intentFilter.addAction(Intent.ACTION_BATTERY_CHANGED);
            if(this.reciever==null){
                this.reciever=new BroadcastReceiver();
            }
        }
    }

    private void removeBatteryListener() {
        return;
    }

    @Override
    public final String TAG="BatteryListener";
    public  IntentAction intentAction;
    public void onRecieve(Context context, Intent intent){
        intent=intent.getAction();
        if(intentAction.equalsIgnoreCase("android.intent.action.ACTION_POWER_CONNECTED")){Log.i(TAG,"Battery Connected");}
        else {Log.i(TAG,"Battery Disconnected");}
        updateBatteryInfo(intent);
        WebView.getContext().registerReciever(this.reciever,inentFilter);
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
