package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.UsbReciever;

import static android.opengl.Matrix.length;

import static com.google.android.gms.common.ConnectionResult.TIMEOUT;

import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbManager;
import android.util.Log;

import java.io.IOException;

public class UsbRecieverImpl extends UsbReciever {
    //Variables Decalre
    public Integer bytes=0;
    public Integer intf=0;
    public Context context;
    public Intent intent;
    public int batterylevel=0;
    public UsbDeviceConnection usbDeviceConnection=new UsbDeviceConnection();//UsbDeviceConnection Obj Declare
    public Integer Length=0;
    public Boolean claimPt=true;

    public UsbRecieverImpl usbRecieverimpl;
    public UsbRecieverImpl(){
        return;
    }
    public Integer OnRecieveImplemnetation() {// OnRecieveImplemnetation Declare
        usbDeviceConnection.bulkTransfer(bytes, bytes.length(), TIMEOUT);//Transfering Bytes's Length in its TimeLimit
        usbDeviceConnection.claimInterface(intf, claimPt);//Claiming UsbDevice's Interface
    }
    public String batteryLevelPortConnectivity(){//batteryLevelPortConnectivity declare
        onReciever(context,intent);findSerialPortDevice();//Calling Functions
        if(batterylevel==0)return  0;//Initializing the BatteryLevel
        else if (batterylevel>0) {//Printing the Attached UsbDeveice within its Incremented Battery Level
            batterylevel+= UsbManager.ACTION_USB_ACCESSORY_ATTACHED;
            return "USB ATTACHED";

        }
        else {
            try{
                Log.d("Usb Detached");//Throwing Usb Exceptions If Found
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    @Override
    public void findSerialPortDevice() {
        super.findSerialPortDevice();
    }
    @Override
    public String onReciever(Context context, Intent intent) {return super.onReciever(context, intent)}

}
