package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestCase1 
{
	public static void main(String args[])throws IOException
	
	{
		//Commit new changes
	Properties prop=new Properties();
	FileInputStream fs=new FileInputStream("C:\\Users\\User\\Desktop\\Learning\\Java-PropertiesExcel\\src\\config\\object.properties");
	prop.load(fs);
	System.out.println(prop.getProperty("name"));
	}
}
