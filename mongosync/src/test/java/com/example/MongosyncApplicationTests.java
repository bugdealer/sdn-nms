package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.MongosyncApplication;
import com.example.properties.NmsdbProperties;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MongosyncApplication.class)
@ComponentScan
public class MongosyncApplicationTests {

	@Test
	public void contextLoads() {
		
		
	}

}
