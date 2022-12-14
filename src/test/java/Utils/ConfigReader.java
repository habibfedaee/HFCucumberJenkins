package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // create an instance of Properties class
    static Properties prop;

    //this method will read any property file and return properties type
    public static Properties readProperties(String filePath){
        try{
            FileInputStream fis = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    // this method gets single value based on the key
    public static String getPropertyValue(String key){ return prop.getProperty(key);}

}
