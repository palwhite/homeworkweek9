package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeDrivernopcommerce {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

        WebElement dropdown= driver.findElement(By.id("customerCurrency"));
        dropdown.click();
        dropdown.sendKeys("US Dollar");
        dropdown.click();

        WebElement loginbutton= driver.findElement(By.className("ico-login"));
        loginbutton.click();

        WebElement welcometxt= driver.findElement(By.className("page-title"));
        String message= welcometxt.getText();
        System.out.println(message);

        WebElement emailtxt= driver.findElement(By.name("Email"));
        emailtxt.sendKeys("patel@123.com");

        WebElement passwordtxt= driver.findElement(By.name("Password"));
        passwordtxt.sendKeys("12345678");

        WebElement submitbutton= driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
        submitbutton.click();

        driver.quit();
    }
}
