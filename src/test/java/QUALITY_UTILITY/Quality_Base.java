package QUALITY_UTILITY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Quality_Base {
	
	public static WebDriver driver;
	public static Properties hi;
	public Quality_Base () {
		
	try {
		FileInputStream obj = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\QUALITY_CONFIG\\Quality_Config.Properties");
		
			
	 hi=new Properties();
	 hi.load(obj);		
			
				
	} catch (FileNotFoundException e) {
		System.out.println("Please check the constructor");
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	}
	public void Quality_Browser() { //Browser setup
		
		String QBrowser=hi.getProperty("Browser1");
		if(QBrowser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("Webdriver.chrome.driver",System.getProperty ("user.dir")+"Chrome_driver/chromedriver.exe");
			ChromeOptions ab=new ChromeOptions();
			ab.addArguments("--remote-allow-origins=*");
		    driver=new ChromeDriver();
		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Quality_Utility.pageLoadTimeout));
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Quality_Utility.implicitlyWait));
			driver.manage().window().maximize();
		}
		else if(QBrowser.equalsIgnoreCase("Edge")) {
			
			System.setProperty("webdriver.edge.driver",System.getProperty ("user.dir")+"Edge_driver/msedgedriver.exe");
			EdgeOptions ab=new EdgeOptions();
			ab.addArguments("--remote-allow-origins=*");
		    driver=new EdgeDriver();
		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Quality_Utility.pageLoadTimeout));
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Quality_Utility.implicitlyWait));
			driver.manage().window().maximize();
	}
	
	}
	public static void QualityLuanchingURL(String URL) {  //setup URL in Browser
		Quality_Utility.takeMyScreenshot(driver, "Home Page");
		driver.get(hi.getProperty("URL"));
		
	}
	
	
	

}


