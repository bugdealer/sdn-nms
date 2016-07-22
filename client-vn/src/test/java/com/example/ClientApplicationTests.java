package com.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.properties.MongoProperties;
import com.example.properties.OdlProperties;
import com.example.properties.StreamProperties;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ClientApplication.class)
@ComponentScan
public class ClientApplicationTests {

	@Autowired
	private OdlProperties odlProperties;
	
	@Autowired
	private StreamProperties streamProperties;
	
	//private ConfigGenerator configGenerator;
	
	
	
	@Test
	public void test(){
		
//		System.out.println("odl address: "+odlProperties.getAddress());
//		System.out.println(mongoProperties.getAddress());
		
		//System.out.println("stream path: " + streamProperties.getPath().get(0));
		
		//ScheduledExecutorService scheduledExecutorService =
		 //       Executors.newScheduledThreadPool(2);
		//ScheduledFuture scheduledFuture =
			//    scheduledExecutorService.scheduleAtFixedRate(new ConfigGenerator(), 2, 2, TimeUnit.SECONDS);
		
//		mongoConnector = new MongoConnector();
//		System.out.println(mongoConnector.getMongoClient().toString());
		
		
	}
	
	

}
