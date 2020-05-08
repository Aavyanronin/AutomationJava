package OpenBrowser;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacdbookFriends {
    WebDriver wd;
    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notificationns");
        wd = new ChromeDriver(options);
        wd.manage().window().maximize();
        wd.navigate().to("https://www.facebook.com");
    }
    @Test
    public void facebooklogAndfriendsCount() throws InterruptedException {
        wd.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("mr_suman@hotmail.com");
        Thread.sleep(1000);
        wd.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("Shrestha12345");
        Thread.sleep(1000);
        wd.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
        Thread.sleep(2000);
        wd.switchTo().alert().accept();
        int expectedFriendsList=1051;
        Thread.sleep(1000);
        wd.findElement(By.xpath("//a[@title='Profile']")).click();
        Thread.sleep(1000);
        wd.findElement(By.xpath("//a[@data-tab-key='friends']"));
        Thread.sleep(1000);



    }
}
