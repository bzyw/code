package org.bzyw.facade;

import java.io.*;
import java.util.Properties;

/**
 * Created by bzyw on 2018/5/18.
 */
public class Data {
    private static Properties properties = new Properties();

    private Data() {
    }

    static {
        Reader reader = null;
        try {
            reader = new FileReader(System.getProperty("user.dir") + File.separator + "maildata.properties");
            properties.load(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getMailAddress(String name) {
        return properties.getProperty(name);
    }
}
