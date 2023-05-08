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
        WebElement forget = driver.findElement(By.xpath("(//*[@class='mat-button-wrapper'])[2]"));
        forget.click();
        WebElement email = driver.findElement(By.xpath("//*[@id='mat-input-2']"));
        email.sendKeys("test@utr.ua");
        WebElement button = driver.findElement(By.cssSelector("[type='submit']"));
        button.click();
        Thread.sleep(2000);

        driver.quit();
    }}
