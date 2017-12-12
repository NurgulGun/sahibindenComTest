package com.sahabt.automation;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class SahibindenTools {

    WebDriver driver;

        @Before
        public void setDriver() {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            driver = new ChromeDriver();
            setNavigate();
        }

        @After
        public void quit() {
            driver.quit();
        }

        public void click(By by) {
            findElement(by).click();
        }

        public void TSleep(int sec) throws InterruptedException {
            Thread.sleep(sec);
        }

        public void sendKey(By by, String word) {
            findElement(by).sendKeys(word);
        }

        public String getCurrentUrl() {
            return driver.getCurrentUrl();
        }

        public String getTitle() {
            return driver.getTitle();
        }

        public List<WebElement> findElements(By by) {
            return driver.findElements(by);
        }

        public WebElement findElement(By by) {
            return driver.findElement(by);
        }



        public void setNavigate() {
            driver.navigate().to("https://www.sahibinden.com/");
        }

        public void closePopUp() {
            /*if(driver.switchTo().alert() != null)
            {
                Alert alert = driver.switchTo().alert();
                alert.dismiss(); // alert.accept();

            }*/
            click(By.cssSelector(".qr-login-promotion .close"));
        }

    }

