package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class browserFactory {
    WebDriver driver;

    public void setup() {
        ChromeOptions opt = new ChromeOptions();
        opt.addExtensions(new File("C:\\extension\\uBlock.crx"));
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://automationexercise.com/");

    }
}
