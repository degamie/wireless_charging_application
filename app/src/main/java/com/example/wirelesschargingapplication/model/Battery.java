package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.model;

import android.text.Editable;
@Getter
@Setter
@AllArgsContructor
@NoArgsContructor
public class Battery{
    @Id
    @GeneratedValue(strategy=GENERATIONTYPE.IDENTITY)
    @Colummn(unique=true,nullable=false)
    public Long batteryId;
    @Colummn(unique=false,nullable=true)
    public String batteryName;
    @Colummn(unique=false,nullable=true)
    public String  wifiId;
    @Colummn(unique=false,nullable=true)
    public String wifiName;
    @Colummn(unique=false,nullable=true)
    public Integer BatteryPercentage ;
}
