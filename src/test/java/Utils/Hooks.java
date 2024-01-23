package Utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;

    @Before
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
    @After
    public void tearDown() {
        driver.quit();
    }
}

