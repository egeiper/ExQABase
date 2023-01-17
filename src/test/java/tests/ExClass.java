package tests;



import org.egeiper.DriverUtils;
import org.egeiper.ParameterStoreUtils;
import org.egeiper.PropertyUtils;
import org.egeiper.util.model.BrowserType;
import org.egeiper.util.model.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ExClass {

    @Test
    public void ege() {
        System.out.println(ParameterStoreUtils.get("ExampleParameter"));

    }
}
