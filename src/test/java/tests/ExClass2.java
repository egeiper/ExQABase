package tests;

import org.egeiper.WebDriverUtils;
import org.egeiper.util.model.BrowserType;
import org.egeiper.util.model.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import java.net.MalformedURLException;

public class ExClass2 {
    String host="localhost";
    static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeClass
    public void startDriver() {
        if(System.getProperty("HUB_HOST") != null){
            host = System.getProperty("HUB_HOST");
        }
        driver.set(WebDriverUtils.getRemoteDriver(DriverType.REMOTE, BrowserType.CHROME,host,"4444"));
    }


    @AfterClass
    public void endDriver() {
        driver.get().quit();
    }

    @Test
    public void testing1() throws InterruptedException {
        driver.get().get("https://google.com");
        Thread.sleep(3000);
        System.out.println("This is Class-2 testing-1");

    }

    @Test
    public void testing2() throws InterruptedException {
        driver.get().get("https://google.com");
        Thread.sleep(3000);

        System.out.println("This is Class-2 testing-2");

    }

    @Test
    public void testing3() throws InterruptedException {
        driver.get().get("https://google.com");
        Thread.sleep(3000);

        System.out.println("This is Class-2 testing-3");
    }
}
