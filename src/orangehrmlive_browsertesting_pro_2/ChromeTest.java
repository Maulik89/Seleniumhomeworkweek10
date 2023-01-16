package orangehrmlive_browsertesting_pro_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {


            public static void main(String[] args) {
                String baseurl = "https://opensource-demo.orangehrmlive.com/"; // storing base url
                System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe"); //setting webdriver
                WebDriver driver = new ChromeDriver(); // creating object of chrome webdriver
                driver.get(baseurl); // method to invoke url

                driver.manage().window().maximize(); // maximizing window
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // timeout session
                String title = driver.getTitle(); // storing title
                System.out.println("Title of the page:" + title); // printing title in console

                // or
                String url = driver.getCurrentUrl(); //storing url
                System.out.println("current Url: " + url); // printing title in console


                driver.findElement(By.name("username")).click(); // clicking in login link
                WebElement usernameField = driver.findElement(By.name("username")); // storing email field
                usernameField.sendKeys("Admin");// sending keys to email field
                driver.findElement(By.name("password")).click(); // clicking on password field
                WebElement passwordField = driver.findElement(By.name("password")); // storing password field
                passwordField.sendKeys("admin123"); // sending keys to password field

                //driver.quit(); // close browser


            }



        }

