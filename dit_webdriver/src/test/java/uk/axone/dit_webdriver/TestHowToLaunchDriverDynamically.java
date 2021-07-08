package uk.axone.dit_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import sun.security.x509.OtherName;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestHowToLaunchDriverDynamically {

    String browser,appUrl,path;
        WebDriver driver;

    @Test
    public void testDynamicDriver() throws InterruptedException {

     //  path=System.getProperty("user.dir")+"src/test/java/uk/axone/dit_webdriver/app.properties";
        path="C:\\Users\\jawaj\\OneDrive\\Supriya\\Intellij\\dit_selenium_basics\\dit_webdriver\\src\\test\\java\\uk\\axone\\dit_webdriver\\app.properties";
        Properties prop=new Properties();
        try {
            FileInputStream fis=new FileInputStream(path);
            prop.load(fis);
            browser=prop.getProperty("browser");
            appUrl=prop.getProperty("appUrl");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (browser.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\jawaj\\OneDrive\\Supriya\\Testing\\software\\geckodriver-v0.29.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();

        } else if (browser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\jawaj\\OneDrive\\Supriya\\Testing\\software\\chromedriver_win32 (1)\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.get(appUrl);
        driver.getTitle();
        Thread.sleep(5000);
        driver.close();
    }
    }