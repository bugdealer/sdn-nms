package com.example.cluster;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.vmsetting.Vmsetting;


public interface ClusterRepository extends MongoRepository<Cluster, String> {
	public List<Cluster> findAll();
	public List<Cluster> findByTopoHashcode(int hashCode);
	public Cluster findByTimeStamp(long timeStamp);
	public List<Vmsetting> findBySelected(boolean selected);
	public Cluster save(Cluster c);
	public int deleteByTimeStamp(long timeStamp);
	public void deleteAll();
}