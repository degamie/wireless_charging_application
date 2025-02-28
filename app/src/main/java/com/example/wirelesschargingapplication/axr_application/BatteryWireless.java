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

//public class BatteryWireless extends AppCompatActivity implements WifiBroadCastReciever.wifiChangeBroadCastLister{
public class BatteryWireless extends MainActivity {
    public final int START_SUCCESS;
    public BatteryState mBatteryLevel;
    //V
    public int BATTERY_PLUGGED_NONE=0;
    public int mPlugType=0;
    public static final String TAG=BatteryWireless.class.getSimpleName();
    public int BATTERY_SCALE=100;
    public String mCriticalBatteryLevel;
    public BatteryState mBatteryStatus;
    public boolean mAcOnLine;
    public boolean mAcOnUsb;
    public  UsbManager UsbManager;
    public UsbReciever usbReciever;
    public Boolean LOCAL_LOGV =false;
    boolean status=false;
    public synchronized final void Update(){//Updating The Values
        native_update();processValues();//Calling native_update() and Prcessing Values funct
    }
    public void processValues() {//pROCESSING Values
        Boolean logOutliner=false;//Iniitialing logOutliner
        int dischargeDuration=0;//Iniitialing dischargeDuration
        mCriticalBatteryLevel=mBatteryStatus<=mCriticalBatteryLevel;//Assigining batterylevel's Critical Value
        if(mAcOnLine)mPlugType=BatteryManager.BATTERY_PLUGGED_AC;//Wireless BatteryState
        else if(mAcOnUsb)mPlugType=BatteryManager.BATTERY_PLUGGED_USB;//WiredBattery State
        else mPlugType=BatteryManager.BATTERY_PLUGGED_DOCK;//Plugged Null Battery State
    }

    public  String native_update() {
        return 1;
    }

    public void initiateusbReciever(Boolean b){
        usbReciever={
                @Override
                        public void setModuleStatus(){}
        }
        usbReciever.context=this.usbReciever.usbManager=(usbReciever.usbManager)getSystemService(this,USB_SERVICE);
        IntentFilter intentFilter=new IntentFilter();
        intentFilter.addAction(usbReciever.ACTION_USB_PERMISSION);
        intentFilter.addAction(usbReciever.ACTION_USB_DETACHED);
        intentFilter.addAction(usbReciever.ACTION_USB_ATTACHED);
        registerReceiver(usbReciever,intentFilter);
    }


    public void setModuleStatusView(Boolean status);//SetModule status View method Declare
    public void setModuleStatus(Boolean status);//SetModule status  method Declare
    public void initiateUsbreciver(Boolean status){//Initializing UsbReciever Method
        usbReciever=new UsbReciever();//UsmbReciever Object Declare
        setModuleStatus(status);setModuleStatusView(status);//Calling Method
    }
    public int WifiConnect(int START_SUCCESS){
        if(START_SUCCESS)return 0;
        else if(START_SUCCESS>0)START_SUCCESS++;return("Opertation Successfull");
        else return "Wifi UnConnected ";
    }
    public static void sendIntent(Intent intent){
        intent=new Intent();
        intent.addFlags(Intent.FLAG_RECEIVER_REGISTERED_ONLY | Intent.FLAG_RECEIVER_REPLACE_PENDING);

        int icon=getIcon(mBatteryLevel);
    }

    private static int getIcon(BatteryState mBatteryLevel) {}

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
