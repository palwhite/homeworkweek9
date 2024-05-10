package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeDriverautomationpractice {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://practice-automation.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));

        WebElement wlcmmsg= driver.findElement(By.className("wp-block-heading"));
        String wlcmmsgprint=wlcmmsg.getText();
        System.out.println(wlcmmsgprint);

        WebElement formfieldbtn= driver.findElement(By.xpath("//*[@id=\"post-36\"]/div/div[2]/div/div[2]/div[1]/div/a"));
        formfieldbtn.click();

        WebElement namefield= driver.findElement(By.id("name"));
        namefield.sendKeys("Nirali");

        WebElement drinklbl= driver.findElement(By.id("drink3"));
        drinklbl.click();

        WebElement radiobtn= driver.findElement(By.id("color2"));
        radiobtn.sendKeys("Blue");

        WebElement siblingdrop= driver.findElement(By.id("siblings"));
        siblingdrop.sendKeys("Yes");

        WebElement emailtxt= driver.findElement(By.name("email"));
        emailtxt.sendKeys("nirali@gmail.com");

        WebElement writemessage= driver.findElement(By.id("message"));
        writemessage.sendKeys("Hello, Again!!Hope to see you soon.");

        WebElement submitbtn= driver.findElement(By.id("submit-btn"));
        submitbtn.click();
    }
}
