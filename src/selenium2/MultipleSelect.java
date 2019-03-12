package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MultipleSelect {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement testdropdown = driver.findElement(By.id("multi-select"));
        Select dropdown = new Select(testdropdown);
        System.out.println("Dropdown is Multiple: "+dropdown.isMultiple());
        System.out.println("-----------------------------");
        List<WebElement> l = dropdown.getOptions();
        System.out.println("Select Options");
        for(int i = 0 ; i < l.size() ; i++){
            System.out.println(l.get(i).getText());
        }
        System.out.println("-----------------------------");

        dropdown.selectByValue("New Jersey");
        dropdown.selectByValue("New York");
        dropdown.selectByValue("Texas");

        System.out.println("All Selected Options");
        List<WebElement> l2 = dropdown.getAllSelectedOptions();
        for(int i = 0 ; i < l2.size() ; i++){
            System.out.println(l2.get(i).getText());
        }

        System.out.println("First Selected Option "+ dropdown.getFirstSelectedOption().getText());
        System.out.println("-----------------------------");

        dropdown.deselectAll();
        driver.close();
    }
}
