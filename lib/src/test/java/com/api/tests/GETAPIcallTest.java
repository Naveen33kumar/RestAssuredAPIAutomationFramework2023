package com.api.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GETAPIcallTest {

	@Test
	public void getAPIcallTest()
	{
		Response resposnse = RestAssured.get("https://reqres.in/api/users/2");
		
		int actualStatuscode = resposnse.getStatusCode();
		
		assertEquals(actualStatuscode, 200);
		
		
	}
}
