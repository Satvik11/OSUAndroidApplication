package com.example.hackathonandroidapplication;
import android.net.Uri;
import android.os.Bundle;
import android.
public class WeatherData{
	
	static String weatherKey = "79eff3c2692ee9e076066c4f25ddc98d";
	
	public static double getWeatherTemp(double lat, double lon){
		// Get Weather Data
		double temp = 0;
		String url = "http://samples.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + lon + "&appid=" + weatherKey;
		return temp;
		
	}
	StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
            new Response.Listener<String>() {
    @Override
    public void onResponse(String response) {
        // Display the first 500 characters of the response string.
        //String recivedjsn = mTextView.setText( response.substring(0,500));
    	System.out.println(response);
    }
}





// API base Url/Call http://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b1b15e88fa797225412429c1c50c122a1