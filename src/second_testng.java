import org.testng.annotations.Test;

@Test
public class second_testng {
    @Test(priority = 1)
    void method1()
    {
        System.out.println("This is method1 class");
    }
    @Test (priority = 2)
    void method2()
    {
        System.out.println("This is method2 class");
    }
    @Test(priority = 3)
    void method3()
    {
        System.out.println("This is method3 class");
    }
}
