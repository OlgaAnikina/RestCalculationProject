package com;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;

import java.io.*;



public class CalculationRestClient {

    public static void main(String[] args) throws IOException {

        System.out.println("ADD");
        JSONObject jsonObject  = new JSONObject();
        jsonObject.put("a", 1);
        jsonObject.put("b", 4);

        System.out.println("jsonObject = " + jsonObject);
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpRequest = new HttpGet("http://localhost:9090/rest/calc/add/1/4");
        StringEntity stringEntity = new StringEntity(jsonObject.toString());
        stringEntity.setContentType("application/json");
        httpRequest.addHeader("Content-Type","application/json");
        httpRequest.getMethod();
        HttpResponse httpResponseADD = httpClient.execute(httpRequest);
        System.out.println("httpResponse = " + httpResponseADD);



    }





}
