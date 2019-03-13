package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        File f = new File("/home/ttn/IdeaProjects/selenium-testing/src/scripts/xyz.properties");
        FileInputStream fileInputStream = new FileInputStream(f);
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("FName")+" "+ properties.getProperty("LName"));
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("file:///home/ttn/Downloads/DemoPage.html");

    }
}
