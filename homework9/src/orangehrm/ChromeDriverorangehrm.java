package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverorangehrm {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement usernametxt= driver.findElement(By.tagName("input"));
//        String usrtxt= usernametxt.getText();
//        System.out.println(usrtxt);
    }
}
