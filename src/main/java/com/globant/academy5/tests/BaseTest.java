package com.globant.academy5.tests;

import com.globant.academy5.drivers.MyDriver;
import com.globant.academy5.pages.GuruHomePage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {

    MyDriver driver;
    private GuruHomePage homePage;

    @BeforeSuite(alwaysRun = true)
    @Parameters({"browser"})
    public void beforeSuite(String browser){
        driver = new MyDriver(browser);
        homePage = new GuruHomePage(driver.getWebDriver());
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite(){
        homePage.dispose();
    }

    public GuruHomePage getHomePage() {
        return homePage;
    }
}
