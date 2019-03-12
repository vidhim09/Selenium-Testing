package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlertPractise {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
        String s =  driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println(s);
//        Thread.sleep(2000);
        driver.close();
    }
}
