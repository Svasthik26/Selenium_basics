package uk.axone.dit_webdriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleLAunchBrowser
{
    @Test
    public void launchBrowser() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\jawaj\\OneDrive\\Supriya\\Testing\\software\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        FirefoxDriver fd=new FirefoxDriver();
        Thread.sleep(5000);
        fd.quit();



    }

}
