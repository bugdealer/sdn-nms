package com.example.tablemapping;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface TableMappingRepository extends MongoRepository<TableMapping, String>{

	public List<TableMapping> findAll();
	public List<TableMapping> findByVnId(int vnId);
	public List<TableMapping> findByNodeId(String nodeId);
	public List<TableMapping> findByVnTableId(int vnTableId);
	public List<TableMapping> findByTableId(int tableId);
	
}
