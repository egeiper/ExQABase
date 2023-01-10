package tests;

import org.egeiper.DriverHelper;
import org.egeiper.DriverUtils;
import org.egeiper.util.model.BrowserType;
import org.egeiper.util.model.DriverType;
import org.testng.annotations.Test;

public class ExClass {

    @Test
    public void ege() {
        DriverUtils.getDriver(DriverType.LOCAL, BrowserType.CHROME).get("https://google.com");
        DriverHelper

    }
}
