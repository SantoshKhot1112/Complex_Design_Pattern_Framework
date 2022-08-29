package dataSource;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	public static String getPropertyValue(String filePath, String key) throws IOException {
		FileReader file = new FileReader(filePath);
		Properties property = new Properties();
		property.load(file);
		return property.getProperty(key);
	}
}
 