package tests;

import org.egeiper.DriverUtils;
import org.egeiper.util.model.BrowserType;
import org.egeiper.util.model.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExClass {

    @Test
    public void ege() {
        WebDriver driver =DriverUtils.getDriver(DriverType.REMOTE, BrowserType.CHROME);
        driver.get("https://google.com");
        driver.quit();

    }
}
