package com.example.wirelesschargingapplication.service;

import android.net.wifi.WifiInfo;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.BatteryWireless;
import com.example.wirelesschargingapplication.repository.WifiDetailsRepository;

@Service
public class WifiDetailsService {
    @AutoWired
    public WifiDetailsRepository wifiDetailsRepository;
    public String getAllByWifiId(String WifiId){
        return wifiDetailsRepository.saveAllByWifiId(WifiId);
    }
    public String setAllByWifiID(String WifiID){
        return wifiDetailsRepository.findAllByWifiID(WifiID);
    }
    public String getAllByipv6Address(String mAcAddress){
        return wifiDetailsRepository.saveAllByipv6Address
    }
    public String  setAllByipv6Address(String ipv6Address){
        return  wifiDetailsRepository.setfindAllByipv6Address(ipv6Address);
    }
}