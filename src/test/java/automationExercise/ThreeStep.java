package automationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class ThreeStep {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");

        driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();
        driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("serminata@gmail.com", Keys.ENTER);
        driver.findElement(By.name("password")).sendKeys("sermin", Keys.ENTER);

    }
}
