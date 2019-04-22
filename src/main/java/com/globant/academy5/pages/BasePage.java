package com.globant.academy5.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public BasePage(WebDriver pDriver) {
        PageFactory.initElements(pDriver, this);
        webDriver = pDriver;
    }

    public void dispose() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
