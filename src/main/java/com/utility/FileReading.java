package com.utility;

import com.constants.Constants;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileReading {

    public static Map<String, String> readProperties(String filename) {
        Properties p = new Properties();
        Map<String, String> data = new HashMap<String, String>();
        try {
            File f = new File(Constants.pathTestResources + Constants.slash + Constants.testData + Constants.slash + filename + Constants.dot + Constants.properties);
            FileInputStream fileInputStream = new FileInputStream(f);
            p.load(fileInputStream);

            for (Map.Entry e : p.entrySet()) {
                data.put((String) e.getKey(), (String) e.getValue());
            }

        } catch (Exception e) {
            System.out.println("There is some issue while reading the file");
        }
        return data;
    }

    public static Map<String, String> readEnvironmentData(String env, String filename) {
        Properties p = new Properties();
        Map<String, String> data = new HashMap<String, String>();
        try {
            File f = new File(Constants.pathTestResources + "\\Environments\\" + env + "\\" + filename + ".properties");
            FileInputStream fileInputStream = new FileInputStream(f);
            p.load(fileInputStream);

            for (Map.Entry e : p.entrySet()) {
                data.put((String) e.getKey(), (String) e.getValue());
            }

        } catch (Exception e) {
            System.out.println("Issue with readEnvironment method " + e.toString());
        }
        return data;
    }


}
