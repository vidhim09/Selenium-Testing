package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SelectTag {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement testdropdown = driver.findElement(By.name("country"));
        Select dropdown = new Select(testdropdown);
        dropdown.selectByValue("INDIA");
        dropdown.selectByIndex(20);
        dropdown.deselectAll();
        driver.close();
    }
}
