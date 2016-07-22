package com.example;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;
import org.json.JSONObject;
import org.neo4j.cypher.internal.compiler.v2_1.executionplan.addEagernessIfNecessary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.WebSocketConnectionManager;
import org.springframework.web.socket.client.jetty.JettyWebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;

import com.hazelcast.com.eclipsesource.json.JsonObject;
import com.mongodb.util.JSON;

@SpringBootApplication
@EnableScheduling
public class ClientApplication {

	
	
	public static void main(String[] args) throws Exception, URISyntaxException {
		SpringApplication.run(ClientApplication.class, args);
	
		
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
	
		
		HttpHeaders postheaders = new HttpHeaders();
		postheaders.setContentType(MediaType.APPLICATION_JSON);
		postheaders.set("AUTHORIZATION", "Basic YWRtaW46YWRtaW4=");
	
		JSONObject rqbody = new JSONObject();
		Map<String, String> rqbody_val = new HashMap<String,String>();
		rqbody_val.put("path", "/network-topology:network-topology");
		rqbody_val.put("sal-remote-augment:datastore","OPERATIONAL");
		rqbody_val.put("sal-remote-augment:scope","SUBTREE");
		
	    rqbody.put("input", rqbody_val);
	    HttpEntity<String> entity = new HttpEntity<String>(rqbody.toString(), postheaders);
	    ResponseEntity<String> response=null;
			response = restTemplate.
					postForEntity(new URI("http://172.17.17.9:8181/restconf/operations/sal-remote:create-data-change-event-subscription"),entity,String.class);
		
	
	    JSONObject rsbody = new JSONObject(response.getBody());
	  
	    System.out.println(rsbody.getJSONObject("output").getString("stream-name").toString());
	    
		HttpHeaders getheaders = new HttpHeaders();
		getheaders.set("AUTHORIZATION", "Basic YWRtaW46YWRtaW4=");
		
		String streamPath = "http://172.17.17.9:8181/restconf/streams/stream/";
		String streamName = rsbody.getJSONObject("output").getString("stream-name").toString();
		URI wsLocation;
		
		HttpEntity<String> getEntity = new HttpEntity<String>(getheaders);
		HttpEntity<String> getresponse = restTemplate.exchange(new URI(streamPath+streamName),HttpMethod.GET,getEntity,String.class);
		wsLocation = getresponse.getHeaders().getLocation();
		
		
		System.out.println(wsLocation);
		
		
		WebSocketClient client = new JettyWebSocketClient();
		
		
		
		SocketHandler handler = new SocketHandler("http://172.17.17.9:8181/restconf/operational/network-topology:network-topology");
		  WebSocketConnectionManager cManager = new WebSocketConnectionManager(client, handler, wsLocation.toString());
			
			cManager.start();
	
	
		
		
	
		
	
	}
	

}
