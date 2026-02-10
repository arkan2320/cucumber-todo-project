package com.qacart.todo.Pages;

import com.qacart.todo.Base.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Basepage {
    public LoginPage( WebDriver driver) {
        super(driver);
    }

    private final By Email = By.id("email");
    private final By password = By.id("password");
    private final By submit = By.id("submit");
    public  void  Login (String mail , String pass){

        driver.findElement(Email).sendKeys(mail);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(submit).click();

    }

}
