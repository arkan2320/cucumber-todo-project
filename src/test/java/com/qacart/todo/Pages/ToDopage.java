package com.qacart.todo.Pages;

import com.qacart.todo.Base.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToDopage  extends Basepage {
    public ToDopage(WebDriver driver) {
        super(driver);
    }

    private final By WelcomeMessage = By.cssSelector("[data-testid=\"welcome\"]");
    private final By ToDoIcon = By.cssSelector("[data-testid=\"add\"]");
    private final By ToDoItems = By.cssSelector("[data-testid=\"todo-item\"]");

    public boolean isWelcomrmessageDisplayed(){
      return driver.findElement(WelcomeMessage).isDisplayed();
    }
    public void ClickOnplusIcon(){
        driver.findElement(ToDoIcon).click();
    }

    public String GetFirstToDoItem(){
        return driver.findElements(ToDoItems).get(0).getText();
    }


}
