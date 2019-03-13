package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameCount {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.londonfreelance.org/courses/frames/index.html");
        System.out.println("Number of frames "+driver.findElements(By.xpath("//frame")).size());
        driver.switchTo().frame("navbar");
        driver.findElement(By.xpath("//a[text()='Sample content']")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("content");
        String expected = "Acid-free paper for the digital age";
        String actual=driver.findElement(By.xpath("//h2")).getText();
        if(expected.equals(actual)){
            System.out.println("The String is "+actual);
        }
        driver.close();
    }
}