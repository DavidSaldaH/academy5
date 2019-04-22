package com.globant.academy5.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {

    private WebDriver webDriver;

    public MyDriver(String browser) {
        switch (browser) {
            case "firefox":
                webDriver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "D:\\Proyectos\\ElementosGlobales\\WebDrivers\\chromedriver.exe");
                webDriver = new ChromeDriver();
                break;
        }
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
