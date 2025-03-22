package com.eureka_wireless_Device_axr.wireless_Device_axr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WirelessDeviceAxrApplication {

	public static void main(String[] args) {
		SpringApplication.run(WirelessDeviceAxrApplication.class, args);
	}

}
