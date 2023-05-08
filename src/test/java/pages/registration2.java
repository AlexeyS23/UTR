package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registration2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://order3-dev.utr.ua:5455/ua/login");
        driver.manage().window().maximize();
        WebElement log = driver.findElement(By.xpath("//span[@class='mat-button-wrapper']/strong"));
        log.click();
        WebElement choice2 = driver.findElement(By.cssSelector("span.mat-select-placeholder"));
        choice2.click();
        WebElement entity = driver.findElement(By.cssSelector("[id='mat-option-1']"));
        entity.click();

        WebElement company = driver.findElement(By.xpath("//input[@id='mat-input-7']"));
        company.sendKeys("UTR");
        WebElement surname = driver.findElement(By.xpath("//input[@id='mat-input-8']"));
        surname.sendKeys("secret");
        WebElement name = driver.findElement(By.xpath("//*[@id='mat-input-9']"));
        name.sendKeys("Dmitro");
        WebElement name2 = driver.findElement(By.xpath("//input[@id='mat-input-10']"));
        name2.sendKeys("Dmitrivich");

        WebElement regionSelect = driver.findElement(By.cssSelector("[id='mat-select-value-3']"));
        regionSelect.click();
        driver.findElement(By.cssSelector("[id='mat-option-6']")).click();

        WebElement reg = driver.findElement(By.xpath("//input[@id='mat-input-2']"));
        reg.sendKeys("Днепр");
        WebElement individual = driver.findElement(By.xpath("//input[@id='mat-input-3']"));
        individual.sendKeys("Дмитрий");
        WebElement delivery = driver.findElement(By.xpath("//input[@id='mat-input-4']"));
        delivery.sendKeys("улица Шевченка");
        WebElement tel = driver.findElement(By.xpath("//input[@id='mat-input-5']"));
        tel.sendKeys("0501234567");
        WebElement email = driver.findElement(By.xpath("//input[@id='mat-input-6']"));
        email.sendKeys("test@utr.ua");
        WebElement code = driver.findElement(By.xpath("//input[@id='mat-input-11']"));
        code.sendKeys("999999999999");

        WebElement pdv = driver.findElement(By.xpath("//*[@id='mat-checkbox-3']"));
        boolean isSel = pdv.isSelected();
        if (!isSel) {
            pdv.click();
        }
        WebElement ipn = driver.findElement(By.xpath("//*[@id='mat-input-12']"));
        ipn.sendKeys("999999999");

        WebElement fill = driver.findElement(By.xpath("//*[@id='mat-checkbox-1']"));
        boolean isSele = fill.isSelected();
        if (!isSele) {
            fill.click();
        }

        WebElement egree = driver.findElement(By.xpath("//*[@id='mat-checkbox-2']"));
        boolean isSelect = egree.isSelected();
        if (!isSelect) {
            egree.click();
        }
        WebElement reg_butt = driver.findElement(By.xpath("//button[@class='mat-focus-indicator btn mat-raised-button mat-button-base mat-primary']"));
        reg_butt.click();
        Thread.sleep(2000);


        driver.quit();


    }
}
