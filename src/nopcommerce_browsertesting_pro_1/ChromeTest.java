package nopcommerce_browsertesting_pro_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F/"; // storing base url
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe"); // setting webdriver
        WebDriver driver = new ChromeDriver(); // creating object of chrome webdriver
        driver.get(baseurl); // method to invoke url

        driver.manage().window().maximize(); // maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// timeout session
        String title = driver.getTitle(); //storing title
        System.out.println("Title of page:" + title); // printing title in console


        String url = driver.getCurrentUrl(); // getting curl
        System.out.println("current Url:" + url);


        driver.findElement(By.className("ico-login")).click(); // clicking on loginlink
        WebElement emailIdField = driver.findElement(By.id("Email")); // storing emailfield
        emailIdField.sendKeys("montu89@icloud.com"); // sending keys to email id field
        WebElement passwordField = driver.findElement(By.id("Password")); // storing password field
        passwordField.sendKeys("MAULIk1989"); // send key to password field


        driver.quit(); // closing browser


    }
}
