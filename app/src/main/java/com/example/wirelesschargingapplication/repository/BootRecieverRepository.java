package com.example.wirelesschargingapplication.repository;

//WID(1/1/2026 )

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BootReciever;

import java.io.File;

@Repository
public  interface  BootRecieverRepository extends JpaRepsoitory<BootReciever,String>  {
 public String findAllByLogSize(Integer LOG_SIZE);
 public String saveAllByLogSize(Integer LOG_SIZE);
 public String updateByLogSize(Integer LOG_SIZE);
 public String saveAllByTag(String Tag);
 public String findAllByTag(String Tag);
 public String saveAllByFIle(String File);
 public String findAllByFIle(String File);
 public String updateByFile(File file);
    public String findAllByTOMB_DIR(String TOMB_DIR);//Finding TOMB_DIR
 public String saveAllByTOMB_DIR(String TOMB_DIR);
 public String updaateByTOMB_DIR(String TOMB_DIR);
 public String existsByTOMB_DIR(String TOMB_DIR);

}
