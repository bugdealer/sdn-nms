package com.example.flowtable;

import java.net.URI;
import java.net.URISyntaxException;



import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;


public class FlowtableGetter {
	private String nodeId;
	private String tableId;
	private String uri;
	public FlowtableGetter(String nodeId,String tableId){
		uri = "http://172.17.17.9:8181/restconf/operational/opendaylight-inventory:nodes/node/";
		
		uri = uri + nodeId + "/flow-node-inventory:table/" + tableId;
		}
	
	public FlowtableGetter(String nodeId){
		uri = "http://172.17.17.9:8181/restconf/operational/opendaylight-inventory:nodes/node/";
		
		uri = uri + nodeId;
	}
	
	public JSONObject getFlowtable(){
		System.out.println(uri);
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
	
		HttpHeaders putheaders = new HttpHeaders();
		putheaders.setContentType(MediaType.APPLICATION_JSON);
		putheaders.set("AUTHORIZATION", "Basic YWRtaW46YWRtaW4=");
		RequestEntity<String> requestEntity=null;
		ResponseEntity<String> response=null;
	    JSONObject rsbody = null;
		
	    try {
			requestEntity = new RequestEntity<String>(putheaders,HttpMethod.GET,
					 new URI(uri));
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
	
	    
		try {
				response = restTemplate.exchange(requestEntity,String.class);
				
			} catch (RestClientException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				rsbody = null;
				return rsbody;
			}

	    rsbody = new JSONObject(response.getBody());
	    return rsbody;
		
	}
	

}
