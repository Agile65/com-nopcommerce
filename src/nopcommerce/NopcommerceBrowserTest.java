package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**Project-1 - Project Name: com-nopcommerce
 * BaseUrl = https://demo.nopcommerce.com/login?returnUrl=%2F
 */
public class NopcommerceBrowserTest {
    public static void main(String[] args) {

        String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";

        //  1. Set up the Chrome browser
        WebDriver driver=new ChromeDriver(); // Launch the Chrome Browser

        //  2. Open the URL into Browser
        driver.get(baseUrl);
        // Maximise the Browser
        driver.manage().window().maximize();
        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

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
