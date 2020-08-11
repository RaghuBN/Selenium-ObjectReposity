package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigFileReader {

	Properties pro;

	public ConfigFileReader() {
		try {
			File src = new File("./PropertiesFile/config.property");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is...." + e.getMessage());
		}
	}

	public String getChromePath() {
		String path = pro.getProperty("ChromeDriver");
		return path;
	}

	public String getAppURL() {
		String Url = pro.getProperty("baseUrl"); // Or return pro.getProperty(getAppURL())
		return Url;
	}
	
	public String UName() {
		String uname = pro.getProperty("Uname");
		return uname;
		}
	
	public String PWord() {
		String Pswd = pro.getProperty("Psd");
		return Pswd;
	}
	
	public String SignButton() {
		String button = pro.getProperty("SignIn");
		return button;
	}
	}
	
	

