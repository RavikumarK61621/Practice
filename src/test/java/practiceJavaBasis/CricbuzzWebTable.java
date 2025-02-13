package practiceJavaBasis;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricbuzzWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/91778/aus-vs-ind-1st-test-india-tour-of-australia-2024-25/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		String element = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/div[3]/div")).getText();
//		System.out.println(element);
		

		
		List<WebElement>  element = driver.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]/div/div[3]"));
		int size = element.size();
		System.out.println(size);
		
		for (int i = 1; i <= size; i++) {
			String element1 = driver.findElement(By.xpath("((//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]/div/div[3])["+i+"]")).getText();
			System.out.println(element1);
		}
	}

}
