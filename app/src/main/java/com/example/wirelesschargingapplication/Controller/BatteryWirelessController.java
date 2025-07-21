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
import com.example.wirelesschargingapplication.service.BatteryWirelessService;

//public class BatteryWireless extends AppCompatActivity implements WifiBroadCastReciever.wifiChangeBroadCastLister{
@Controller
public class BatteryWirelessController{
    public UsbReciever usbReciever;
    public Integer MplugType;
    @Autowired
    public BatteryWirelessService batteryWirelessService;
    @GetMapping("/save/BatteryState")
    public String getAllBatteryState(@RequestBody BatteryState batteryState){
        return batteryWirelessService.getAllBatteryState(batteryState);
    }
    @GetMapping("/save/MplugType")
    public String getAllByMplugType(@PathVaiabale ("MplugType")Integer MplugType ){
        return batteryWirelessService.getAllByMplugType(MplugType);
    }
    @GetMapping("/saveAll/{Scale}")// Battery's 's Fetching in Server#1
    public String getllByScale(int Scale){
        return batteryWirelessService.getllByScale(Scale);
    }
    @GetMapping("/saveAll/{mAcOnLine}")// Attached Ac'UsbLine's 's Fetching in Server#1
    public Integer getAllBymAcOnLine(Integer mAcOnLine){//
        return batteryWirelessService.getAllBymAcOnLine(mAcOnLine);
    }
    @PostMapping("findAll/usbReciver")//Binding Usb Receiever in Server
    public String setAllByUsbReciever(UsbReciever usbReciever){
        return batteryWirelessService.setAllByUsbReciever(usbReciever);
    }
    @GetMapping("/saveAll/{mAcOnUsb}")//Fetching mAcOnUsb in Server
    public String geteAllBymAcOnUsb(Integer mAcOnUsb){
        return batteryWirelessService.geteAllBymAcOnUsb(mAcOnUsb);
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
