package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class LaunchChrome {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver = new ChromeDriver();
//        driver.get("http://www.tothenew.com/");
        driver.navigate().to("file:///home/ttn/Downloads/DemoPage.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("FName")).sendKeys("Vidhi");
        System.out.println(driver.findElement(By.name("Demo")).getAttribute("value"));
        List<org.openqa.selenium.WebElement> l1 = driver.findElements(By.name("Demo"));
        for(int i = 0 ; i < l1.size();i++){
            l1.get(i).sendKeys("Vidhi");
        }
        Thread.sleep(5000);
//        System.out.println(driver.findElements(By.name("Demo")));


        driver.findElements(By.xpath("//a[text()='Great Place to Learn- w3schools']"));
        System.out.println(driver.findElements(By.xpath("//a[text()='Great Place to Learn- w3schools']")));
        List<WebElement> l = driver.findElements(By.xpath("//a[text()='Great Place to Learn- w3schools']"));
        for(int i = 0 ; i < l.size();i++){
            System.out.println(l.get(i).getText());

        }
        l.get(l.size()-1).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandles());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandles());

        driver.close();
        //        System.setProperty("webdriver.gecko.driver","/home/ttn/IdeaProjects/selenium-testing/exe/geckodriver.exe");
        //        WebDriver driver1 = new FirefoxDriver();
        //        driver1.get("http://www.tothenew.com/");
    }
}
