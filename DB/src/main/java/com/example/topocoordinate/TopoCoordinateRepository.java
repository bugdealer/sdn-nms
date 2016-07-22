package com.example.topocoordinate;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.topo.Topo;

import java.util.List;


public interface TopoCoordinateRepository extends MongoRepository<TopoCoordinate, String> {
	
	public List<TopoCoordinate> findAll();

	public TopoCoordinate save(TopoCoordinate topo);
	public List<TopoCoordinate> findByConfigId(int configId);
	public List<TopoCoordinate> findByTimeStamp(long timeStamp);
	public int deleteByConfigId(int configId);
	public int deleteByTimeStamp(long timeStamp);
	public void deleteAll();
	



}
