package com.example.test;

import static org.mockito.Matchers.longThat;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.dao.DataAccessException;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.cluster.ClusterRepository;
import com.example.flowtable.FlowtableGetter;
import com.example.topo.*;
import com.example.topocoordinate.TopoCoordinateRepository;
import com.example.vmsetting.VmsettingRepository;

@SpringBootApplication
@EnableMongoRepositories("com.example.*")
public class NmsdbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NmsdbApplication.class, args);
	}

	@Autowired
	private TopoRepository repository;
	@Autowired
	private VmsettingRepository vmrepository;
	@Autowired
	private ClusterRepository clusterrepository;
	@Autowired
	private TopoCoordinateRepository coordinaterepository;

	public void run(String... args) throws Exception {

		//System.out.println("Querying DB.");

		//try {

			//System.out.println(vmrepository.findAll().toString());
			//System.out.println(vmrepository.findAll().toString());
			//System.out.println(clusterrepository.findByTopoHashcode(123456).toString());
			//System.out.println(coordinaterepository.findByConfigId(1).toString());
		//	System.out.println(coordinaterepository.findByTimeStamp(1468118182078).toString());
			//System.out.println( vmrepository.findByTimeStamp(1467686813574L));
			//System.out.println(coordinaterepository.findAll().toString());

		//} catch (DataAccessException e) {

		//	e.printStackTrace();

		//}
			
			FlowtableGetter nodeGetter = new FlowtableGetter("openflow:6");
			FlowtableGetter flowtableGetter = new FlowtableGetter("openflow:6","21");
			System.out.println(nodeGetter.getFlowtable());
			System.out.println(flowtableGetter.getFlowtable());

	}

}
