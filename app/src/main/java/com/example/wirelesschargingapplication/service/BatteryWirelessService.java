package com.example.wirelesschargingapplication.service;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.BatteryWireless;
import com.example.wirelesschargingapplication.repository.BatteryWirelessRepository;

//public class BatteryWireless extends AppCompatActivity implements WifiBroadCastReciever.wifiChangeBroadCastLister{
@Service
public class BatteryWirelessService {
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
    }

}