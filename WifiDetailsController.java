package com.example.wirelesschargingapplication.Controller;

import android.net.wifi.WifiInfo;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.BatteryWireless;
import com.example.wirelesschargingapplication.repository.WifiDetailsRepository;

@Controller
public class WifiDetailsController {
    WifiDetailsController wifiDetailsController=new WifiDetailsController();
    @AutoWired
    public WifiDetailsService wifiDetailsService;
    @GetMapping("/saveAll/{WifiId}")//Fetching WIfiDetails in Server
    public String getAllByWifiId(String WifiId){
        return wifiDetailsService.getAllByWifiId(WifiId);
    }
    @PostMapping("/findAll/{WifiID}")
    public String setAllByWifiID(String WifiID){//Retriving WifiID in Server
        return wifiDetailsService.findAllByWifiID(WifiID);
    }


}