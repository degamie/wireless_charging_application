package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator;
import static android.content.Context.USB_SERVICE;
import static android.provider.SyncStateContract.Helpers.update;

import static androidx.core.content.ContextCompat.getSystemService;
import static androidx.core.content.ContextCompat.registerReceiver;

import android.app.ApplicationErrorReport;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.BatteryState;
import android.hardware.usb.UsbManager;
import android.os.BatteryManager;
import android.os.DropBoxManager;
import android.provider.Settings;

//import androidx.appcompat.app.AppCompatActivity;

import com.example.wirelesschargingapplication.MainActivity;
//import com.example.wirelesschargingapplication.R;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.UEventObserver.UeventObserver;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.UsbReciever.UsbReciever;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.wifi.WifiBroadCastReciever;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.wifi.WifiDetails;

import java.io.File;
import java.io.FileOutputStream;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.LED;
//public class BatteryWireless extends AppCompatActivity implements WifiBroadCastReciever.wifiChangeBroadCastLister{

public class BatteryWirelessService{
    @Autowired
    public BatteryWirelessRepository batteryWirelessRepository;
    public String getAllBatteryState(BatteryState batteryState0){
        return batteryWirelessRepository.saveAllBatteryState(batteryState);
    }
}

//    public BatteryState batteryState;
//    public BatteryWireless batteryWireless = new BatteryWireless();
//    public View view;
//
//    public void getWifiInfo(View view) {
//        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
//        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
//        int ip = WifiInfo.getIpAddress();
//        String macAddress = WifiInfo.getMacAddress();
//        String bssId = WifiInfo.getBSSID();
//        int rssid = wifiInfo.getRssi();
//        String linkSpeed = WifiInfo.getLinkSpeed();
//        int ssid = WifiInfo.getSSID();
//        int networkId = WifiInfo.getNetworkId();
//    }
//}
//public class BatteryWireless extends AppCompatActivity {
//    public BatteryWireless batteryWireless;
//    public WifiBroadCastReciever wifiBroadCastReciever;
//    public WifiManager wifiManager;
//    public TextView textWifiInfo;
//    public Button btnInfo;
//}
//    public class BatteryWireless extends WifiDetails{
//        public Boolean iswifiVal=false;
//        public BatteryWireless batteryWireless;
//        public WifiDetails wifiDetails=new WifiDetails();
//
//        @Override
//        public String setWifiDetails(BatteryState batteryState) {
//            batteryState.getCapacity();
//            WifiManager.WIFI_STATE_ENABLED;
//
//            super.setWifiDetails();
//            if(wifiDetails==wifiDetails.getAllWifiDetails()){
//                iswifiVal=true;
//            }else iswifiVal=false;
//        }return iswifiVal ;
//    }
//
//public class BatteryWireless extends WifiDetails {
//    public Boolean iswifiVal=false;
//    public BatteryWireless batteryWireless;
//    public WifiDetails wifiDetails=new WifiDetails();
//
//    @Override
//    public String setWifiDetails() {
//        super.setWifiDetails();
//        if(wifiDetails==wifiDetails.getAllWifiDetails()){
//            iswifiVal=true;
//        }else iswifiVal=false;
//    }return iswifiVal ;
//}
//public class BatteryWireless extends WifiBroadCastReciever{
//
//    public void onReponse(Context context, Intent intent,View view){
//
//        System.out.println("Response Connected",MainActivity.getWifiInfo(view));
//    }
