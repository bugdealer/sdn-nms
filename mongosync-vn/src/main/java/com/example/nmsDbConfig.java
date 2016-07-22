package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.properties.NmsdbProperties;
import com.mongodb.MongoClientURI;


@Configuration
@EnableMongoRepositories(basePackages="com.example.topo",mongoTemplateRef = "nmsDbTemplate")
public class nmsDbConfig {

	@Autowired
	private NmsdbProperties mongoProperties;
	
	private MongoClientURI uri;
	 
	
	 
	    public @Bean(name="nmsDbTemplate")
	    MongoTemplate nmsDbTemplate() throws Exception {
	    	
	    	uri = new MongoClientURI("mongodb://"+mongoProperties.getAddress()+
	    			":"+mongoProperties.getPort()+
	    			"/"+mongoProperties.getDatabase());
	    	
	    	SimpleMongoDbFactory test =new SimpleMongoDbFactory(uri);
		       return new MongoTemplate(test);
	    }
	  
	    
}
