package ObjectRepoDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.ConfigFileReader;

public class ObjTestDemo {

	@Test
	public void ConfigRead() throws Exception {
/*
		File src = new File("./PropertiesFile/config.property");
		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		String chromepath = pro.getProperty("ChromeDriver");
		System.out.println("ChromeBrowser Path is....  " + chromepath);
*/
		ConfigFileReader config = new ConfigFileReader();
		
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		WebDriver driver = new ChromeDriver();
		driver.get(config.getAppURL());
		driver.manage().window().maximize();
		
		driver.findElement(By.id(config.UName())).sendKeys("raghavendra.bn@gmail.com");
		driver.findElement(By.id(config.PWord())).sendKeys("raghubn@123");
		driver.findElement(By.xpath(config.SignButton())).click();
		
		Thread.sleep(5000);
		driver.quit();

	}
}
