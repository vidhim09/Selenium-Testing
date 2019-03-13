package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableAuto {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr")).size());
        System.out.println(driver.findElements(By.xpath("//table[@class='dataTable']//th")).size());

        List<WebElement> lr = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
        for (int i = 1 ; i <= lr.size() ; i++){
            List<WebElement> lc = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td"));
            for (int j = 1 ; j <= lc.size() ; j++){
                System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td["+j+"]")).getText());
                System.out.print(" ");
            }
            System.out.println();
        }
//        driver.close();
    }
}
