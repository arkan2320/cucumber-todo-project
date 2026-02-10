package com.qacart.todo.Base;

import com.qacart.todo.Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class Basepage {

    protected WebDriver driver;
    public Basepage (WebDriver driver){
         this.driver= driver;
     }
     public LoginPage load (String url){
        driver.get(url);
        return new LoginPage(driver);
     }
}
