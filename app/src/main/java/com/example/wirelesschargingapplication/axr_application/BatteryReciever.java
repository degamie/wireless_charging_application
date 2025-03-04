package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import android.content.Context;
import android.content.Intent;
import android.hardware.BatteryState;
import android.widget.TextView;

public class BatteryReciever  extends BroadCastReciever{
        public Integer mBatteryLevel;
        public TextView textView;
        public BatteryReciever(TextView textView){
            this.textView=textView;
        }

    @Override
    public String onReciever(Context context, Intent intent) {
        return super.onReciever(context, intent);
        int BatteryPercentage=intent.getIntExtra("level",0);
        textView.setText(BatteryPercentage+"%");

    }
    public Integer batteryChanged(mBatteryLevel){
            if(mBatteryLevel==0)return 0;
            while(mBatteryLevel!=0){
                else if(mBatteryLevel>0)mBatteryLevel++;
                else mBatteryLevel=0;
            }
            return mBatteryLevel;

    }
}
