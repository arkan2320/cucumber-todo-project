package com.qacart.todo.Pages;

import com.qacart.todo.Base.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewToDoPage extends Basepage {
    public NewToDoPage(WebDriver driver) {
        super(driver);
    }


    private final By TDinput  = By.cssSelector("input[data-testid=\"new-todo\"]");
    private final By AddBtn = By.cssSelector("button[data-testid=\"submit-newTask\"]");

    public void addtxttodo(String todotxt){
        driver.findElement(TDinput).sendKeys(todotxt);
        driver.findElement(AddBtn).click();
    }
}
