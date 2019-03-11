package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NavigateToTheNew {
    static void byID() throws InterruptedException {
        System.out.println("By ID");
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tothenew.com/");
        List<WebElement> l = driver.findElements(By.id("h-contact-us"));
        l.get(l.size()-1).click();
        Thread.sleep(1000);
        driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
        byID();
        System.out.println("By Xpath");
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tothenew.com/");
        List<WebElement> l = driver.findElements(By.xpath("//a[@href='/contact-us']"));
        l.get(l.size()-1).click();
        System.out.println("Current Title "+driver.getTitle());
        System.out.println("Current URL "+driver.getCurrentUrl());
        Thread.sleep(1000);
        driver.close();
    }
}
