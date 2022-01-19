package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try
		{
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		}catch(Exception e)
		{
			System.out.println("Exception is" + e.getMessage());
		}
		
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername()
	{
		String user=pro.getProperty("username");
		return user;
	}
	public String getPassword()
	{
		String pass=pro.getProperty("password");
		return pass;
	}
	public String getChromePath()
	{
		String chrome=pro.getProperty("chromepath");
		return chrome;
	}
	public String getFireFox()
	{
		String firefox=pro.getProperty("firefoxpath");
		return firefox;
	}
}
