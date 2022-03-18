package Utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.*;

public class Runner {
    @BeforeTest
    public static void setup(){
        Configuration.browser = "chrome";
        Configuration.browserSize = "1928x1033";
        open("https://www.hr.ge/");
    }

}
