package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtil {
    @DataProvider
    public static Object[][] sehirVerileri() {
        return new Object[][]{{"Ankara","IcAnadalu","06"},
                {"izmir","ege","35"},
                {"Diyarbakır","doğu","21"}    };
    }
}
