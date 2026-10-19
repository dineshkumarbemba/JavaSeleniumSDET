package framework.test;

import java.util.Properties;

import framework.utilities.PropUtil;

public class PropTest {
	public static void main(String[] args) {
		//PropUtil pro= new PropUtil();
		Properties prop= PropUtil.readData("Config.properties");
		String property = prop.getProperty("APP_URL");
		System.out.println(property);
	}

}
