package automationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourStep {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");

        driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();
        driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("serminatauni@gmail.com", Keys.ENTER);
        driver.findElement(By.name("password")).sendKeys("Ssermin00", Keys.ENTER);
        driver.findElement(By.xpath("(//*[@class='btn btn-default'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()=' Logout']")).click();

    }
}
