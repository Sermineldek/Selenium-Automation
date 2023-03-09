package automationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstStep {
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
        driver.findElement(By.xpath("(//*[@class='btn btn-default'])[2]")).click();
        driver.findElement(By.xpath("//*[@id='id_gender2']")).click();
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Ssermin00", Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='days']")).sendKeys("18", Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='months']")).sendKeys("07", Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='years']")).sendKeys("1995", Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='newsletter']")).click();
        driver.findElement(By.xpath("//*[@id='optin']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("Şermin", Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("Eldek", Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='company']")).sendKeys("XXXXXXX", Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("yyyyyyy, vvvvvvv", Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='country']")).sendKeys("Unit States", Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='state']")).sendKeys("Kaliforniya", Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Florida", Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='zipcode']")).sendKeys("310", Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='mobile_number']")).sendKeys("8888888");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='btn btn-default']")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("btn btn-primary")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()=' Delete Account']")).click();
        driver.findElement(By.className("btn btn-primary")).click();
    }
}
