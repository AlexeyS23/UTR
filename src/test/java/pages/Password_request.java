package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Password_request {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://order3-dev.utr.ua:5455");
        driver.manage().window().maximize();
        WebElement forget = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/div[2]/app-login/div/div[2]/form/div[3]/div[2]/div[1]/button/span[1]"));
        forget.click();
        WebElement email = driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]"));
        email.sendKeys("test@utr.ua");
        WebElement button = driver.findElement(By.xpath("//button[@class='mat-focus-indicator btn mat-raised-button mat-button-base mat-primary']"));
        button.click();
        Thread.sleep(2000);
        driver.quit();

    }}
