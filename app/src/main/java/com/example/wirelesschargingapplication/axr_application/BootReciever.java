package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import android.annotation.SuppressLint;
import android.os.StrictMode;

import java.io.File;

//public class BootReciever extends BroadCastReciever{//BootReciever  Declare Inheriting Broadpublic class BootReciever extends BroadCastReciever{//BootReciever  Declare Inheriting BroadCastReciever  ClassCastReciever  Class
public class BootReciever {
    public BootReciever bootReciever;//Obj Declare
//    public static final String TAG="Boot Reciever";//Tag Declare
public String TAG=null;//Tag Declare
    public int LOG_SIZE=0;//Log Size Declare
    public String getLog_Size(int LOG_SIZE){return  LOG_SIZE;}//fetching Log_Size

    public static final File TOMBSTONE_DIR=new File("/data/tombStones");//TOMBSTONE_DIR declare
    public BootReciever(){//Default Constructor Declare
        return;
    }
    @SuppressLint("NewApi")
    public void OnCreate(){//Func declare
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectUnsafeIntentLaunch().build());//Setting Bootstrapping's Security
    }
    public BootReciever(String TAG,int LOG_SIZE,Boolean B){//Parameterized Constructor declare
        this.bootReciever=bootReciever;
        this.TAG=TAG;
        this.LOG_SIZE==65336;
        B=LOG_SIZE;
    }


}
