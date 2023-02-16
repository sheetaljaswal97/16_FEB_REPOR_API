package common_functions;

import io.restassured.RestAssured;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import io.restassured.RestAssured;
public class common_functionclass {

	
	@BeforeClass
	public static void base_uri()
	{
		 RestAssured.baseURI = "https://rahulshettyacademy.com"; 
	}
	
	public static void method_post_Api()
	{
		//		 RestAssured.baseURI = "https://rahulshettyacademy.com"; 

		System.out.println("*******************Post API***********");
		System.out.println(RestAssured.baseURI+"/maps/api/place/add/json");
		String response = given().queryParam("key", "qaclick123").header("content-type","application/json").body("{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Frontline house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}\r\n"
				+ "").when()
				.post("/maps/api/place/add/json").then()
				.log().all().assertThat()
				.statusCode(200).extract()
				.body().asString();

		System.out.println(response);
		JsonPath js = new JsonPath(response);
		String place_id=js.getString("place_id");
		System.out.println(place_id);

	}
	
	public static void method_post_Api1()
	{
		//		 RestAssured.baseURI = "https://rahulshettyacademy.com"; 

		System.out.println("*******************Post API***********");
		System.out.println(RestAssured.baseURI+"/maps/api/place/add/json");
		String response = given().queryParam("key", "qaclick123").header("content-type","application/json").body("{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Frontline house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}\r\n"
				+ "").when()
				.post("/maps/api/place/add/json").then()
				.log().all().assertThat()
				.statusCode(200).extract()
				.body().asString();

		System.out.println(response);
		JsonPath js = new JsonPath(response);
		String place_id=js.getString("place_id");
		System.out.println(place_id);

	}
	
	
	
}
