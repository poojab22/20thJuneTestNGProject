package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
//changes in baseclass
	public void browserLaunch() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\20thJuneTestFramework\\src\\main\\java\\Resources\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome") )
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\chrome_driver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			   
			   //FireFox code
			  }
			         else if(browserName.equalsIgnoreCase("Edge")) {
			   
			   //edge code
			  }
			         else {
			          System.out.println("please select valid browser");
			         }
	}
	
	
}
