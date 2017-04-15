package com.example.hackathonandroidapplication;
import android.net.Uri;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
public class WeatherData{
	
	static String weatherKey = "79eff3c2692ee9e076066c4f25ddc98d";
	
	public static double getWeatherTemp(double lat, double lon){
		// Get Weather Data
		double temp = 0;
		String url = "http://samples.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + lon + "&appid=" + weatherKey;
		return 0.0;
		
	} 
	
	StringRequest stringRequest = new StringRequest(Request.Method.GET, "http://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b1b15e88fa797225412429c1c50c122a1",
            new Response.Listener<String>() {
    @Override
    public void onResponse(String response) {
        // Display the first 500 characters of the response string.
        //mTextView.setText("Response is: "+ response.substring(0,500));
    	Log.d("TAG",response);
    }
}, new Response.ErrorListener() {
    @Override
    public void onErrorResponse(VolleyError error) {
       // mTextView.setText("That didn't work!");
    }
});
}




// API base Url/Call http://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b1b15e88fa797225412429c1c50c122a1