package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator;
import static android.content.Context.WIFI_SERVICE;
import static android.provider.SyncStateContract.Helpers.update;

import android.app.ApplicationErrorReport;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.hardware.BatteryState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.DropBoxManager;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.wirelesschargingapplication.MainActivity;
import com.example.wirelesschargingapplication.R;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.wifi.WifiBroadCastReciever;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.wifi.WifiDetails;

import java.io.File;
import java.io.FileOutputStream;

//public class BatteryWireless extends AppCompatActivity implements WifiBroadCastReciever.wifiChangeBroadCastLister{
public class BatteryWireless extends MainActivity {
    public static final String TAG=BatteryWireless.class.getSimpleName();
    public Boolean LOCAL_LOGV =false;
    public int BATTERY_SCALE=100;
    public String mCriticalBatteryLevel;
    public BatteryState mBatteryStatus;
     public boolean mAcOnLine;
    public boolean mAcOnUsb;

    private UeventObserver mInvalidateCharger=new UEventObserver();
    public static  final void logBatteryStats(){
        if(ApplicationErrorReport.BatteryInfo.service==null)return ;
        DropBoxManager dropBoxManager=(DropBoxManager)mContext.getSystemService(Context.DROPBOX_SERVICE);
        if(dropBoxManager==null || !dropBoxManager.isTagEnabled("Battery_DiSCHARGE_INFO"))return;
        File dumpFile=null;
        FileOutputStream fileOutputStream=null;
        try{
            dumpFile=new File(DUMPSYS_DATA_PATH+BATTERY_STATS_SERVICE_NAME+"./dump");
            fileOutputStream=new FileOutputStream(dumpFile);
        }
    }
    public static void LogOutLinear(String duration){
    ContentResolver contentResolver=mContent.getContentResolver();
    String dischargeThreshold= Settings.Secure.getString(contentResolver,Settings.Secure.BATTERY_DISCHARGE_THRESHOLD);
    String dischargeDurationThreshold= Settings.Secure.getString(contentResolver,Settings.Secure.BATTERY_DURATION_DISCHARGE_THRESHOLD);
    }
    @Override
    public void OnEvent(UEventObserver ueventObserver,UEvent event){
        String invlaidCharger="1".equals(event.get("SWITCH_STATE"))? 1:0;
        if(mInvalidateCharger!=invlaidCharger){
            mInvalidateCharger=invlaidCharger;
            update();
        }
    }

    public void isPowered(int plugType){
        if(mBatteryStatus== BatteryManager.BATTERY_STATUS_UNKNOWN){
            return true;
        }
        else if(plugType==0){
            return false;
        }int plugTypeBit=0;
        if(mAcOnLine){
            plugTypeBit|=BatteryManager.BATTERY_PLUGGED_AC;
        }
        if(mAcOnUsb){
            plugTypeBit|=BatteryManager.BATTERY_PLUGGED_USB;
        }return (plugType & plugTypeBit)!=0;

    }
    public BatteryWireless(Context context,LightsService lightsService){
        mContext=context;
        mLed=new Led(context,lightsService);
        mCriticalBatteryLevel=BatteryState.service.getService();
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
