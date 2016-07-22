package com.example.vn;

import java.util.List;

import org.neo4j.cypher.internal.compiler.v2_1.planner.logical.findShortestPaths;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.topo.Topo;


public interface VnRepository extends MongoRepository<Vn, String> {
	
	public List<Vn> findAll();
	public List<Vn> findByVnid(int vnid);

}
