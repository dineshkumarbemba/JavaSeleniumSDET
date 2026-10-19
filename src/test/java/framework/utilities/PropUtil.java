package framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropUtil {
	
public static Properties readData(String fileName) {
	//Initialize the properties class
	Properties prop = new Properties();
	try {
		//Read the properties file by using FileInputStream
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Config\\"+fileName);
		//Load the properties into prop variable
		prop.load(fis);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	return prop;
}
}
