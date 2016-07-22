package com.example;



import com.example.cluster.Cluster;
import com.example.topo.Topo;
import com.example.vmsetting.VmInfo;
import com.example.vmsetting.Vmsetting;
import com.mongodb.MongoClientURI;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOptions;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.project;

@SpringBootApplication
@EnableScheduling
@EnableAutoConfiguration(exclude={MongoDataAutoConfiguration.class,MongoRepositoriesAutoConfiguration.class})
@ComponentScan
public class MongosyncApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("nmsDbTemplate")
	MongoTemplate nmsTemplate;


	@Autowired
	@Qualifier("sourceDbTemplate")
	MongoTemplate sourceTemplate;
	
	
   
	
	
	private List<Topo> cachedTopo = new ArrayList<Topo>();
	private List<Topo> pollTopo = new ArrayList<Topo>();

	@Scheduled(fixedDelay = 5000)
	protected void vmsettingSync(){
		
		try {
			boolean selval = true;
			List<Vmsetting> vmsettings = nmsTemplate.find
					(new Query(Criteria.where("selected").is(selval)), Vmsetting.class);
			System.out.println(vmsettings.toString());
			sourceTemplate.dropCollection("vmInfo");
			for (Vmsetting vmsetting : vmsettings) {
				List<VmInfo> vmInfos = vmsetting.getVmInfo();
				for (VmInfo vmInfo : vmInfos) {
					
					sourceTemplate.save(vmInfo);
					
				}	
			}
		
		
		//	System.out.println(sourceTemplate.findAll(VmInfo.class).toString());
			
			System.out.println("Vmsetting Synced.");
		

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Scheduled(fixedDelay = 5000)
	protected void clusterSync(){
		try {
			boolean selval = true;
			List<Cluster> clusters = nmsTemplate.find(new Query(Criteria.where("selected").is(selval)), Cluster.class);
			System.out.println(clusters.toString());
			sourceTemplate.dropCollection("cluster");
			for (Cluster cluster : clusters) {
				
					sourceTemplate.save(cluster);
			}
			
		//	System.out.println(sourceTemplate.findAll(Cluster.class).toString());
			
			System.out.println("Cluster Synced.");
		

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	@Scheduled(fixedDelay = 5000)
	public void poll(){
	
	try {
		pollTopo = sourceTemplate.findAll(Topo.class);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	if(cachedTopo.equals(pollTopo))
	{
		
		System.out.println("No need to sync.");
	}
	else
	{
		nmsTemplate.dropCollection("topo");
		nmsTemplate.save(pollTopo.iterator().next());
		cachedTopo = nmsTemplate.findAll(Topo.class);
		System.out.println("Data synced.");
		System.out.println("NMS DB: "+cachedTopo.toString());
		
		
	}
		
	}
	
	public static void main(String[] args) {

		SpringApplication.run(MongosyncApplication.class, args);
	
	}
	public void run(String... args) throws Exception {
		
		nmsTemplate.dropCollection(Cluster.class);
		nmsTemplate.dropCollection(Vmsetting.class);
		nmsTemplate.dropCollection(Topo.class);
		
		
		System.out.println("Syncronizing DB...");
		
		
	}
	

}
