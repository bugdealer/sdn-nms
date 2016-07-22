package com.example;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.net.ssl.SSLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import com.example.properties.MongoProperties;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

@Service
public class ConfigGenerator implements Runnable {
	
	private MongoClient mongoClient;
	private DB database;
	private DBCollection vmsetting,cluster;
	private DBCursor vmCursor,clusterCursor,cachedvm,cachedcluster;
	private String expcmd1,expcmd2,expcmd11,expcmd22;
	private String exppath1,exppath2;
	//@Autowired
	//private MongoProperties mongoProperties;
	private ShellExecuter shellExecuter1;
	
	private String flag0,flag1;
	Logger logger = Logger.getLogger(ConfigGenerator.class.getName());
	
	@PostConstruct
	public void init(){
		try {
			mongoClient = new MongoClient( "172.17.17.24" , Integer.parseInt("27017") );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		database = mongoClient.getDB("topo");
		vmsetting = database.getCollection("vmInfo");
		cachedvm = vmsetting.find();
		
		
		cluster = database.getCollection("cluster");
		cachedcluster = cluster.find();
		exppath1 = "~/RouteFlow/rftest/autoFun/";
		
		
//		expcmd1 = "e:\\"+ "mongoexport.exe /h "
//				+"127.0.0.1"+" /port "+"30000"
//				+" /d "+"topo"+" /c vmInfo /o "+exppath+"vmsetting.json";
//		expcmd2 = "e:\\"+ "mongoexport.exe /h "
//				+"127.0.0.1"+" /port "+"30000"
//				+" /d "+"topo"+" /c cluster /o "+exppath+"cluster.json";
		
		expcmd1 = "mongoexport"+" -d "+"topo"+" -c vmInfo --jsonArray -o "+exppath1+"vmsetting1.json";
		expcmd11 = "rm "+"vmsetting1.json";
		expcmd2 = "mongoexport"+" -d "+"topo"+" -c cluster --jsonArray -o "+exppath1+"cluster1.json";
		expcmd22 = "rm "+"cluster1.json";
		flag0 = "false";
		flag1 = "false";
		shellExecuter1 = new ShellExecuter("openflow","openflow","172.17.17.24",22);
		System.out.println("Init completed.");
	}


	@SuppressWarnings("deprecation")
	
	public void run() {
		// TODO Auto-generated method stub
		
	
	
		vmCursor = vmsetting.find();
		clusterCursor = cluster.find();
		if(!vmCursor.toArray().toString().equals(cachedvm.toArray().toString())
				||!clusterCursor.toArray().toString().equals(cachedcluster.toArray().toString()))
		{
			System.out.println("cachedvm "+ cachedvm.toArray());
			System.out.println("vmcursor "+ vmCursor.toArray());
			System.out.println("cachedcluster "+ cachedcluster.toArray());
			System.out.println("clustercursor "+ clusterCursor.toArray());
			
			
			cachedvm = vmCursor;
			cachedcluster = clusterCursor;
			flag0="false";
			flag1="false";
		}
	
		if(flag0=="false"){
		if(vmsetting.find().hasNext())
		{
			logger.info("VM Setting is not null, config file exported to path "+exppath1+ ".");
			try {
				System.out.println(shellExecuter1.executeFile(expcmd11));
				System.out.println(shellExecuter1.executeFile(expcmd1));
				flag0 = "true";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		else {
			logger.info("VM Setting is null.");
		}
		}
		
		if(flag1=="false"){
		if(cluster.find().hasNext())
		{
			logger.info("Cluster Setting is not null, config file exported to path "+exppath1+ ".");
			try {
				System.out.println(shellExecuter1.executeFile(expcmd22));
				System.out.println(shellExecuter1.executeFile(expcmd2));
				flag1 = "true";
				logger.info("Config export completed");
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
		else {
			logger.info("Cluster Setting is null.");
		}
		
	
		if(flag0=="ture"&&flag1=="true")
			Thread.currentThread().stop();
			
		}
	}

}
