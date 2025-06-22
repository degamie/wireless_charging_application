package com.example.wirelesschargingapplication.backend_springBoot.wireless_axr.src.main.java.com.wireless_axr.wireless_axr;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(WirelessDeviceAxrApplication.class, args);
    }
}