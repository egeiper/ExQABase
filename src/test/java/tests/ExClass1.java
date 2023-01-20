package tests;


import org.egeiper.WebDriverUtils;
import org.egeiper.util.model.BrowserType;
import org.egeiper.util.model.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ExClass1 {
    static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeClass
    public void startDriver() throws MalformedURLException {
        driver.set(WebDriverUtils.getDriver(DriverType.REMOTE, BrowserType.CHROME));
    }

    @AfterClass
    public void endDriver() {
        driver.get().quit();
    }

    @Test
    public void testing1() throws InterruptedException {
        driver.get().get("https://google.com");
        Thread.sleep(3000);
        System.out.println("This is Class-1 testing-1");

    }

    @Test
    public void testing2() throws InterruptedException {
        driver.get().get("https://google.com");
        Thread.sleep(3000);

        System.out.println("This is Class-1 testing-2");

    }

    @Test
    public void testing3() throws InterruptedException {
        driver.get().get("https://google.com");
        Thread.sleep(3000);

        System.out.println("This is Class-1 testing-3");
    }

}
