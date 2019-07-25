package com.example.sofarpc.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({ "classpath*:rpc-sofa-boot-starter-samples.xml" })
public class ServiceConsumerApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ServiceConsumerApplication.class, args);
		HelloSyncService helloSyncServiceReference = (HelloSyncService) applicationContext
				.getBean("helloSyncServiceReference");

		System.out.println(helloSyncServiceReference.saySync("sync"));
	}

}
