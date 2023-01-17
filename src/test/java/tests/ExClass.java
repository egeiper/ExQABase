package tests;

import org.egeiper.ParameterStoreUtils;
import org.testng.annotations.Test;

public class ExClass {

    @Test
    public void ege() {
        System.out.println(ParameterStoreUtils.get("ExampleParameter"));

    }
}
