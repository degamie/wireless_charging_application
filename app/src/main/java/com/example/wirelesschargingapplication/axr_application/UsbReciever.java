package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator;

import static android.hardware.usb.UsbManager.ACTION_USB_DEVICE_ATTACHED;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

public class UsbReciever extends BroadcastReciever {
    public boolean hold=false;
    public String vendorID=null;
    public String ProductId=null;
    public UsbDevice device=new UsbDevice();
    public String CAMERA_VID=null;
    public String CAMERA_PID=null;
    public UsbManager usbManager;
    @SuppressLint("LogNotTimber")
    public static final String TAG="UsbReciever";
    public String getProductId(String ProductId) {
        return ProductId;
    }
    public void findSerialPortDevice() {//FindSerialPort Device Declare
        HashMap<String, UsbDevice> usbDeviceHashMap = usbManager.getDeviceList();//HahsMapDeclare
        if (!usbDeviceHashMap.isEmpty()) hold = true;//Checking Device's maps
        for (Map.entry<String, usbDeviceHashMap> entry : usbDeviceHashMap.entrySet()) {//iteraitng thorugh entry set Vlaues
            device = hold.getValue();//device's value declare
            int devicePID = device.getProductId();//product Id Declare
            int deviceVID = device.getVendorId();//VendorId Declare
        }
    }
    public void onReciever(Context context, Intent intent){
        Log.d(TAG,"IntentFilter");
        if(ACTION_USB_DEVICE_ATTACHED)intent.setAction(ACTION_USB_DEVICE_ATTACHED);return "Usb Attached!";
        else if(device.vendorID== CAMERA_VID && device.isProducedID(ProductId)==CAMERA_PID)Log.("Usb Detached",TAG);
        else if(usbManager.ACTION_USB_ACCESSORY_DETACHED==intent.getaction()){UsbDevice usbDevice=intent.getParcelableExtra(usbManager.EXTRA_DEVICE);}
        else return "USB Returned";
    }

    }

}
