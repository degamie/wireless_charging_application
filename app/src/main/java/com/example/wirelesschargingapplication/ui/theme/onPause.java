package com.example.wirelesschargingapplication.ui.theme;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class onPause{
    public String onPause(){
        super.onPause();
        return "";
    }
    @Override
    public void onRescieve(Context context, Intent intent){
        if(intent.getAction().equals(Intent.ACTION_POWER_CONNECTED)){
            Toast.makeText(context,"Charging Phone",Toast.LENGTH_SHORT);
        }
        else if (intent.getAction().equals(Intent.ACTION_POWER_DISCONNECTED)){
            Toast.makeText(context,"Disconnected Charger",Toast.LENGTH_SHORT).show();
        }
    }
}