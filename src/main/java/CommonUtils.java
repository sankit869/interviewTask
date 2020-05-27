import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CommonUtils {
    static WebDriver driver;

    static void launchBrowserAndNavTOSite() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://computer-database.herokuapp.com/computers");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void clickOnElement(By element) {
        driver.findElement(element).click();
    }

    static void entervalue(By element, String value) {
        driver.findElement(element).sendKeys(value);
    }

    public static String getText(By element) {
        return driver.findElement(element).getText();
    }

    public static void selectDropDown(By element, String value) {
        Select sc = new Select(driver.findElement(element));
        sc.selectByVisibleText(value);
    }

    public static void clearText(By element) {
        driver.findElement(element).clear();
    }
}
