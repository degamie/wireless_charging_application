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
    @GetMapping("/saveAll/{WifiID}save")
    public String getAllByipv6Address(String mAcAddress){
        return wifiDetailsService.saveAllByipv6Address get
    }
    @PostMapping("/findAll/{WifiID}")
    public String  setAllByipv6Address(String ipv6Address){
        return  wifiDetailsService.setfindAllByipv6Address(ipv6Address);//Retriving ipv6Address in Server
    }
    @PostMapping("/findAll/{mAcAddress}")
    public String setAllBymAcAddress(String mAcAddress){
        return  wifiDetailsRepository.findAllBymAcAddress(mAcAddress);//Binding mAcAddress in Server
    }



}