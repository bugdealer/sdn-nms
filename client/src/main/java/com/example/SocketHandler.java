package com.example;

import javax.websocket.Session;

import org.eclipse.jetty.websocket.client.WebSocketClient;
import org.neo4j.cypher.internal.compiler.v2_1.planner.logical.steps.aggregation;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.client.WebSocketConnectionManager;
import org.springframework.web.socket.client.jetty.JettyWebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;


public class SocketHandler implements WebSocketHandler {
	
	
	private UpdateHandler updateHandler;
	
	public SocketHandler(String updateURI) {
	 super();
	 updateHandler = new UpdateHandler(updateURI);
	}

	@Override
	public void afterConnectionClosed(WebSocketSession arg0, CloseStatus arg1) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Connection Closed.");
		System.out.println(arg1.getCode()+ arg1.getReason());
		System.out.println(arg0.getUri());
		JettyWebSocketClient client = new JettyWebSocketClient();
		WebSocketConnectionManager cManager = new WebSocketConnectionManager(client, this, arg0.getUri().toString());
		
		cManager.start();
		
		
	} 

	@Override
	public void afterConnectionEstablished(WebSocketSession arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Connection Established.");
		
		try {
			updateHandler.doUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

	@Override
	public void handleMessage(WebSocketSession arg0, WebSocketMessage<?> arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Received Message:" + arg1.getPayload().toString());
		
		try {
			updateHandler.doUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	
	}

	@Override
	public void handleTransportError(WebSocketSession arg0, Throwable arg1) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean supportsPartialMessages() {
		// TODO Auto-generated method stub
		return false;
	}

}
