package com.example.wirelesschargingapplication.Controller;

import static androidx.compose.ui.semantics.SemanticsPropertiesKt.setText;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.TextView;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatteryRecieverRepository;
import  com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatteryRecieverService;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatteryReciever;
@Controller
@Component
public class BatteryRecieverController {//BatteryRecieverController class Declare
    @Autowired
    public BatteryRecieverService batteryRecieverService;//batteryRecieverService's Lib Injection
    @GetMapping("/save/{connectivityManager}")//Fetching Battery Reciever in Server
    public String getAllByconnectivityManager(ConnectivityManager connectivityManager){
        return battteryRecieverService.getAllByconnectivityManager(connectivityManager);
    }

    @GetMapping("/save/{mBatteryLevel")
    public String getAllByBatteryLevel(@PathVariable("mbatteryLevel") Integer mBatteryLevel, @RequestBody BatteryReciever batteryReciever) {//Fetching BatteryLevel

        return batteryRecieverService.getAllByBatteryLevel(mBatteryLevel);
    }
    @PostMapping("findAll/{mBatteryLevel}")//Binding All batteryLevel
    public String setAllByBatteryLevel(Integer mBatteryLevel){
        return  battteryRecieverRepository.findAllByBatteryLevel(mBatteryLevel);
    }
    @GetMapping("/savAll/{networkInfo}")//Fetching NetworkInfo
    public String getAllByNetworkInfo(String networkInfo){
        return battteryRecieverRepository.saveAllByNetworkInfo(networkInfo);
    }
    @PostMapping("/findAll/{networkInfo}")//Binding NetworkInfo in Server
    public String setAllByNetworkInfo(String networkInfo){
        return battteryRecieverRepository.findAllByNetworkInfo(networkInfo);
    }
    @PostMapping("/findAll/{mAcOnUsb}")
    public String setAllBymAcOnUsb(Integer mAcOnUsb){
        return battteryRecieverRepository.findAllBymAcOnUsb(mAcOnUsb);//Retrival All Ac Type's Usb's Connect in Server
    }
    @PutMapping("/updateAll/{networkInfo}")//Updating All NetworkInfo in Service Layer
    public String upateAllBynetworkInfo(String networkInfo){
        return batteryRecieverService.upateAllBynetworkInfo()
    }



}