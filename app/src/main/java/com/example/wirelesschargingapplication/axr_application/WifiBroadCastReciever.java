package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.GnssAntennaInfo.Listener;
import android.net.wifi.p2p.WifiP2pManager;
import android.service.credentials.Action;

import com.example.axr_application.MainActivity;

import java.nio.channels.Channel;

public class WifiBroadCastReciever extends BroadcastReceiver{
    public BroadcastReceiver broadcastReceiver;
    public WifiP2pManager wifiP2pManager;
    public Channel channel;
    public MainActivity mainActivity;
    public final WifiBroadCastReciever listener;
    private void onWifiChangeBroadcastListener(Context context, Intent intent){
        super();
        this.wifiP2pManager=wifiP2pManager;
        this.channel=channel;
        this.mainActivity=mainActivity;

    }
    @Override
    public void onRecieve(Context context,Intent intent){
        Action action=intent.getAction();
        if(wifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION.equals(action)){}
        else if(wifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION.equals(action)){}
        else if(wifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION.equals(action)){}

    }
    public void wifiBroadCastReciever(WifiBroadCastReciever listener){
        this.listener=listener;
    }
    public interface wifiChangeBroadCastLister{
        void onWifiChangeBroadcastListener(Context context,Intent intent);
    }
    public void onReciever(Context context, Intent intent){
        listener.onWifiChangeBroadcastListener(context,intent);
    }



}
