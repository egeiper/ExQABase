package tests;

import org.egeiper.DriverHelper;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ExClass {

    @Test
    public void ege() {
        DriverHelper.getDriver().get("https://google.com");

    }
}
