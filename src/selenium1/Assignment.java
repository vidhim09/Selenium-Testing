package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment {


//    Q1. Write a script to open the Firefox browser and open https://www.google.com/ URL.
    static void question1() throws InterruptedException {
        System.out.println("Q1. Write a script to open the Firefox browser and open https://www.google.com/ URL.");
        System.setProperty("webdriver.gecko.driver","/home/ttn/IdeaProjects/selenium-testing/exe/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(1000);
        driver.close();
        System.out.println("---------------------------------------------");
    }
//
//    Q2. Write a script launch the Google Chrome browser and open https://www.google.com/ URL.
//
    static void question2() throws InterruptedException {
        System.out.println("Q2. Write a script launch the Google Chrome browser and open https://www.google.com/ URL.");
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/selenium-testing/exe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        driver.close();
        System.out.println("---------------------------------------------");
    }
//    Write the following scripts in any of your desired browsers-
//
//    Q3: Write a script to search the “To The New” string in google.
//
    static void question3() throws InterruptedException {
        System.out.println("Q3. Write a script to search the “To The New” string in google.");
        System.out.println("Refer SearchToTheNew.java in same package");
        System.out.println("---------------------------------------------");
    }
//    Q4: Write a script to open http://www.tothenew.com/  and then navigate to the contact us page using 1) XPath 2) ID

    static void question4(){
        System.out.println("Q4. Write a script to open http://www.tothenew.com/  and then navigate to the contact us page using 1) XPath 2) ID");
        System.out.println("Refer NavigateToTheNew.java in same package");
        System.out.println("---------------------------------------------");
    }
//    Q5. Write a script to get the title of the “Contact Us” page.

    static void question5(){
        System.out.println("Q5. Write a script to get the title of the 'Contact Us' page.");
        System.out.println("Refer NavigateToTheNew.java in same package");
        System.out.println("---------------------------------------------");
    }
//    Q6.  Write a script to get the url of the "Contact Us' page.

    static void question6(){
        System.out.println("Q6.  Write a script to get the url of the 'Contact Us' page.");
        System.out.println("Refer NavigateToTheNew.java in same package");
        System.out.println("---------------------------------------------");
    }
//    Q7: Write the disadvantages of selenium.

    static void question7(){
        System.out.println("Q7. Write the disadvantages of selenium.");
        System.out.println("---------------------------------------------");
    }
//    Q8: Difference between get() & navigate() method

    static void question8(){
        System.out.println("Q8. Difference between get() & navigate() method");
        System.out.println("---------------------------------------------");
    }
//    Q9. What is the difference between Selenium RC & Selenium WebDriver.

    static void question9(){
        System.out.println("Q9. What is the difference between Selenium RC & Selenium WebDriver.");
        System.out.println("---------------------------------------------");
    }
//    Q10. What are locators & types of locators in selenium

    static void question10(){
        System.out.println("Q10. What are locators & types of locators in selenium");
        System.out.println("---------------------------------------------");
    }
//    Q11.  Write an automation script for filling all fields of the registration page. (Registration.html)
//
//    a- Validate that Refresh button is disabled.
//
//    b- Validate that your respective gender is selected or not.
//
//    c- Validate that header of the registration page is Automation Demo Site.
//
//    d- Validate that title of the page is Register.

    static void question11(){
        System.out.println("Q11.  Write an automation script for filling all fields of the registration page. (Registration.html)");
        System.out.println("Refer Register.java in same package");
        System.out.println("---------------------------------------------");
    }
//    Q12. Write an automation script for filling FirstName, LastName & Email address field with the help of name locator. (Registration.html)

    static void question12(){
        System.out.println("Q12. Write an automation script for filling FirstName, LastName & Email address field with the help of name locator. (Registration.html)");
        System.out.println("Refer Register.java in same package");
        System.out.println("---------------------------------------------");
    }


    public static void main(String[] args) throws InterruptedException {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
        question11();
        question12();

    }
}
