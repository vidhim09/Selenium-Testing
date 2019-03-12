package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FrameAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Q4.

        driver.switchTo().frame("SingleFrame");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Vidhi");

        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Vidhi");

        //Q5 Total number of frames

        driver.switchTo().defaultContent();
        System.out.println("Number of iframes "+driver.findElements(By.xpath("//iframe")).size());

        driver.close();

    }
}
