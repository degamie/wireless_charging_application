package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import java.io.File;

public class BootReciever extends BroadCastReciever{//BootReciever  Declare Inheriting BroadCastReciever  Class
    public BootReciever bootReciever;//Obj Declare
    public static final String TAG="Boot Reciever";//Tag Declare
    public static final int LOG_SIZE=65336;//Log Size Declare
    public static final File TOMBSTONE_DIR=new File("/data/tombStones");//TOMBSTONE_DIR declare
    public BootReciever(){//Default Constructor Declare
        return;
    }
    public BootReciever(String TAG,int LOG_SIZE){//Parameterized Constructor declare
        this.bootReciever=bootReciever;
        this.TAG=TAG;
        this.LOG_SIZE=LOG_SIZE;
    }


}
