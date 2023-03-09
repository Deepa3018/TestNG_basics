import org.testng.annotations.*;

public class TestAnnotations2 {

    @BeforeClass
    void beforeClass() {
        System.out.println("This is executed before every class");
    }

    @AfterClass
    void afterClass() {
        System.out.println("This is executed after every class");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("This is executed before every test method");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("This is executed after every method");
    }

    @Test
    void test3() {
        System.out.println("This is test3 method");
    }

    @Test
    void test4() {
        System.out.println("This is test4 method");
    }

    @BeforeSuite
    void beforeSuite() {
        System.out.println("This executes before Suite");
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("This executes after Suite");
    }
}
