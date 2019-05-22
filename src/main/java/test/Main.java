package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import ua.factory.DishFactory;
import ua.models.Dish;
import ua.models.dao.DishDao;

public class Main {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://itea.ua/");
			HttpURLConnection urlconn = (HttpURLConnection) url.openConnection();
			urlconn.setDoInput(true);
			urlconn.setDoOutput(true);
			urlconn.setRequestMethod("GET");
			InputStream stream = urlconn.getInputStream();
			BufferedReader buffer = new BufferedReader(new InputStreamReader(stream));
			String line = "";
			while((line=buffer.readLine())!=null) 
			{
				System.out.println(line);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
