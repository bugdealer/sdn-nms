package com.example;




import com.example.tablemapping.TableMapping;
import com.example.topo.Topo;
import com.example.vn.Vn;
import com.mongodb.MongoClientURI;

import java.util.ArrayList;
import java.util.Iterator;
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

import static org.hamcrest.CoreMatchers.nullValue;
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
	
	@Autowired
	@Qualifier("vnDbTemplate")
	MongoTemplate vnTemplate;
   
	
	
	private List<Topo> cachedTopo = new ArrayList<Topo>();
	private List<Topo> pollTopo = new ArrayList<Topo>();
	
	private List<Vn> cachedVn = new ArrayList<Vn>();
	private List<Vn> pollVn = new ArrayList<Vn>();
	
	
	
	private List<TableMapping> cachedTableMapping = new ArrayList<TableMapping>();
	private List<TableMapping> pollTableMapping = new ArrayList<TableMapping>();

	@Scheduled(fixedDelay = 5000)
	protected void vnSync(){
	
		try {
			pollVn = vnTemplate.findAll(Vn.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(cachedVn.equals(pollVn))
		{
			
			System.out.println("No need to sync Vn.");
		}
		else
		{
			nmsTemplate.dropCollection("link");
	
			Iterator<Vn> iterator = pollVn.iterator();
			while(iterator.hasNext()){
				nmsTemplate.save(iterator.next());
			}
				
				
			nmsTemplate.save(pollVn.iterator().next());
			cachedVn = nmsTemplate.findAll(Vn.class);
			System.out.println("Vn synced.");
			System.out.println("NMS DB: "+cachedVn.toString());
			
			
		}
		
	}
	
	@Scheduled(fixedDelay = 5000)
	protected void tableMappingSync(){
		try {
			pollTableMapping = vnTemplate.findAll(TableMapping.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(cachedTableMapping.equals(pollTableMapping))
		{
			
			System.out.println("No need to sync TableMapping.");
		}
		else
		{
			nmsTemplate.dropCollection("tableMapping");
			Iterator<TableMapping> iterator = pollTableMapping.iterator();
			while(iterator.hasNext()){
				nmsTemplate.save(iterator.next());
			}
			cachedTableMapping = nmsTemplate.findAll(TableMapping.class);
			System.out.println("TableMapping synced.");
			System.out.println("NMS DB: "+cachedTableMapping.toString());
			
			
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
		
		System.out.println("No need to sync Topo.");
	}
	else
	{
		nmsTemplate.dropCollection("topo");
		nmsTemplate.save(pollTopo.iterator().next());
		cachedTopo = nmsTemplate.findAll(Topo.class);
		System.out.println("Topo synced.");
		System.out.println("NMS DB: "+cachedTopo.toString());
		
		
	}
		
	}
	
	public static void main(String[] args) {

		SpringApplication.run(MongosyncApplication.class, args);
	
	}
	public void run(String... args) throws Exception {
		
		//nmsTemplate.dropCollection(Cluster.class);
		//nmsTemplate.dropCollection(Vmsetting.class);
		
		
		System.out.println("Syncronizing DB...");
		
		
	}
	

}
