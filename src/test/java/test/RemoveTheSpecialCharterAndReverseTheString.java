package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveTheSpecialCharterAndReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Input = "PSReer@#$%!@#";
//		String output = "REErsp";
		
		String replaceAll = Input.replaceAll("[^a-zA-Z]", "");
//		System.out.println(replaceAll);
		
		StringBuilder result = new StringBuilder();
		
		for(char ch:replaceAll.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				result.append(Character.toLowerCase(ch));
			}
			else {
				result.append(Character.toUpperCase(ch)); 
			}
		}
		result.reverse();
		System.out.println(result);


//
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.amazon.in/");
//		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='nav-xshop']/a[position() <= 5]"));
//		for(WebElement element:elements) {
//			System.out.println(element.getText());
////			System.out.println("Element Text: " + element.getText());
//		}
		
		
		
	}	
	}

