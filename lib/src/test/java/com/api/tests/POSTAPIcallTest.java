package com.api.tests;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTAPIcallTest {

	@Test
	public void postAPItest()
	{
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type" , "application/json");
		
		JSONObject json = new JSONObject();
		json.put("name", "jhon cena");
		json.put("job", "wrestler");
		
		request.body(json.toJSONString());
		
		Response resposne =  request.post("https://reqres.in/api/users");
		
		int actualStatusCode = resposne.getStatusCode();
		
		assertEquals(actualStatusCode, 201);
	}
}