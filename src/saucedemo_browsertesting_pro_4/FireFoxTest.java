package saucedemo_browsertesting_pro_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FireFoxTest {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/"; // storing base url
        System.setProperty("webDriver.gecko.driver", "src/drivers/geckodriver.exe"); // setting webdriver
        WebDriver driver = new ChromeDriver(); // creating object of chrome webdriver
        driver.get(baseurl); // method to invoke url

        driver.manage().window().maximize(); // maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// timeout session
        String title = driver.getTitle(); //storing title
        System.out.println("Title of page:" + title); // printing title in console


        String url = driver.getCurrentUrl(); // getting curl
        System.out.println("current Url:" + url);


        driver.findElement(By.name("user-name")).click(); // clicking in login link
        WebElement usernameField = driver.findElement(By.name("user-name")); // storing email field
        usernameField.sendKeys("locked_out_user");// sending keys to email field
        driver.findElement(By.name("password")).click(); // clicking on password field
        WebElement passwordField = driver.findElement(By.name("password")); // storing password field
        passwordField.sendKeys("secret_sauce"); // sending keys to password field


        driver.close(); // closing browser


    }
}
