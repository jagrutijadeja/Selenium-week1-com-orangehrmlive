package orange_hrm_homework;
/**
 * Project-2 - ProjectName : com-orangehrmlive
 * BaseUrl = https://opensource-demo.orangehrmlive.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Forgot your password?’ link.
 * 7. Print the current url.
 * 8. Navigate back to the login page.
 * 9. Refresh the page.
 * 10. Enter the email to email field.
 * 11. Enter the password to password field.
 * 12. Click on Login Button.
 * 13. Close the browser.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class ChromeBrowser_OrangeHrm {
    public static void main(String[] args) {
        String BaseURl = "https://opensource-demo.orangehrmlive.com/";

        // 1. Setup chrome browser.
        WebDriver driver = new ChromeDriver();

        //Maximise the Browser window
        driver.manage().window().maximize();

        // 2. Open URL.
        driver.get(BaseURl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //3. Print the title of the page.
        String title = driver.getTitle();
        System.out.println("The title of the page is: " + title);

        //4. Print the current url.
        System.out.println(driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println(driver.getPageSource());

        //6. Click on ‘Forgot your password?’ link.

        driver.findElement(By.className("orangehrm-login-forgot")).click();

        //7. Print the current url.
        System.out.println("Get current URl" + driver.getCurrentUrl());

        //8. Navigate back to the login page.
        driver.navigate().back();

        //9. Refresh the page.
        driver.navigate().refresh();

        //10. Enter the email to email field.
        driver.findElement(By.name("username")).sendKeys("Admin");

        //11. Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("admin123");

        //12. Click on Login Button.
        driver.findElement(By.tagName("button")).click();

        //13. Close the browser.
        driver.quit();
    }
}


