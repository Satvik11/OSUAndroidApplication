package com.example.hackathonandroidapplication;
import android.net.Uri;

import android.os.Bundle;
import android.util.Log;

public class WeatherData{

	
	static String weatherKey = "79eff3c2692ee9e076066c4f25ddc98d";
	
	public static double getLatLongTemp(double lat, double lon){
		// Get Weather Data
		double temp = 0;
		String url = "http://samples.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + lon + "&appid=" + weatherKey;
		return temp;
	}
	public static double getCityTemp(String city){
		// Get Weather Data
		double temp = 0;
		String url = "http://samples.openweathermap.org/data/2.5/weather?q="+city+"&appid="+weatherKey;
		return temp;
	}
	public static double getZipTemp(int zip){
		// Get Weather Data
		double temp = 0;
		String url = "http://samples.openweathermap.org/data/2.5/weather?zip="+ zip+ "&appid="+ weatherKey;
		return temp;
	}
	SyncClient.post(url, params, new JsonHttpResponseHandler() {
		@Override
		public void onStart() {
			// you can do something here before request starts
		}

		@Override
		public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
			// success logic here
		}


		@Override
		public void onFailure(int statusCode, Header[] headers, Throwable e, JSONObject errorResponse) {
			// handle failure here
		}

	});
}
           // new Response.Listener<String>() {
   




// API base Url/Call http://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b1b15e88fa797225412429c1c50c122a1