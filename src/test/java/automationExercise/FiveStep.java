package automationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FiveStep {
    public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://automationexercise.com/");

            driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Şermin", Keys.ENTER);
            driver.findElement(By.xpath("(//*[@name='email'])[2]")).sendKeys("serminatauni@gmail.com", Keys.ENTER);
            Thread.sleep(3000);

    }
}
