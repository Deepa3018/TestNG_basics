import org.testng.annotations.*;

public class TestAnnotations {
  @BeforeClass
void beforeClass(){
    System.out.println("This is executed before every class");
}

    @AfterClass
    void afterClass(){
        System.out.println("This is executed after every class");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("This is executed before every test method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This is executed after every method");
    }
    @Test
    void test1(){
        System.out.println("This is test1 method");
    }
    @Test
    void test2(){
        System.out.println("This is test2 method");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("This is executed before all test");
    }

    @AfterTest
    void afterTest(){
        System.out.println("This is executed after all test");
    }
}
