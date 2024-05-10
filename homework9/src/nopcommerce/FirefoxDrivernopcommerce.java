package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxDrivernopcommerce {

    public static void main(String[] args) {

        WebDriver driver=new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

        WebElement dropdown= driver.findElement(By.id("customerCurrency"));
        dropdown.click();
        dropdown.sendKeys("US Dollar");
        dropdown.click();

        WebElement loginbutton= driver.findElement(By.className("ico-login"));
        loginbutton.click();

        WebElement registerbutton= driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[1]/div[3]/button"));
        registerbutton.click();

        WebElement regimsg=driver.findElement(By.className("page-title"));
        String msg=regimsg.getText();
        System.out.println(msg);

        driver.quit();
    }
}
