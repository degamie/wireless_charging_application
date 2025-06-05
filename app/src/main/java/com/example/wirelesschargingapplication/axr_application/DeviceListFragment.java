package com.example.wirelesschargingapplication;
public class DeviceListFragment {
    public DevicelistFragment devicelistframagment;
    public String deviceName=null;
    public String serialId=null;
    public int portNum=0;
    public String getPortNum (int portNum){
        return portNum;
    }

    public DeviceListFragment(String deviceName,String serialId,int portNum){
        this.deviceName=deviceName;
        this.serialId=serialId;
        this.portNum=portNum;
    }


}
