package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetAPITest extends TestBase{
	TestBase testbase;
	String apiUrl;
	String serviceUrl;
	RestClient restClient;
	String url;
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
		testbase = new TestBase ();
		 apiUrl = prop.getProperty("url");
		 serviceUrl = prop.getProperty("serviceURL");
		
		 url = apiUrl + serviceUrl;
		
		
	}
	
	@Test
	public void getTest() throws ClientProtocolException, IOException {
		 restClient = new RestClient();
		restClient.get(url);
	
	}

}
