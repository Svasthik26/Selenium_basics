package uk.axone.dit_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBrowserNavigationMethods {
    @Test
    public void testBrowserMethods() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jawaj\\OneDrive\\Supriya\\Testing\\software\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver() ;
      //  driver.get("http://uitest.automationtester.uk/");
        driver.navigate().to("http://uitest.automationtester.uk/bootstrap-date-picker-demo.html");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.close();


    }
}
