package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserTabs {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
        Set<String> session = driver.getWindowHandles();
        Iterator<String> it = session.iterator();
        String p = it.next();
        System.out.println(p);
        String c1 = it.next();
        System.out.println(c1);

        driver.switchTo().window(c1);
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//span[text()='Blogs']")).click();
        //driver.close();

    }
}
