package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

@Component
public class DBConfig {

	
	private final MongoDbFactory mongo;
    
	@Autowired

	public DBConfig(MongoDbFactory mongo) {
		this.mongo = mongo;
	}

}