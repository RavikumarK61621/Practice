package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	
//	static String browser;
//	static WebDriver driver; 
//
//			public static void setBrowser() {
//			browser = "ChromeDriver";
//		}
//			
//
//		public static void setBrowserConfig() {
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
//		    WebDriver driver = new ChromeDriver();
//		    driver.get("https://testapp.strategy.ai/");
//		    driver.manage().window().maximize();
//
//		}
//		public static void runTest() throws InterruptedException {
//			Thread.sleep (2000);
//			driver.findElement(By.xpath("//*[@id=\"q-app\"]/div/header/div[1]/div[2]/div[2]/div/button[1]/span[2]/span")).click();
//		    // System.out.println("Page Title: " + driver.getTitle());
//		     driver.findElement(By.name("email")).sendKeys("test1811@strategy.ai");
//		     driver.findElement(By.xpath("//input[@class='q-field__native q-placeholder'] [@type='password']")).sendKeys("Password@123");
//		     driver.findElement(By.xpath("//*[@id=\"sign-in\"]/div[4]/div/button")).click();
//		     Thread.sleep (8000);
//		     driver.findElement(By.xpath("//*[@id=\"q-app\"]/div/div[2]/main/div[1]/div[1]/div[2]/div[1]/div[3]/form/div/div/label")).sendKeys("What is the doc about");
//		     driver.findElement(By.xpath("//*[@id=\"q-app\"]/div/div[2]/main/div[1]/div[1]/div[2]/div[1]/div[3]/form/div/div/label/div/div/div/button/span[2]/i")).click();
//		     Thread.sleep (30000);
//		     driver.findElement(By.xpath("//*[@class=\"q-btn__content text-center col items-center q-anchor--skip justify-center row\"]")).click();
//		     driver.findElement(By.xpath("//*[@class='q-item__section column q-item__section--main justify-center sign-out-size']")).click();
//		     driver.quit();
//		     }
//		
	
	
	public static void main(String[] args) {
		//Sort the Array in Reverse Order 
		 Integer [] array = {9, 9, 4, 0, 1, 2, 1, 2, 4, 3}; 
		 
		 Arrays.sort(array, Collections.reverseOrder());
		 
		 System.out.println(Arrays.toString(array));
		 System.out.println("Largest Number: " + array[0]);
		 System.out.println("Smallest Number: " + array[array.length-1]);
		 
//        String words = "accerance";
//        
//        Map<Character,Integer> mapvalue = new HashMap();
//        char[] charArray = words.toCharArray();
//        
//        for(char ch:charArray) {
//        	if(!mapvalue.containsKey(ch)) {
//        		mapvalue.put(ch, 1);
//        	}
//        	else {
//        		Integer value = mapvalue.get(ch);
//        			mapvalue.put(ch, value+1);
//        		}
//        		
//        	}
//        System.out.println(mapvalue);
	
	
        }
}














