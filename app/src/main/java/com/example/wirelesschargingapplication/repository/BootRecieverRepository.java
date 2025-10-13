package com.example.wirelesschargingapplication.repository;

//WID(13/10/2025)

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BootReciever;
@Repository
public  interface  BootRecieverRepository extends JpaRepsoitory<BootReciever,String>  {
 public String findAllByLogSize(Integer LOG_SIZE);
 public String saveAllByLogSize(Integer LOG_SIZE);
 public String saveAllByTag(String Tag);
 public String findAllByTag(String Tag);
 public Strign saveAllByFIle(String File);
 public Strign findAllByFIle(String File);
    public String findAllByTOMB_DIR(String TOMB_DIR);//Finding TOMB_DIR
 public String saveAllByTOMB_DIR(String TOMB_DIR);

}
