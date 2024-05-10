package rahulshettyacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgrDriverrahulshettyacademy {

    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement dropdownbutton= driver.findElement(By.id("dropdown-class-example"));
        dropdownbutton.click();
        dropdownbutton.sendKeys("Option3");
        dropdownbutton.click();

        WebElement checkboxbutton= driver.findElement(By.id("checkBoxOption3"));
        checkboxbutton.click();

        WebElement opnwindowbtn= driver.findElement(By.id("openwindow"));
        opnwindowbtn.click();

        WebElement inserttxt= driver.findElement(By.id("name"));
        inserttxt.sendKeys("Admin");

//        WebElement confirmbtn= driver.findElement(By.id("confirmbtn"));
//        confirmbtn.click();

        WebElement mhoverbutton= driver.findElement(By.id("mousehover"));
        mhoverbutton.click();
        mhoverbutton.sendKeys("Top");

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        //driver.quit();
    }
}
