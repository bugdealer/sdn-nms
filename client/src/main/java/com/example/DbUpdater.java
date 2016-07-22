package com.example;

import java.net.UnknownHostException;

import javax.annotation.PostConstruct;

import org.bson.Document;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.example.properties.MongoProperties;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;

import scala.collection.generic.BitOperations.Int;


public class DbUpdater implements Runnable{
	
	private MongoClient mongoClient;
	private DB database;
	private DBCollection collection;
	private String doc;
	@Autowired
	private MongoProperties mongoProperties;
	
	public DbUpdater(String doc){
		this.doc = doc;
	}
	
	@Override
	public void run(){
		try {
			mongoClient = new MongoClient("172.17.17.24" , 27017);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		database = mongoClient.getDB("topo");
		
		collection = database.getCollection("topo");
		
		System.out.println("Updating DB...");
		
		try {
			DBObject dbObject = (DBObject)JSON.parse(doc);
			
			collection.drop();
			collection.insert(dbObject);
			System.out.println("Update complete.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}



	

}
