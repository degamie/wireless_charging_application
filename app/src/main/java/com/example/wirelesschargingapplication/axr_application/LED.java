package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator;

public class LED {
    public LED led;
    public Integer LEDLight;
    public LED(){
        return;
    }
    public LED(Integer LEDLight){
        this.LEDLight;
    }
    public Integer onInit(int LEDLight){
        if(LEDLight==0)return 0;
        while(LEDLight!=0){
            else if(LEDLight>0)LEDLight++;
            else LEDLight--;

        }
        return LEDLight;
    }
}
