package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FramePractise {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.londonfreelance.org/courses/frames/index.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().frame("main");
        System.out.println(driver.findElement(By.xpath("//body[@background='top.gif']//h2")).getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame("bot");
        System.out.println(driver.findElement(By.xpath("//h2")).getText());
        driver.close();
    }
}
