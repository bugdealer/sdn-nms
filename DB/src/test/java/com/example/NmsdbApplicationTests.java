package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.flowtable.FlowtableGetter;
import com.example.test.NmsdbApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = NmsdbApplication.class)
@WebAppConfiguration
public class NmsdbApplicationTests {


	@Test
	public void contextLoads() {
		FlowtableGetter nodeGetter = new FlowtableGetter("openflow:1919317619");
		FlowtableGetter flowtableGetter = new FlowtableGetter("openflow:1919317619","0");
		System.out.println(nodeGetter.getFlowtable());
		System.out.println(flowtableGetter.getFlowtable());
	}

}
