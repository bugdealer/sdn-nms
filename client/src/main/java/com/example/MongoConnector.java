package com.example;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.example.properties.MongoProperties;
import com.mongodb.MongoClient;


public class MongoConnector {
	private MongoClient mongoClient;

	//@Autowired
	private MongoProperties mongoProperties;


	public MongoClient getMongoClient() {
		System.out.println("mongo address:"+mongoProperties.getAddress());
		try {
			mongoClient = new MongoClient( mongoProperties.getAddress() , Integer.parseInt(mongoProperties.getPort()) );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return mongoClient;
	}

	public void setMongoClient(MongoClient mongoClient) {
		this.mongoClient = mongoClient;
	}

}
