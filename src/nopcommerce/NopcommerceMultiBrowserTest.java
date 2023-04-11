package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class NopcommerceMultiBrowserTest {

    // static variable declaration and assigning values to it

    static String browser="Firefox";
    static String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {

        //  1. Set up the browser
        if(browser.equalsIgnoreCase("Chrome")){
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("FireFox")){
            driver=new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver=new EdgeDriver();
        }else{
            System.out.println("Wrong browser name");
        }

        //  2. Open the URL into Browser
        driver.get(baseUrl);
        // Maximise the Browser
        driver.manage().window().maximize();
        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //  3. Print the title of the page
        System.out.println(driver.getTitle());

        //  4. Print the currant URL
        System.out.println(driver.getCurrentUrl());

        //  5. Print the page source
        System.out.println(driver.getPageSource());

        //  6. Enter the email to email field
        //  Find the email field element
        WebElement emailField= driver.findElement(By.id("Email"));
        //  Type the email address to email field element
        emailField.sendKeys("prime123@gmail.com");

        //  7. Enter the password to password field
        //  Find the password field element
        driver.findElement(By.name("Password")).sendKeys("12345673");

        //  8. Close the browser
        driver.close();
    }
}
