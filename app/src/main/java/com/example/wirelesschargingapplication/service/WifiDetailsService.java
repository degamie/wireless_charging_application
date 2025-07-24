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

}