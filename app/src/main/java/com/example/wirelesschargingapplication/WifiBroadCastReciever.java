package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.GnssAntennaInfo.Listener;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.os.Looper;
import android.service.credentials.Action;

//import com.example.axr_application.MainActivity;
import com.example.wirelesschargingapplication.DeviceListFragment;
import com.example.wirelesschargingapplication.R;

import java.nio.channels.Channel;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.MainBatteryManagement;
public interface wifiChangeBroadCastLister{
    void onWifiChangeBroadcastListener(Context context,Intent intent);
}

public class WifiBroadCastReciever extends BroadcastReceiver implements wifiChangeBroadCastLister{
    public DeviceListFragment deviceListFragment=null;

    public BroadcastReceiver broadcastReceiver;
    public WifiP2pManager wifiP2pManager;
    public Channel channel;
    public MainBatteryManagement mainActivity;
    public IntentFilter intentFilter;
    public Context context;

    public final WifiBroadCastReciever listener;
    public String getWifiBroadCastReciever(WifiBroadCastReciever listener){
        return listener;
    }
    private void onWifiChangeBroadcastListener(Context context, Intent intent){
        super();
        this.wifiP2pManager=wifiP2pManager;
        this.channel=channel;
        this.mainActivity=mainActivity;

    }
    public void onResume(){
        public BroadcastReceiver broadcastReceiver;
        broadcastReceiver=new WifiBroadCastReciever(broadcastReceiver,channel,this);
    }
    public void onPause(IntentFilter intentFilter){
        super.onPause();
        unregisterReciever(broadcastReceiver);
    }

    public void onCreate(Bundle savedInstanceState){
        wifiP2pManager=(wifiP2pManager)getSystemSerializable(context.WIFI_SERVICE);
        channel=wifiP2pManager.initialize(this, Looper.getMainLooper(),null);
        broadcastReceiver=new WiFiDirectBroadcastReceiver(wifiP2pManager,channel,this);

        intentFilter.addAction(WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION);
        intentFilter.addAction(WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION);
        intentFilter.addAction(WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION);
        intentFilter.addAction(WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION);

    }

    private Object getSystemSerializable(String wifiService) {
        return null;
    }

    @Override
    public void onRecieve(Context context,Intent intent){
        Action action=intent.getAction();
        if(wifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION.equals(action)){}
        else if(wifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION.equals(action)){}
        else if(wifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION.equals(action)){
            DeviceListFragment deviceListFragment=(deviceListFragment) actvity.getFragmentManager();
//            deviceListFragment.findFragmentById(R.id.frag_list);
            deviceListFragment.finalize(R.id.frag_list);
            deviceListFragement.updateThisDevice((wifiP2pManager)intent.getParcelableExtra(WifiP2pManager.EXTRA_WIFI_P2P_DEVICE));
        }

    }

    public void wifiBroadCastReciever(WifiBroadCastReciever listener){
        this.listener=listener;
    }

    public void onReciever(Context context, Intent intent){
        listener.onWifiChangeBroadcastListener(context,intent);
        if(!intent.getAction().equals(WifiManager.ACTION_WIFI_NETWORK_SUGGESTION_POST_CONNECTION)){
            return;
        }
    }



}
