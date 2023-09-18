package com.api.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteAPIcallTest {

	@Test
	public void DeleteAPIcall()
	{
		RequestSpecification request = RestAssured.given();
        
		Response resposne =  request.delete("https://reqres.in/api/users/2");
		
		int actualStatusCode = resposne.getStatusCode();
		
		assertEquals(actualStatusCode, 204);
	}
}
