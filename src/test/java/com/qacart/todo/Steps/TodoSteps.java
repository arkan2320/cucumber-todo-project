package com.qacart.todo.Steps;

import Utils.configration.EnvUtil;
import com.qacart.todo.Factory.DriverFactory;
import com.qacart.todo.Pages.LoginPage;
import com.qacart.todo.Pages.NewToDoPage;
import com.qacart.todo.Pages.ToDopage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;

public class TodoSteps {
    WebDriver driver ;
    @Given("user is on todo page")
    public void UserIsOnTodoPage() throws IOException {

        driver = DriverFactory.getDriver();

        EnvUtil.getInstance();
        new LoginPage(driver).load(EnvUtil.getProperty("url")+"/login")
                .Login(EnvUtil.getProperty("email"),
                        EnvUtil.getProperty("password"));


    }


    @When("user click on plus icon and add new item")
    public void UserClickOnPlusIconAndAddNewItem() {
        new ToDopage(driver).ClickOnplusIcon();
         new NewToDoPage(driver).addtxttodo("hello world");



    }


    @Then("new item should be added to the list")
    public void NewItemShouldBeAddedToTheList() {
       String txt = new ToDopage(driver).GetFirstToDoItem();
        Assert.assertEquals(txt,"hello world");
         //DriverFactory.getDriver().quit();

    }


}
