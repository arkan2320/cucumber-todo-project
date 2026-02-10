package com.qacart.todo.Steps;

import Utils.configration.EnvUtil;
import com.qacart.todo.Factory.DriverFactory;
import com.qacart.todo.Pages.LoginPage;
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

public class UserSteps {
    WebDriver driver ;


@Given("user is on login page")
    public void UserIsOnLoginPage() throws IOException {
    //driver = new DriverFactory().initDriver();
    driver = DriverFactory.getDriver();
    EnvUtil.getInstance();
    new LoginPage(driver).load(EnvUtil.getProperty("url") +"/login");
  }

    /*
     * 🔐 خطوة تسجيل الدخول (Login Step)
     * ---------------------------------------------------------
     * 1️⃣ @When: السطر ده بيربط جملة الـ Gherkin اللي في ملف الـ feature بالكود ده.
     *
     * 2️⃣ new LoginPage(driver):
     * - بنعمل Object من صفحة اللوجن (POM) عشان نقدر نستخدم الدوال اللي جواها.
     *
     * 3️⃣ EnvUtil.getInstance().getProperty(...):
     * - هنا السحر! 🎩 بننادي على "المدير" (Singleton) عشان يفتح "الخزنة" (Properties File).
     * - وبنجيب منها الـ email والـ password اللي إحنا كاتبينهم في ملف Staging.properties.
     * - ده بيخلينا منكتبش بيانات حساسة جوه الكود مباشرة (No Hardcoding) ✅.
     *
     * 4️⃣ .Login(...): دي الدالة اللي بتكتب البيانات وتدوس على زرار الدخول.
     * ---------------------------------------------------------
     */

@When("user enter valid user and pass")
public void UserEnerValidUserAndPass() throws IOException {
    new LoginPage(driver)
            .Login(
            EnvUtil.getInstance().getProperty("email"),
            EnvUtil.getInstance().getProperty("password")
            );
}

@Then("Welcome message should be displayed")
    public void WelcomeMessageShouldBeDisplayed(){
    boolean WelcomeMessage = new ToDopage(driver).isWelcomrmessageDisplayed();
    Assert.assertTrue(WelcomeMessage);
    //driver.quit();
    //DriverFactory.getDriver().quit();

}



}
