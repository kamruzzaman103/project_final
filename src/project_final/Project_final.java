package project_final;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_final {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://studentportal.green.edu.bd/Account/login?ReturnUrl=%2F");
        driver.manage().window().maximize();
        driver.findElement(By.id("Input_LoginId")).sendKeys("201002139");
        Thread.sleep(3000);
        driver.findElement(By.id("Input_Password")).sendKeys("40383844");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"account\"]/div[4]/button")).click();
        String actual = driver.getTitle();
        String expected = "Home page - GUB Student Portal";
        driver.close();
        if (actual.equalsIgnoreCase(expected)) {
            System.out.println("Test Successfull");
        } else {
            System.out.println("Test faile!!");
        }
    }

}
