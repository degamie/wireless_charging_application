package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import static androidx.compose.ui.semantics.SemanticsPropertiesKt.setText;

import android.content.Context;
import android.content.Intent;
import android.hardware.BatteryState;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.TextView;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.BatteryWireless;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BroadCastReciever;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatteryReciever;

import java.util.List;

@Repository
public interface  BatteryRecieverRepository  extends JpaRepository<BatteryReciever,String> {//BatteryReciever class inherititing BroadCastReciever
    public List<BatteryReciever> findAll();//FindingAll The BatteryReciever
    public List<BatteryReciever>saveAll();
    public String saveAllByconnectivityManager(ConnectivityManager connectivityManager);

     @Autowired
     public com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatteryReciever BatteryReciver;
     public String saveAllByBatteryLevel(Integer mBatteryLevel);
     public String findAllByBatteryLevel(Integer mBatteryLevel);
     public String saveAllByNetworkInfo(String networkInfo);
     public String findAllByNetworkInfo(String networkInfo);
     public String findAllByTextInfo(String textInfo);
     public String saveAllByTextInfo(String textInfo);
    }