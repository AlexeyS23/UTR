package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registration {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://order3-dev.utr.ua:5455");
        driver.manage().window().maximize();
        WebElement log = driver.findElement(By.xpath("//span[@class='mat-button-wrapper']/strong"));
        log.click();
        // click on Drop Down
        WebElement choice = driver.findElement(By.cssSelector("span.mat-select-placeholder"));
        choice.click();
        // chose the FOP
        WebElement physical = driver.findElement(By.cssSelector("[id='mat-option-0']"));
        physical.click();

        WebElement surname = driver.findElement(By.xpath("//input[@id='mat-input-7']"));
        surname.sendKeys("secret");
        WebElement name = driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]"));
        name.sendKeys("Serg");
        WebElement name2 = driver.findElement(By.xpath("//input[@id='mat-input-9']"));
        name2.sendKeys("Serg");

        // WebElement region = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/div[2]/app-registration/div/div[2]/div/form/div[2]/div[2]/div[1]/mat-form-field/div/div[1]/div"));
        // region.click();
        WebElement regionSelect = driver.findElement(By.cssSelector("[id='mat-select-value-3']"));
        regionSelect.click();
        driver.findElement(By.cssSelector("[id='mat-option-8']")).click();
        //driver.findElement(By.xpath("//span[text()=' Житомирська обл. ']")).click();
        //driver.findElement(By.xpath("//span[@class='mat-option-text'][text()=' Житомирська обл. ']")).click();
        // driver.findElement(By.xpath("//*[@id=\"mat-option-8\"]/span")).click();
        //слетает лакатор

        Thread.sleep(2000);

        WebElement reg = driver.findElement(By.xpath("//input[@id='mat-input-2']"));
        reg.sendKeys("Житомир");
        WebElement individual = driver.findElement(By.xpath("//input[@id='mat-input-3']"));
        individual.sendKeys("Дмитрий");
        WebElement delivery = driver.findElement(By.xpath("//input[@id='mat-input-4']"));
        delivery.sendKeys("улица Леси Украинки");
        WebElement tel = driver.findElement(By.xpath("//input[@id='mat-input-5']"));
        tel.sendKeys("0501234567");
        WebElement email = driver.findElement(By.xpath("//input[@id='mat-input-6']"));
        email.sendKeys("test@utr.ua");
        WebElement ipn = driver.findElement(By.xpath("//input[@id='mat-input-10']"));
        ipn.sendKeys("1234567890");
        WebElement filling = driver.findElement(By.xpath("//*[@id=\"mat-checkbox-1\"]/label/span[1]"));
        boolean isSel = filling.isSelected();
        if (!isSel) {
            filling.click();
        }
        WebElement agreement = driver.findElement(By.xpath("//*[@id=\"mat-checkbox-2\"]/label/span[1]"));
        boolean isSelc = agreement.isSelected();
        if (!isSelc) {
            agreement.click();
        }
        WebElement reg_but = driver.findElement(By.xpath("//button[@class='mat-focus-indicator btn mat-raised-button mat-button-base mat-primary']"));
        reg_but.click();
        Thread.sleep(4000);


        driver.quit();


    }
}
