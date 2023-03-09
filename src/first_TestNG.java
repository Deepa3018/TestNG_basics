import org.testng.Assert;
import org.testng.annotations.Test;


public class first_TestNG {
    @Test(priority = 1)
    void evenodd() {
        int num = 4;
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else
            System.out.println("The number is odd");
    }

    @Test (priority = 2)
    void subtraction()
    {
        System.out.println("This is subtraction class");
    }
    @Test(priority = 3)
    void multiplication()
    {
        System.out.println("This is multiplication class");
        Assert.assertEquals(1,1);
    }
}
