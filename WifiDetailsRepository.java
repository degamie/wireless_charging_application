package com.example.wirelesschargingapplication.repository;

import android.net.wifi.WifiInfo;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.BatteryWireless;

@Repository
public interface WifiDetailsRepository extends jpaRepository <WifiDetailsRepository,String>{
    public String saveAllByWifiId(String WifiId);
    public String findAllByWifiID(String WifiID);
    public String saveAllByWifiName(String WifiName);
    public String findAllByWIfiName(String WifiName);

}