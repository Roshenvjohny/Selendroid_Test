package com.jcg.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;

public class DriverInitializer {

    private static Properties properties = null;

    static {
        try {
            properties = new Properties();
            properties.load(DriverInitializer.class.getClassLoader()
                    .getResourceAsStream("application.properties"));
            System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

            
            ChromeOptions chromeOptions= new ChromeOptions();
              chromeOptions.setBinary("D:\\Selenium\\cucumberSelenium\\driver\\chromedriver.exe");

              ChromeDriver driver = new ChromeDriver(chromeOptions);
              

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver(String browser) {
        WebDriver driver = null;
        switch (getProperty("browser")) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                driver = new ChromeDriver();
        }
        return driver;
    }


    public static String getProperty(String key) {
        return properties == null ? null : properties.getProperty(key, "");
    }
}
