package com.example.wirelesschargingapplication.service;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.BatteryWireless;
import com.example.wirelesschargingapplication.repository.BatteryWirelessRepository;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.UsbReciever.UsbReciever;

//public class BatteryWireless extends AppCompatActivity implements WifiBroadCastReciever.wifiChangeBroadCastLister{
@Service
public class BatteryWirelessService {
     public UsbReciever usbReciever;
    @Autowwired
    public BatteryWirelessRepository batterywirelessRepository;
    public String getAllByMplugType(Integer mPLugType){
            return batterywirelessRepository.saveAllByMplugType(mPLugType);
    }
    public String getllByScale(int Scale){
        return batterywirelessRepository.saveAllByScale(Scale);
    }
    public Integer getAllBymAcOnLine(Integer mAcOnLine){
        return batterywirelessRepository.savaAllBymAcOnLine(mAcOnLine);
    }public String setAllByUsbReciever(UsbReciever usbReciever){
        return batterywirelessRepository.findAllByUsbReciever(usbReciever);
    }
    public String geteAllBymAcOnUsb(Integer mAcOnUsb){
        return batterywirelessRepository.saveAllBymAcOnUsb(mAcOnUsb)
    }
    public String findAllByMplugType(Integer mPLugType){
        return batterywirelessRepository.findAllByMplugType(mPLugType);
    }
    public String setAllBYScale(int Scale){
         return batterywirelessRepository.findAllBYScale(Scale);
    }


}