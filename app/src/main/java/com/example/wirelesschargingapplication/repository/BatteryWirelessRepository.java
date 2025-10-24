package com.example.wirelesschargingapplication.repository;

import static android.content.Context.USB_SERVICE;
import static android.provider.SyncStateContract.Helpers.update;
import static androidx.core.content.ContextCompat.getSystemService;
import static androidx.core.content.ContextCompat.registerReceiver;

import android.app.ApplicationErrorReport;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.BatteryState;
import android.hardware.usb.UsbManager;
import android.os.BatteryManager;
import android.os.DropBoxManager;
import android.provider.Settings;

import com.example.wirelesschargingapplication.MainActivity;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.LED;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.UEventObserver.UeventObserver;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.UsbReciever.UsbReciever;

import java.io.File;
import java.io.FileOutputStream;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.BatteryWireless;

//public class BatteryWireless extends AppCompatActivity implements WifiBroadCastReciever.wifiChangeBroadCastLister{
@Repository
public interface BatteryWirelessRepository extends JpaRepository  <BatteryWireless,String>{
    @Autowwired
    public BatteryWireless batterywireless;
    public String findAllByMplugType(Integer mPLugType);
    public String saveAllByMplugType(Integer mPLugType);

    public String findAllBYScale(int Scale);
    public String saveAllByScale(int Scale);
    public Integer savaAllBymAcOnLine(Integer mAcOnLine);
    public String findAllByUsbReciever(UsbReciever usbReciever);
    public String saveAllBYUsbReciever(UsbReciever usbReciever);
    public String saveAllBymAcOnUsb(Integer mAcOnUsb);
    public String findAllBymAcOnUsb(Integer mAcOnUsb);
    public String saveAllByScale(Integer scale);

}