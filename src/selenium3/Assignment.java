package selenium3;

public class Assignment {
//    Q1- https://www.ultimateqa.com/simple-html-elements-for-automation/
//    Fetch Quality Assurance Engineer Salary from the table under HTML Table with no id.
//    The code should be dynamic.

    public static void question1(){
        System.out.println("Q1- https://www.ultimateqa.com/simple-html-elements-for-automation/");
        System.out.println("Refer TableAutomation.java");
        System.out.println("-----------------------------------------");
    }
//
//    Q2- Write an automation script for filling all fields of the registration page. (Registration.html)
//    But make sure that test data should be provided from a properties file.
//

    public static void question2(){
        System.out.println("Q2- Write an automation script for filling all fields of the registration page. (Registration.html)");
        System.out.println("Refer Register.java");
        System.out.println("-----------------------------------------");
    }
//    Q3- What are the advantages of TestNG & TestNG annotations?
//

    public static void question3(){
        System.out.println("Q3- What are the advantages of TestNG & TestNG annotations?");
        /*
        Advantages of TestNG:

        1) It gives the ability to produce HTML Reports of execution
        2) Annotations are an added advantage in TestNG.
        3) Test cases can be Grouped & Prioritized more easily
        4) Parallel testing is possible
        5) Generates Logs
        6) Data Parameterization is possible

        Benefits of using Annotations:

        1) It identifies the methods it is interested in by looking up annotations. Hence method names are not restricted to any pattern or format.
        2) We can pass additional parameters to annotations.
        3) Annotations are strongly typed, so the compiler will flag any mistakes right away.
        4) Test classes no longer need to extend anything .
        */
        System.out.println("-----------------------------------------");
    }
//    Q4- Print the order of TestNG annotations?

    public static void question4(){
        System.out.println("Q4- Print the order of TestNG annotations?");
        /*
        The order of execution of TestNG annotations are as follows:
            @BeforeSuite
            @BeforeTest
            @BeforeClass
            @BeforeMethod
            @Test
            @AfterMethod
            @AfterClass
            @AfterTest
            @AfterSuite
        */
        System.out.println("-----------------------------------------");
    }

    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
    }
}
