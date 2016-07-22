package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.MongosyncApplication;
import com.example.vn.VnRepository;
import com.mongodb.DB;
import com.mongodb.DBCollection;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MongosyncApplication.class)
public class MongosyncApplicationTests {

	@Autowired
	@Qualifier("nmsDbTemplate")
	MongoTemplate nmsTemplate;
	
	@Autowired
	@Qualifier("sourceDbTemplate")
	MongoTemplate sourceTemplate;
	@Test
	public void contextLoads() {
	
		 DB database = nmsTemplate.getDb();
		 DBCollection flowtable = database.getCollection("flowtable");
		
		 
	}

}
