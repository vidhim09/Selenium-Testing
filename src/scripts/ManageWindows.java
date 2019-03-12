package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ManageWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/windows");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
        Set<String> session = driver.getWindowHandles();
        Iterator<String> it = session.iterator();
        String p = it.next();
        System.out.println(p);
        String c1 = it.next();
        System.out.println(c1);
        String c2 = it.next();
        System.out.println(c2);

        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
        driver.switchTo().window(c2);
        System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.switchTo().window(c1);
        System.out.println(driver.getCurrentUrl());

//        driver.switchTo().window(p);
//        System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(p);
        System.out.println(driver.getCurrentUrl());
        driver.close();


    }
}
