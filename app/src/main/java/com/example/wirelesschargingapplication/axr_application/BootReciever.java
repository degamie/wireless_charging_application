package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import java.io.File;

public class BootReciever extends BroadCastReciever{
    public static final String TAG="Boot Reciever";
    public static final int LOG_SIZE=65336;
    public static final File TOMBSTONE_DIR=new File("/data/tombStones");
}
