package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LaunchFirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/home/ttn/IdeaProjects/selenium-testing/exe/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
        String s =  driver.switchTo().alert().getText();
        System.out.println("Alert Box Content "+s);
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
        System.out.println("Alert Box Content "+driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        driver.switchTo().alert().sendKeys("Vidhi");
        System.out.println("Box Content "+driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        driver.close();
    }
}
