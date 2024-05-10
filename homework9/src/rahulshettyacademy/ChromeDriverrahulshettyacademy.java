package rahulshettyacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeDriverrahulshettyacademy {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement mhoverbutton= driver.findElement(By.id("mousehover"));
        mhoverbutton.click();
        mhoverbutton.sendKeys("Top");

        WebElement dropdownbutton= driver.findElement(By.id("dropdown-class-example"));
        dropdownbutton.click();
        dropdownbutton.sendKeys("Option2");
        dropdownbutton.click();

        WebElement checkboxbutton= driver.findElement(By.id("checkBoxOption2"));
        checkboxbutton.click();

        WebElement opnwindowbtn= driver.findElement(By.id("openwindow"));
        opnwindowbtn.click();

        WebElement inserttxt= driver.findElement(By.id("name"));
        inserttxt.sendKeys("Helloo");

        WebElement confirmbtn= driver.findElement(By.id("confirmbtn"));
        confirmbtn.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

       // driver.quit();
    }
}
