//WID(18/3/2026 )(Sarthak Mittal)(DegamieSign)#1.1.1.1.1.1.1,1.1.1
package com.example.wirelesschargingapplication.repository;
import com.android.aapt.Resources;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BootReciever;
//import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatteryRecieverRepository;
//import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BootReciever;

import java.io.File;
import java.util.List;

@Repository
public  interface  BootRecieverRepository extends JpaRepsoitory<BootReciever, Resources.String>  {
    public List<BootReciever> finndByfileName(String fileName);
 public List<BootReciever> updateByBootReciever();
    public List<BootReciever> saveByBootRecieverRepository;
 public BootRecieverRepository bootrecieverrepository;
 public List<BootReciever> findByBootRecieverRepository(BootRecieverRepository bootrecieverrepository);
 public void setBootRecieverRepository(BootRecieverRepository bootrecieverrepository);
 public List<BootReciever> saveByBootReciever(BootReciever bootReciever);
 public List<BootReciever> findByBootReciever(BootReciever bootReciever);
 public BootReciever existsByBootReciever(BootReciever bootReciever);
 public void updateByBootRecieverRepository(BootRecieverRepository bootrecieverrepository);
 public void setBootrecieverrepository(BootRecieverRepository bootrecieverrepository){this.batteryRecieverRepository=batteryRecieverRepository;}
 public BootRecieverRepository getBootrecieverrepository(BootRecieverRepository bootrecieverrepository){return bootrecieverrepository;}//Fetching BootReciever in App
 public String findAllByLogSize(Integer LOG_SIZE);
 public String saveAllByLogSize(Integer LOG_SIZE);
 public String updateByLogSize(Integer LOG_SIZE);
 public String existsByLogSize(int Log_Size);
 public String saveAllByTag(String Tag);
 public String findAllByTag(String Tag);
 public String saveAllByFIle(String File);
 public String findAllByFIle(String File);
 public String updateByFile(File file);
    public Resources.String findAllByTOMB_DIR(String TOMB_DIR);//Finding TOMB_DIR
 public String saveAllByTOMB_DIR(String TOMB_DIR);
 public String updaateByTOMB_DIR(String TOMB_DIR);
 public String existsByTOMB_DIR(String TOMB_DIR);

}
