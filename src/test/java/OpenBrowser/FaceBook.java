package OpenBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
    @Test
    public  void Facebooklogin() throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver wd = new ChromeDriver();
        wd.get("http://www.facebook.com");
        wd.manage().window().maximize();
        Thread.sleep(5000);
        wd.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("mr_suman@hotmail.com");
        Thread.sleep(1000);
        wd.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("Shrestha12345");
        Thread.sleep(1000);
        wd.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
        Thread.sleep(30000);
//        wd.switchTo().alert().accept();
        wd.findElement(By.xpath("//*[@id=\'mainContainer\']")).click();
        Thread.sleep(1000);
        wd.findElement(By.xpath("//*[@id=\'u_0_a\']/div[1]/div[1]")).click();

        Thread.sleep(1000);





    }
}
