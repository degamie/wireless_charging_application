//WID(6/2/2026)(Sarthak Mittal)(DegamieSigN)
package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.model;

import android.text.Editable;
import com.android.aapt.Resources;
import org.apache.tools.ant.types.resources.selectors.Date;
import Resources.*;
@Getter
@Setter
@AllArgsContructor
@NoArgsContructor
public class Battery{
    @Id
    @GeneratedValue(strategy=GENERATIONTYPE.IDENTITY)
    @Colummn(unique=true,nullable=false)
    public Resources.String batteryId;
    @Colummn(unique=false,nullable=true)
    public Resources.String batteryName;
    @Colummn(unique=false,nullable=true)
    public Resources.String wifiId;
    @Colummn(unique=false,nullable=true)
    public Resources.String  wifiName;
    @Colummn(unique=false,nullable=true)
    public Integer BatteryPercentage ;
    @Colummn(unique=false,nullable=true)
    public Date mfgDate ;
}
