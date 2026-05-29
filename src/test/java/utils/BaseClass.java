package utils;

import java.io.File;
import java.io.IOException;

import org.apache.maven.surefire.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	}
	
	
	public void Screenshot() throws IOException {
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File ss= new File("C:\\Users\\VPOTASO\\eclipse-workspace\\prjectnew\\Screenshot\\loginss.png");
		FileUtils.copyFile(source, ss);
	}
	
	public void closebrowser() {
		driver.quit();
	}

}
