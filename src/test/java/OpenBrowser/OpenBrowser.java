package OpenBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
    @Test
    public void OpenChromeBrowser() throws InterruptedException {
        // System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://www.gmail.com");
        wd.manage().window().maximize();
        Thread.sleep(5000);
       // String email="sshrestha554@gmail.com";
       // WebElement EmailAddress=wd.findElement(By.cssSelector("#identifierId"));
        wd.findElement(By.cssSelector("#identifierId")).sendKeys("qatesting00567@gmail.com");
      //   EmailAddress.sendKeys(email);
            Thread.sleep(1000);
        wd.findElement(By.cssSelector(".RveJvd.snByac")).click();
        Thread.sleep(10000);
       // WebElement password= wd.findElement(By.xpath("//*[@id=\"yDmH0d\"]"));
       // password.sendKeys("Test@123");
        wd.findElement(By.xpath("//*[@id=\'password\']/div[1]/div/div[1]/input")).sendKeys("Test@123");
        Thread.sleep(10000);
        wd.findElement(By.xpath("//*[@id=\'passwordNext\']/span/span")).click();

        Thread.sleep(10000);
        String expectedInbox="inbox";
        WebElement elementInbox=wd.findElement(By.xpath("//a[text()='Inbox']"));
        Assert.assertEquals(expectedInbox,elementInbox.getText());

      //  wd.quit();
    }


    @Test
                public void openFirefoxBrowser() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
        WebDriver wd=new FirefoxDriver();
        wd.get("http://www.gmail.com");
        wd.manage().window().maximize();
        Thread.sleep(5000);
       // String email="sshrestha554@gmail.com";
      // WebElement EmailAddress=wd.findElement(By.xpath("//*[@id=\'identifierId\']"));
       // EmailAddress.sendKeys(email);
        Thread.sleep(1000);
       // wd.findElement(By.cssSelector(".RveJvd.snByac")).click();
        wd.quit();
    }
    @Test
    public void validUserInvalidPassword() throws InterruptedException {
        // System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://www.gmail.com");
        wd.manage().window().maximize();
        Thread.sleep(5000);
        wd.findElement(By.cssSelector("#identifierId")).sendKeys("qatesting00567@gmail.com");
        Thread.sleep(1000);
        wd.findElement(By.cssSelector(".RveJvd.snByac")).click();
        Thread.sleep(10000);
        wd.findElement(By.xpath("//*[@id=\'password\']/div[1]/div/div[1]/input")).sendKeys("test234");
        Thread.sleep(10000);
        wd.findElement(By.xpath("//*[@id=\'passwordNext\']/span/span")).click();
        Thread.sleep(10000);
        String expectedInbox="Wrong password. Try again or click Forgot password to reset it.";
        WebElement elementInbox=wd.findElement(By.xpath("//span[text()='Wrong password. Try again or click Forgot password to reset it.']"));
        Assert.assertEquals(expectedInbox,elementInbox.getText());





}}
