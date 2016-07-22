package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.properties.NmsdbProperties;
import com.example.properties.SourcedbProperties;
import com.mongodb.MongoClientURI;


@Configuration
@EnableMongoRepositories(basePackages="com.example.topo",mongoTemplateRef = "sourceDbTemplate")
public class sourceDbConfig {

	@Autowired
	private SourcedbProperties mongoProperties;
	
	private MongoClientURI uri;
	 
	
	 
	    public @Bean(name="sourceDbTemplate")
	    MongoTemplate sourceDbTemplate() throws Exception {
	    	
	    	uri = new MongoClientURI("mongodb://"+mongoProperties.getAddress()+
	    			":"+mongoProperties.getPort()+
	    			"/"+mongoProperties.getDatabase());
	    	
	    	SimpleMongoDbFactory test =new SimpleMongoDbFactory(uri);
		       return new MongoTemplate(test);
	    }
	 
}