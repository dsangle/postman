package com.qa.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {

	// Get Method

	public void get(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url);
		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpGet);

		// get status code
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();

		System.out.println("statusCode is--> " + statusCode);

		// get json string
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");

		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("response json string --> " + responseJson);

		// get all headers
		Header[] headerArray = closeableHttpResponse.getAllHeaders();
		HashMap<String, String> allHeaders = new HashMap<String, String>();

		for (Header header : headerArray) {
			allHeaders.put(header.getName(), header.getValue());

		}
		System.out.println("Headers array --->" + allHeaders);
	}

	// Post method
	public void post(String url, String entityString, HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient =	HttpClients.createDefault();
		  HttpPost httpPost = new HttpPost(url);
		  httpPost.setEntity(new StringEntity(entityString));//for payload
		  
		  //for headers:
		  for(Map.Entry<String, String> entry : headerMap.entrySet()) {
				 httpPost.addHeader(entry.getKey(),entry.getValue());
				 
			 }
		  httpClient.execute(httpPost);
		  
	}
}
	
	
	
	