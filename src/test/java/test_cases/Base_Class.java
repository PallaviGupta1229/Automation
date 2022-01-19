package test_cases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.ReadConfig;

public class Base_Class {
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	
	
	@BeforeClass
	public void setup()
	{
		   System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		   driver=new ChromeDriver();
		
		
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
