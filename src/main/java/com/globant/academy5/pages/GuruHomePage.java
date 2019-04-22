package com.globant.academy5.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GuruHomePage extends BasePage {

    public GuruHomePage(WebDriver pDriver) {
        super(pDriver);
        pDriver.get("http://demo.guru99.com/test/delete_customer.php");
    }

    @FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td[2]/input")
    private WebElement idCustomer;

    @FindBy(xpath = "/html/body/form/table/tbody/tr[1]/td")
    private WebElement title;

    @FindBy(xpath = "/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
    private WebElement btnSubmit;

    public boolean prueba() {
        idCustomer.sendKeys("1039466613");
        getWait().until(ExpectedConditions.elementToBeClickable(btnSubmit));
        btnSubmit.click();

        return true;
    }


}
