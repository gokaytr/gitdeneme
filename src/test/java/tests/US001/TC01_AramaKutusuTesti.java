package tests.US001;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class TC01_AramaKutusuTesti {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Page page = new Page();
        page.aramaKutusu.sendKeys("iphone", Keys.ENTER);
        Driver.closeDriver();

        //Amazon sayfasına gidilip arama kutusu test edildi.git
        ///sonradan eklenen kısım
        // yeni eklenen kısım
        // en son eklenen kısım  master da iken pull yapmalisiniz
        //amazon sayfası
    }

}
