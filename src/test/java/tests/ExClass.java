package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ExClass {

    static ThreadLocal<WebDriver> driver=new ThreadLocal<>();

    @BeforeClass
    public void before() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options));
    }

    @Test
    public void testing() throws MalformedURLException, InterruptedException {
        ChromeOptions options = new ChromeOptions();

        driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options));

        driver.get().get("https://google.com");
        Thread.sleep(2000);
        driver.get().quit();
    }

    @Test
    public void testing2() throws MalformedURLException, InterruptedException {
        ChromeOptions options = new ChromeOptions();

        driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options));

        driver.get().get("https://google.com");
        Thread.sleep(2000);
        driver.get().quit();
    }

    @Test
    public void testing3() throws MalformedURLException, InterruptedException {
        ChromeOptions options = new ChromeOptions();

        driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options));

        driver.get().get("https://google.com");
        Thread.sleep(2000);
        driver.get().quit();
    }

    @Test
    public void testing4() throws MalformedURLException, InterruptedException {
        ChromeOptions options = new ChromeOptions();

        driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options));

        driver.get().get("https://google.com");
        Thread.sleep(2000);
        driver.get().quit();
    }

    @Test
    public void testing5() throws MalformedURLException, InterruptedException {
        ChromeOptions options = new ChromeOptions();

        driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options));

        driver.get().get("https://google.com");
        Thread.sleep(2000);
        driver.get().quit();
    }
}
