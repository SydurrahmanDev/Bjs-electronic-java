package bjs.electronic.javaaa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BjsElectronic {


    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= driver = new FirefoxDriver();
        driver.get("https://www.bjs.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#page > br-page > header > div > span:nth-child(2) > app-cms-header > div.cms-header > div > div.header-grey-section > app-cms-grey-section > ul > li.sub-menu-cont.h-100 > div:nth-child(4) > li > a")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector( "#page > br-page > header > div > span:nth-child(2) > app-cms-header > div.cms-header > div > div.header-grey-section > app-cms-grey-section > ul > li.sub-menu-cont.h-100 > div:nth-child(4) > div > div:nth-child(2) > a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"page\"]/br-page/header/div/span[2]/app-cms-header/div[2]/div/div[2]/app-cms-grey-section/ul/li[1]/div[4]/div/div[2]/div/div[2]/a")).click();
        Thread.sleep(5000);
























    }






















}
