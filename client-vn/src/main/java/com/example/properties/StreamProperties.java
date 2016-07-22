package com.example.properties;



import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StreamProperties {

	@Value("#{'${stream.path}'.split(',')}")
	private List<String> path;
	@Value("${stream.datastore}")
	private String datastore;
	@Value("${stream.scope}")
	private String scope;
	
	
	public List<String> getPath() {
		return path;
	}
	public void setPath(List<String> path) {
		this.path = path;
	}
	public String getDatastore() {
		return datastore;
	}
	public void setDatastore(String datastore) {
		this.datastore = datastore;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	
	
	

}
