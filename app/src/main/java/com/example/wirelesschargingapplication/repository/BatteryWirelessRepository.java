//WID(25/2/2026)(sarthak Mittal)(DegamieSign)#1.1.1
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
import java.util.List;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.BatteryWireless;

//public class BatteryWireless extends AppCompatActivity implements WifiBroadCastReciever.wifiChangeBroadCastLister{
@Repository
public interface BatteryWirelessRepository extends JpaRepository  <BatteryWireless,String>{
    @Autowwired
    public BatteryWireless batterywireless;
    public List<BatteryWireless> existsByBatteryWireless(BatteryWirelessRepository batteryWirelessRepository);
    public List<BatteryWireless> updateByBatteryWireless(BatteryWirelessRepository batteryWirelessRepository);
    public void setBatterywireless(BatteryWirelessRepository batterywireless){this.batterywireless=batterywireless;}}//binding batteryWireless in App#1
    public BatteryWireless getBatterywireless(BatteryWireless batterywireless){return batterywireless;}//Fetching batteryWireless in App
    public String findAllByMplugType(Integer mPLugType);
    public String saveAllByMplugType(Integer mPLugType);
    public String updateAllByMpPlugType(Integer mPlugType);

    public String findAllBYScale(int Scale);
    public String saveAllByScale(int Scale);
    public Integer savaAllBymAcOnLine(Integer mAcOnLine);
    public String existsByMpPlugType(Integer mPlugType);//Checking mPlugType's existence in App
    public String findAllByUsbReciever(UsbReciever usbReciever);
    public String saveAllBYUsbReciever(UsbReciever usbReciever);
    public void  updateByUsbReciever(UsbReciever usbReciever);//updating usbReciever in App
    public String saveAllBymAcOnUsb(Integer mAcOnUsb);
    public String findAllBymAcOnUsb(Integer mAcOnUsb);
    public String saveAllByScale(Integer scale);
    public void findAllByScale(Integer scale);
    public String updateByScale(Integer scale);
    public void existsByScale(Integer scale);
    public void updateBymAcOnUsb(Integer mAcOnUsb);
    public void existsBymAconUsb(Integer mAcOnUsb);//Checking mAcOnUsb's Existence in App
}