package apiLearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetMethod {

	public void getMethodExpample() throws IOException {
		// TODO Auto-generated method stub
		URL url = new URL ("http://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		int responseCode = connection.getResponseCode();
		String responseMessage = connection.getResponseMessage();
		System.out.println("Response code "+responseCode+ "Response Messgae "+responseMessage);
	
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();		
		while((line=bufferedReader.readLine())!=null) {
			
			buffer.append(line);
		}
		System.out.println(buffer);
	
	}
	
	
	public void postMethodExpample() throws IOException {
		URL url = new URL ("http://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		
		String jsonbody = "{\"name\":\"AgniP\",\"salary\":\"10000000\",\"age\":\"1\"}";
		byte[] inputjson = jsonbody.getBytes();
		
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputjson);
		
		System.out.println("Response Code :"+connection.getResponseCode());
		System.out.println("Response Message :"+connection.getResponseMessage());
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();		
		while((line=bufferedReader.readLine())!=null) {
			
			buffer.append(line);
		}
		System.out.println(buffer);
	
	}
	
	public void putMethodExpample() throws IOException { // Everything is same as post except the below mention changes
		URL url = new URL ("http://dummy.restapiexample.com/api/v1/update/24018"); //24018 is the id of the existing data 
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("PUT"); // Changed the method
		connection.setRequestProperty("Content-Type", "application/json");
		
		String jsonbody = "{\"name\":\"AgniP\",\"salary\":\"10000000\",\"age\":\"27\"}"; //Changed the data which need to updated
		byte[] inputjson = jsonbody.getBytes();
		
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputjson);
		
		System.out.println("Response Code :"+connection.getResponseCode());
		System.out.println("Response Message :"+connection.getResponseMessage());
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();		
		while((line=bufferedReader.readLine())!=null) {
			
			buffer.append(line);
		}
		System.out.println(buffer);
	
	}
	
	public void deleteMethodExpample() throws IOException { // Everything is same as post except the below mention changes
		URL url = new URL ("http://dummy.restapiexample.com/api/v1/delete/24018"); //24018 is the id of the existing data 
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("DELETE"); // Changed the method
		connection.setRequestProperty("Content-Type", "application/json");
		
		//Delete this code
//		String jsonbody = "{\"name\":\"AgniP\",\"salary\":\"10000000\",\"age\":\"27\"}"; //Changed the data which need to updated
//		byte[] inputjson = jsonbody.getBytes();
//		
//		OutputStream outputStream = connection.getOutputStream();
//		outputStream.write(inputjson);
		
		System.out.println("Response Code :"+connection.getResponseCode());
		System.out.println("Response Message :"+connection.getResponseMessage());
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();		
		while((line=bufferedReader.readLine())!=null) {
			
			buffer.append(line);
		}
		System.out.println(buffer);
	
	}
	
	public static void main(String[] args) throws IOException {
		GetMethod method = new GetMethod();
		method.getMethodExpample();
		method.postMethodExpample();
		method.putMethodExpample();
		method.deleteMethodExpample();
	}
}
