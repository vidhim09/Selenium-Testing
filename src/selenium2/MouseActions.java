package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseActions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        Actions action=new Actions(driver);
        WebElement homeLiving=driver.findElement(By.xpath("//a[@data-reactid='471']"));
        action.moveToElement(homeLiving).perform();
        Thread.sleep(1000);
        action.click(driver.findElement(By.xpath("//a[@data-reactid='534']"))).perform();
        if(driver.getCurrentUrl().contains("clock")){
            System.out.println("Url is correct. URL : "+ driver.getCurrentUrl());
        }
        else{
            System.out.println("Url is not correct. URL : "+ driver.getCurrentUrl());
        }
        driver.close();
    }
}
