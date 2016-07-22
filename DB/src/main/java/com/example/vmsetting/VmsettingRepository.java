package com.example.vmsetting;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface VmsettingRepository extends MongoRepository<Vmsetting, String> {
	public List<Vmsetting> findAll();
	public List<Vmsetting> findByTopoHashcode(int hashCode);
	public Vmsetting findByTimeStamp(long timeStamp);
	public List<Vmsetting> findBySelected(boolean selected);
	public Vmsetting save(Vmsetting s);
	public int deleteByTimeStamp(long timeStamp);
	public void deleteAll();
	


	
}