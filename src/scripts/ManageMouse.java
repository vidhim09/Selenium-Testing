package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.beans.PropertyChangeListener;
import java.util.concurrent.TimeUnit;

public class ManageMouse {
    public static void main(String[]args) throws Exception{
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/?ie=UTF8&tag=googinabkkenshoo-21&ascsubtag=_k_EAIaIQobChMIlICUqJr84AIVzg0rCh2HhAZSEAAYASAAEgI2IfD_BwE_k_&gclid=EAIaIQobChMIlICUqJr84AIVzg0rCh2HhAZSEAAYASAAEgI2IfD_BwE");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        Actions action=new Actions(driver);
        WebElement primeElement=driver.findElement(By.id("nav-link-prime"));
        action.moveToElement(primeElement).perform();
        Thread.sleep(1000);
        action.click(driver.findElement(By.id("multiasins-img-link"))).perform();
        System.out.println(driver.findElement(By.id("multiasins-img-link")).isDisplayed());
//        driver.findElement()
//        driver.close();
    }
}
