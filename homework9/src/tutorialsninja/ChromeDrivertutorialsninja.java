package tutorialsninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeDrivertutorialsninja {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://tutorialsninja.com/demo/");

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));

        WebElement findpagename= driver.findElement(By.id("logo"));
        String dislaymessage= findpagename.getText();
        System.out.println(dislaymessage);

        WebElement textbox=driver.findElement(By.name("search"));
        textbox.sendKeys("Mobile Phone");

        WebElement inputbutton= driver.findElement(By.className("input-group-btn"));
        inputbutton.click();
        WebElement clicklogo= driver.findElement(By.xpath("//*[@id=\"logo\"]/h1/a"));
        clicklogo.click();


        WebElement link= driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/h4/a"));
        link.click();

        //driver.quit();
    }
}
