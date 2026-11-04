package com.creatio.crm.framework.utilities;

import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {

	public static Properties getDataFromPropertiesFile(String value) {
		
		Properties prop = new Properties();
	
		try {
			FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\Config\\"+value);
			prop.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return prop;
		
	}
}
