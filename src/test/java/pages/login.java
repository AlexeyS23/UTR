package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://order3-dev.utr.ua:5455");
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
        login.sendKeys("test@utr.ua");
        WebElement pass = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
        pass.sendKeys("H2Xw%gPkeF");
        WebElement go = driver.findElement(By.xpath("//button[@class='mat-focus-indicator login-button btn mat-raised-button mat-button-base mat-primary']"));
        go.click();
        Thread.sleep(2000);
        driver.quit();
}}
