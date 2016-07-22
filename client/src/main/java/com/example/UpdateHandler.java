package com.example;

import java.net.URI;
import java.net.URISyntaxException;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.json.JSONObject;
import org.neo4j.cypher.internal.compiler.v2_2.perty.gen.docStructureDocGen;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class UpdateHandler {
	
	private String updateURI;
	private DbUpdater dbUpdater;
	
	public UpdateHandler(String updateURI){
		this.updateURI = updateURI;
		
		
	}
	
	public  void doUpdate(){
		System.out.println("Update URI: " + updateURI);
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("AUTHORIZATION", "Basic YWRtaW46YWRtaW4=");
		RestTemplate restTemplate = new RestTemplate();
		
		HttpEntity<String> getEntity = new HttpEntity<String>(headers);
		HttpEntity<String> response = null;
		try {
			response = restTemplate.exchange(new URI(updateURI),HttpMethod.GET,getEntity,String.class);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(response.getBody());
		
		JSONObject rsbody = new JSONObject(response.getBody());
		String doc = rsbody.getJSONObject("network-topology").getJSONArray("topology").getJSONObject(0).toString();
		System.out.println(doc);
		
		dbUpdater = new DbUpdater(doc);
		Thread uThread = new Thread(dbUpdater);
		uThread.start();
		
		
		
		
		
		
	}
	
	
	

}
