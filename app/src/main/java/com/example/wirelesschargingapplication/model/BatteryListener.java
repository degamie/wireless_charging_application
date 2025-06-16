package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator;

import static androidx.core.view.accessibility.AccessibilityEventCompat.setAction;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Camera;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pDeviceList;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.BatteryManager;
import android.util.Log;
import android.webkit.WebView;

import com.example.wirelesschargingapplication.Reciever;
import com.example.wirelesschargingapplication.StatusIntent;

import org.json.JSONArray;

import java.util.List;

import javax.annotation.processing.Generated;

@Getter
@Setter
@AllParamConstructor
@NoParamConstructor

public class BatteryListener extends BroadcastReceiver {
    @Id
    @GeneratedValue(strategy=GENERATIONTYPE.IDENTITY)
    @Column(unique=true,nullable=false)
    public  IntentAction intentAction;
    @Column(unique=true,nullable=false)
    public StatusIntent statusIntent;
    @Column(unique=true,nullable=false)
    public Context context;
    @Column(unique=true,nullable=false)
    public int status=0;
    public void startCamera(Camera camera,Context mContext){
        mContext.startActivity();
    }
    public void BatteryConnected(Context mContext){//Live Status Connected
        int mPlugType;
        if(mPlugType!=0 && mLastPlugType==0){
            StatusIntent statusIntent.setAction(Intent.ACTION_POWER_CONNECTED);
            mContext.sendBroadcast(statusIntent);
        }
    }
//    public String getStatusIntent(StatusIntent statusIntent){
//        return statusIntent;
//    }
//    public String setStatusIntent(StatusIntent statusIntent){
//        this.statusIntent=statusIntent;
//    }
    public void BatteryDisCOnnected(Intent intent,BatteryLevel mBatteryLevel){
            if(mBatteryLevel==0 && !isPowered() && ActivityManager.isSystemReady()){
                intent=new Intent(Intent.ACTION_REQUEST_SHUTDOWN);
                intent.putExtra(Intent.EXTRA_KEY_CONFIRM,false);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            }
    }



//    public String getStatus(int status){
//        return status;
//    }
    public Boolean isCharging=false;
    public Reciever reciever;
    public WifiP2pManager.PeerListListener =new WifiP2pManager.PeerListListener<>();
    Intent batteryStatus=context.regisgterReciever(null,ifilter);
    public void BatteryCharging(){
        int chargingPlug== status==batteryStatus.get(BatteryManager.EXTRA_STATUS,-1);
        boolean usbCharging==chargingPlug==BatteryManager.BATTERY_PLUGGED_AC;
        boolean usbCharging==chargingPlug==BatteryManager.BATTERY_PLUGGED_USB;
    }
    @Override
    public void onPeersAvailable(WifiP2pDeviceList peersList){
        List<WifiP2pDevice>refreshedPeeers=peersList.getDeviceList();
        if(!refreshedPeeers.equals(peersList)){
            peersList.clear();
        }
    }
    public void onExecute(String action, JSONArray args, CallbackContext callbackContext){
        if(action.equals("Start Battery")){
            if(this.BatteryContextCallBack!=null){
                removeBatteryListener();
                this.batteryCallbackContext=callbackContext;
            }
            IntentFilter intentFilter=new IntentFilter();
            intentFilter.addAction(Intent.ACTION_BATTERY_CHANGED);
            if(this.reciever==null){
                this.reciever=new BroadcastReceiver();
            }
        }
    }

    private void removeBatteryListener() {
        return;
    }

    @Override
    public final String TAG="BatteryListener";

    public void onRecieve(Context context, Intent intent){
        intent=intent.getAction();
        if(intentAction.equalsIgnoreCase("android.intent.action.ACTION_POWER_CONNECTED")){Log.i(TAG,"Battery Connected");}
        else {Log.i(TAG,"Battery Disconnected");}
        updateBatteryInfo(intent);
        WebView.getContext().registerReciever(this.reciever,inentFilter);
    }

    protected void onStart(){
        super.onStart();
        BroadcastReceiver broadcastReceiver=new BroadcastReceiver();
        IntentFilter intentFilter=new IntentFilter();
        intentFilter.addAction(Intent.ACTION_POWER_CONNECTED);
        intentFilter.addAction(Intent.ACTION_POWER_DISCONNECTED);
        this.registerReciever(broadcastReceiver,intentFilter);
    }
}
