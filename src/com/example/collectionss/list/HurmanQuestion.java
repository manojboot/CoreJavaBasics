package com.example.collectionss.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class HurmanQuestion {
	
		public static void main(String[] args) throws IOException {
			
			String uri = "https://api.themoviedb.org/3/movie/upcoming?api_key=fdd6877fee69061a539a67340938bec9&language=en-US&page=page=${page}";
			
			//starting the try block  
	        URL url = new URL(uri); //URL Connection Created...  
	        HttpURLConnection con1 = (HttpURLConnection) url.openConnection(); //Http URL Connection Created...  
	        System.out.println("Connection Response Message : "+con1.getResponseMessage());  
	        System.out.println("Connection Response Message : "+con1.getResponseCode());  
	        String inline = null;
	        if(con1.getResponseCode()!=200) {
	        	throw new RuntimeException("Http Code :" +con1.getResponseCode());
	        }
	        else {
	        	Scanner sc = new Scanner(url.openStream());
	        	while(sc.hasNext())
	        	{
	        	inline+=sc.nextLine();
	        	}
	        	System.out.println("JSON data in string format");
	        	System.out.println(inline);
	        	sc.close();
	        }
		}

}
