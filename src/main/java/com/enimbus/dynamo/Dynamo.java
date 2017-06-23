package com.enimbus.dynamo;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.GetItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.regions.Regions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.GetItemRequest;
import com.amazonaws.services.dynamodbv2.model.GetItemResult; 
public class Dynamo {

private AmazonDynamoDB client;	
	
	public Dynamo() {
	 	// This client will default to US West (Oregon)
		client = AmazonDynamoDBClientBuilder.standard()
		.withRegion(Regions. US_EAST_1)
		.build();  // TODO Auto-generated constructor stu
	}
	
	public Boolean saveData(Object obj){
	
		try{
		DynamoDBMapper mapper = new DynamoDBMapper(client);
        mapper.save(obj);
		return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	public List<Object> getData( HashMap attribute , List colums){
		ArrayList<Object> lista =new ArrayList<Object>();
		
		return  lista;
	}


}
