package com.api.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TestAPIclass {

	@Test
	public void getUsersInPageTwo()
	{
		Response resposne = given().when().get("https://reqres.in/api/users?page=2");
		
		int actuaStatus = resposne.statusCode();
		
		Assert.assertEquals(actuaStatus, 200);
	}

	@Test
	public void getUsersInPageOne()
	{
		Response resposne = given().when().get("https://reqres.in/api/users?page=1");
		
		int actuaStatus = resposne.statusCode();
		
		Assert.assertEquals(actuaStatus, 200);
	}
	
	@Test
	public void getSingleUser()
	{
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		int actuaStatus = response.statusCode();
		assertEquals(actuaStatus, 200);
	}	
	
	@Test
	public void getListResources()
	{
		Response response = RestAssured.get("https://reqres.in/api/unknown");
		int actuaStatus = response.statusCode();
		assertEquals(actuaStatus, 200);
	}	
}