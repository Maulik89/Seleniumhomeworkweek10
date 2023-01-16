package utimateqa_browsertesing_pro_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultibrowsingTest {
    static String browser = "Chrome";
    static String baseURL = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webDriver.chrome.driver", "src/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webDriver.gecko.driver", "src/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webDriver.edge.driver", "src/drivers/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
        } else {
            System.out.println("not valid browser ");
        }

        driver.get(baseURL); // method to invoke url
        driver.manage().window().maximize(); // maximizing windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // timeout session

        String title = driver.getTitle(); // storing title
        System.out.println("Title of the page :" + title); // printing title in console

        // or

        String url = driver.getCurrentUrl(); // storing title
        System.out.println("current Url :" + url); // printing title in console

        driver.findElement(By.name("user[email]")).click(); // clicking in login link
        WebElement usernameField = driver.findElement(By.name("user[email]")); // storing email field
        usernameField.sendKeys("tomsmith");// sending keys to email field
        driver.findElement(By.name("user[password]")).click(); // clicking on password field
        WebElement passwordField = driver.findElement(By.name("user[password]")); // storing password field
        passwordField.sendKeys("SuperSecretPassword"); // sending keys to password field
        driver.close();// close browser

    }
}

