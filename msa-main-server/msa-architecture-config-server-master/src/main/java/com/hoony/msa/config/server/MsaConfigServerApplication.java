package com.hoony.msa.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaConfigServerApplication.class, args);
	}
}
