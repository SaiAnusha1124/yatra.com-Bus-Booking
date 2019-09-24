package com.yatra.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadLocatorsFile {
	static Properties properties;
	static FileReader reader;
	static File file;

	public static Properties loadProperty(String filePath) {
		properties = new Properties();
		file = new File(filePath);
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			properties.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

	public static String getData(String data) throws IOException {
		String filedata = properties.getProperty(data);
		return filedata;
	}
}
