package tests;

import org.egeiper.WebDriverUtils;
import org.egeiper.util.model.BrowserType;
import org.egeiper.util.model.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ExClass3 {


    String host="localhost";
    static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeClass
    public void startDriver() throws MalformedURLException {
        if(System.getProperty("HUB_HOST") != null){
            host = System.getProperty("HUB_HOST");
        }
        driver.set(new RemoteWebDriver(new URL("http://" + host + ":4444/wd/hub"),new ChromeOptions()));
    }


    @AfterClass
    public void endDriver() {
        driver.get().quit();
    }

    @Test
    public void testing1() throws InterruptedException {
        driver.get().get("https://google.com");
        Thread.sleep(3000);
        System.out.println("This is Class-3 testing-1");
    }

    @Test
    public void testing2() throws InterruptedException {
        driver.get().get("https://google.com");
        Thread.sleep(3000);
        System.out.println("This is Class-3 testing-2");

    }

    @Test
    public void testing3() throws InterruptedException {
        driver.get().get("https://google.com");
        Thread.sleep(3000);
        System.out.println("This is Class-3 testing-3");

    }


}
