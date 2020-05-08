package OpenBrowser;

import com.google.errorprone.annotations.Var;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindElements {
    @Test
    public void validUserInvalidPassword() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.w3schools.com/html/html_tables.asp");
        wd.manage().window().maximize();
        Thread.sleep(1000);
        List<String> expectededcountry = new ArrayList<>(Arrays.asList("Germany","Mexico","Austria","UK","Canada","Italy"));
        List<String> actualcountry=new ArrayList<>();
        List<WebElement> country = wd.findElements(By.xpath("//*[@id=\'customers\']/tbody/tr/td[3]"));
        System.out.println(country.size());
        for (WebElement name : country) {
            actualcountry.add(name.getText());
            System.out.println(name.getText());
        }
            System.out.println(actualcountry);
              Assert.assertEquals(expectededcountry
                      ,actualcountry);


        }
    }