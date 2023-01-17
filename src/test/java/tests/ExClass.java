package tests;

import org.egeiper.PropertyUtils;
import org.testng.annotations.Test;

public class ExClass {

    @Test
    public void ege() {
        System.out.println(PropertyUtils.getProperty("config.properties","awsRegion"));

    }
}
