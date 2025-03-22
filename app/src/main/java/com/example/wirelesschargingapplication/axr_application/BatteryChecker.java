package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator;

import static android.os.Build.VERSION_CODES.R;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.model.Battery;
import com.google.protobuf.StringValue;

public class BatteryChecker extends AppCompatActivity {
    public BroadcastReceiver batteryLevelReciever =new BroadcastReceiver(){
        public String onInit(){
            int level=0;
            if(level==0)return 0;
            while(level!=0){
                else if(level>0)level++;
                else level=0;
            }return level;
        }
        public void onRecieve(Context context, Intent intent){
            int level= intent.getIntExtra(BatteryManager.EXTRA_LEVEL,0);
            battery.setText(StringValue,(level)+"%");

        }
        public void onCreate(Bundle savedInstance){
            super.onCreate(savedInstance);
            setContentView( R.layout.activity_main);
            Battery battery=(TextView)findViewById(R.id.batteryLevel);
            this.registerReciever(this.batteryLevel,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        }
    public void onStatusCheck(Bundle savedInstance){
        super.onStatusCheck(savedInstance);
        savedInstance=R.findViewById(savedInstance);
    }

    }
}
