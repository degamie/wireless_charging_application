package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.UsbReciever;

import static android.hardware.usb.UsbManager.ACTION_USB_DEVICE_ATTACHED;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbManager;
import android.util.Log;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BroadCastReciever;

import java.util.HashMap;
import java.util.Map;

public class UsbReciever extends BroadCastReciever {//UsbReciever Class Declare
    public boolean hold=false;//initializing Hold
    public String vendorID=null;//initializing Variables
    public String ProductId=null;
    public UsbDevice device=new UsbDevice();
    public String CAMERA_VID=null;
    public String CAMERA_PID=null;
    //UsbManager Obect Declare
    public UsbManager usbManager;
    public UsbDeviceConnection usbDeviceConnection;
    @SuppressLint("LogNotTimber")
    public static final String TAG="UsbReciever";//TAG Declare
    public void findSerialPortDevice() {//FindSerialPort Device Declare
        HashMap<String, UsbDevice> usbDeviceHashMap = usbManager.getDeviceList();//HahsMapDeclare
        if (!usbDeviceHashMap.isEmpty()) hold = true;//Checking Device's maps
        for (Map.entry<String, usbDeviceHashMap> entry : usbDeviceHashMap.entrySet()) {//iteraitng thorugh entry set Vlaues
            device = hold;//device's value declare
            int devicePID = device.getProductId();//product Id Declare
            int deviceVID = device.getVendorId();//VendorId Declare
            UsbDeviceConnection usbFileDescriptor=usbDeviceConnection.getFileDescriptor();
            if(devicePID==0)return 0;
            while(devicePID!=0){
                else if(devicePID>=deviceVID)devicePID+=usbFileDescriptor;
                else devicePID=deviceVID;
        }return devicePID;
    }
    public void onReciever(Context context, Intent intent){//ONReciever Mehtod Declare
        Log.d(TAG,"IntentFilter");//IntentFilter Declare
        if(ACTION_USB_DEVICE_ATTACHED)intent.setAction(ACTION_USB_DEVICE_ATTACHED);return "Usb Attached!";//Connecting Wired Usb Cable to Device
        else if(device.getVendorId()vendorID== CAMERA_VID && device.getProductId(ProductId)==CAMERA_PID)Log.("Usb Detached",TAG);//Disconnecting The Wired Cable
        else if(usbManager.ACTION_USB_ACCESSORY_DETACHED==intent.getAction()){UsbDevice usbDevice=intent.getParcelableExtra(usbManager.EXTRA_DEVICE);}//Finding New devices 's Connection
        else return "USB Returned"; }}}//Printing Usb Cable

