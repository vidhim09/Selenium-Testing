package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Register {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/ttn/Downloads/Registration.html");

        Properties properties = new Properties();
        File f = new File("/home/ttn/IdeaProjects/selenium-testing/src/selenium3/xyz.properties");
        FileInputStream fileInputStream = new FileInputStream(f);
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("FName")+" "+ properties.getProperty("LName"));

        driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys(properties.getProperty("FName"));
        driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys(properties.getProperty("LName"));
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(properties.getProperty("Address"));
        driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(properties.getProperty("Email"));
        driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(properties.getProperty("Phone"));
        List<WebElement> gender = driver.findElements(By.name("radiooptions"));

        for (int i = 0 ; i < gender.size() ; i++){
            if(gender.get(i).getAttribute("value").equals(properties.getProperty("Gender"))){
                gender.get(i).click();
            }
        }

        String[] hobbylist = properties.getProperty("Hobby").split(",");
        List<WebElement> hobby = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (int i = 0 ; i < hobby.size() ; i++){
            if(hobby.get(i).getAttribute("value").equals(hobbylist[0]) || hobby.get(i).getAttribute("value").equals(hobbylist[1]) ){
                hobby.get(i).click();
            }
        }

        driver.findElement(By.id("firstpassword")).sendKeys(properties.getProperty("Password"));
        driver.findElement(By.id("secondpassword")).sendKeys(properties.getProperty("Password"));

    }
}
