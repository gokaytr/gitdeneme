package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    /*
    .properties uzantili dosyaya erişebilmek için properties classından obje olusturmamız gerekir.
    bu oluşturduğumuz obje ile akışa aldığımız dosya yolunu properties.load(fis) methodu ile properties
    dosyasındaki bilgileri objemize yükler ve properties dosyasındaki key değerini return ederiz.
    Bunu yapmak için parametreli bir method oluşturur girdiğimiz keyin değerini bize döndürür.

    */

    static Properties properties;
    public static String getProperty(String key){
        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String value =properties.getProperty(key);
        return value;

    }
}
