package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import android.net.wifi.WifiInfo;

public class WifiDetails extends  BatteryWireless{
    public WifiInfo wifiInfo;
    public int ip=0;
    public int ssid=0;
    public int networkId=0;
    public String macAddress=null;
    public String linkSpeed=null;
    public WifiDetails wifiDetails;
    public void setWifiDetails(){

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
}