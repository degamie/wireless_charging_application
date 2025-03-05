package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.UsbReciever;

import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbManager;
import android.util.Log;

import java.io.IOException;

public class UsbRecieverImpl extends UsbReciever {
    public Context context;
    public Intent intent;
    public int batterylevel=0;
    public UsbRecieverImpl usbRecieverimpl;
    public UsbRecieverImpl(){
        return;
    }
    @Override
    public void findSerialPortDevice() {
        super.findSerialPortDevice();
    }

    @Override
    public String onReciever(Context context, Intent intent) {
        return super.onReciever(context, intent);
    }
    public Integer OnRecieveImplemnetation(){
        onReciever(context,intent);
        findSerialPortDevice();
        if(batterylevel==0)return  0;
        else if (batterylevel>0) {
            batterylevel+= UsbManager.ACTION_USB_ACCESSORY_ATTACHED;
            return "USB ATTACHED";

        }
        else {
            try{
                Log.d("Usb Detached");
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
