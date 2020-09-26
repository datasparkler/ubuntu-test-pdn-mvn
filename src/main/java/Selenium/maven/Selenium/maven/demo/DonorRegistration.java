package Selenium.maven.Selenium.maven.demo;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class DonorRegistration {

        public static void main(String[] args) throws IOException, InterruptedException {
                System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
//                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--no-sandbox");

                WebDriver driver = new ChromeDriver(chromeOptions);

                try {
					driver.get("http://pdpd-dev.s3-website.ap-south-1.amazonaws.com/");

					Thread.sleep(1000);

					if (driver.getPageSource().contains("Plasma दो ना")) {
					        System.out.println("Pass");
					} else {
					        System.out.println("Fail");
					}
					
					driver.findElement(By.cssSelector("div:nth-child(2) > .btn")).click();
					{
					  WebElement element = driver.findElement(By.cssSelector("div:nth-child(2) > .btn"));
					  Actions builder = new Actions(driver);
					  builder.moveToElement(element).perform();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
	                driver.quit();					
				}
        }
}