package herokuapp_browsertesting_pro_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTest {

    public static void main(String[] args) {

        String baseurl = "http://the-internet.herokuapp.com/login"; // storing base url
        System.setProperty("webDriver.gecko.driver", "src/drivers/geckodriver.exe"); // setting webdriver
        WebDriver driver = new ChromeDriver(); // creating object of chrome webdriver
        driver.get(baseurl); // method to invoke url

        driver.manage().window().maximize(); // maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// timeout session
        String title = driver.getTitle(); //storing title
        System.out.println("Title of page:" + title); // printing title in console


        String url = driver.getCurrentUrl(); // getting curl
        System.out.println("current Url:" + url);


        driver.findElement(By.name("username")).click(); // clicking in login link
        WebElement usernameField = driver.findElement(By.name("username")); // storing email field
        usernameField.sendKeys("tomsmith");// sending keys to email field
        driver.findElement(By.name("password")).click(); // clicking on password field
        WebElement passwordField = driver.findElement(By.name("password")); // storing password field
        passwordField.sendKeys("SuperSecretPassword"); // sending keys to password field
        driver.findElement(By.className("radius")).click();


        driver.quit(); // closing browser


    }
}







