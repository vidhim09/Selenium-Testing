package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Register {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Enter the path of a register.html here
        driver.get("file:///home/ttn/Downloads/Registration.html");
        System.out.println("Q11.  Write an automation script for filling all fields of the registration page. (Registration.html)");

        System.out.println("Validate the Refresh button");
        if(driver.findElement(By.id("submitbtn")).isEnabled()){
            System.out.println("Refresh Disabled");
        }else{
            System.out.println("Refresh Enabled");
        }
        System.out.println("---------------------------------");
        System.out.println("Validate the Gender Radio Button");

        List<WebElement> l = driver.findElements(By.name("radiooptions"));
        if(l.get(0).isSelected() || l.get(1).isSelected()){
            System.out.println("Radio Options Selected");
        }else{
            System.out.println("Radio Not Selected");
        }
        System.out.println("---------------------------------");
        System.out.println("Validate the Header");
        String header = driver.findElement(By.tagName("Header")).getText();
        if(header.equals("Automation Demo Site")){
            System.out.println("The Header is "+header);
        }else{
            System.out.println("The Header is not "+header);
        }
        System.out.println("---------------------------------");
        System.out.println("Validate Title");
        String title = driver.getTitle();
        if(title.equals("Register")){
            System.out.println("Title is "+title);
        }else{
            System.out.println("Title is not "+title);
        }
        System.out.println("---------------------------------");


        System.out.println("Q12. Write an automation script for filling FirstName, LastName & Email address field with the help of name locator. (Registration.html)");
        List<WebElement> list = driver.findElements(By.name("Demo"));
        list.get(0).sendKeys("Vidhi");
        list.get(1).sendKeys("Manglik");
        list.get(2).sendKeys("vidhi.manglik@tothenew.com");
        System.out.println("Done");
        Thread.sleep(3000);
        driver.close();
    }
}
