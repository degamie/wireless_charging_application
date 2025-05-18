package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import android.net.MacAddress;
import android.net.NetworkSpecifier;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;
import android.os.Bundle;
import android.os.PatternMatcher;

import java.util.Formatter;

import javax.crypto.Mac;

public class WifiDetails extends  BatteryWireless{
    public int linkSpeed=0;
    public WifiInfo wifiInfo;
    public int ip=0;
    public int ssid=0;
    public int networkId=0;
    public String macAddress=null;
    public String OnStart(int linkSpeed,int ip,int ssid,int networkId,String macAddress,WifiInfo wifiInfo){
        if(linkSpeed==0)return;
        while(linkSpeed!=0){
            if(linkSpeed>=0)
            {
                linkSpeed+=ip;
            }else if(ip>0 && ssid>0)ip+=ssid;ssid+=linkSpeed;
        }return  linkSpeed;
    }

    public WifiDetails wifiDetails;
    public void setWifiDetails(){
        final NetworkSpecifier networkSpecifier=new WifiNetworkSpecifier
                .Builder()
                .setSsidPattern(new PatternMatcher("Wifi test",PatternMatcher.PATTERN_PREFIX))
                .setBssid(MacAddress.fromString("49.36.144.157",MacAddress.fromString("ff:ff:00:00:00:00")))
                .build();


    int ip= WifiInfo.getIpAddress();
    String macAddress=WifiInfo.getMacAddress();
    String bssId=WifiInfo.getBSSID();
    int rssid=wifiInfo.getRssi();
    String linkSpeed=wifiInfo.getLinkSpeed();
    int ssid=wifiInfo.getSSID();
    int networkId=wifiInfo.getNetworkId();
}
    public String getAllWifiDetails(int ip,int ssid,int networkId,int bssId,int rssid,String macAddress,String linkSpeed){
        return setWifiDetails( ip, ssid, networkId, bssId, rssid, macAddress, linkSpeed);
    }
  public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        String ip= Formatter.formatIpAddress(WifiManager.getConnectionInfo().getIpAddress());
  }
}