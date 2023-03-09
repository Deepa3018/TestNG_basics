import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BothCorrect {
    public class Bothcorrect {
        @Test
        public void login_bothcorrect() throws InterruptedException
        {
            System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

            ChromeDriver driver = new ChromeDriver();

            driver.get("https://www.facebook.com/login.php/");


            WebElement email = driver.findElement(By.id("email"));
            WebElement password = driver.findElement(By.name("pass"));
            email.sendKeys("magishek21@gmail.com");
            Thread.sleep(2000);
            password.sendKeys("Dhevaa@3018");
            Thread.sleep(2000);
            WebElement login = driver.findElement(By.id("loginbutton"));
            login.click();
            //driver.close();

        }


    }

}
