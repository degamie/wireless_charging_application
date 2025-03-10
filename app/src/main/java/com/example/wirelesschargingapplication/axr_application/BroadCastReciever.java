package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import android.content.Context;
import android.content.Intent;

import java.util.Objects;

import javax.inject.Inject;

public class BroadCastReciever extends BatteryReciever {//BroadCastReciever  Declare inherits BatteryReciever class
    public BroadCastReciever broadCastReciever;//Obj Declare

    public int data=0;//initialize Data
    public broadCastReciever(int data){//Parametrized Constructor
        this.data=data;
    }
    public broadCastReciever(){//Default Constructor
        return;
    }

    @Inject
    DataRepository dataRepository;//Injecting DataRepository
    public String onReciever(Context context, Intent intent){//OnRecieve Mthod
        if(Objects.equals(intent.getAction(),"com.example.wirelesschargingapplication"){//Streaming Data into Repository if found
             data=intent.getStringExtra("com.example.wirelesschargingapplication"); }
        if(data!=null){
        dataRepository.updateRepository(data);//Updating the Data Repository
        }
    }
}
