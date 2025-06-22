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


    @GetMapping("/save/{mBatteryLevel")
    public String getAllByBatteryLevel(@PathVariable("mbatteryLevel") Integer mBatteryLevel, @RequestBody BatteryReciever batteryReciever) {//Fetching BatteryLevel

        return batteryRecieverService.getAllByBatteryLevel(mBatteryLevel);
    }
}