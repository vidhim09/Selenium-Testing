package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ultimateqa.com/simple-html-elements-for-automation/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String s = "Quality Assurance Engineer";
        List<WebElement> tr = driver.findElements(By.xpath("//h2[text()='HTML Table with no id']/following-sibling::table/tbody/tr"));

        for(int i = 2 ; i <= tr.size() ; i++ ){
//            System.out.println(driver.findElements(By.xpath("//h2[text()='HTML Table with no id']/following-sibling::table/tbody/tr["+i+"]/td")).size());
            List<WebElement> td = driver.findElements(By.xpath("//h2[text()='HTML Table with no id']/following-sibling::table/tbody/tr["+i+"]/td"));
            if(td.get(0).getText().equals(s)){
                System.out.println("Salary of "+td.get(0).getText()+" is "+td.get(2).getText());
            }
        }
        driver.close();
    }
}
