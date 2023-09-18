package com.api.tests;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUTAPIcallTest {

	@Test
	public void putAPItest()
	{
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type" , "application/json");
		
		JSONObject json = new JSONObject();
		json.put("name", "morpheus");
		json.put("job", "zion residentupdated");
		
		request.body(json.toJSONString());
		
		Response resposne =  request.put("https://reqres.in/api/users/2");
		
		int actualStatusCode = resposne.getStatusCode();
		
		assertEquals(actualStatusCode, 200);
}
}