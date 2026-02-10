package com.qacart.todo.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {

    private final static ThreadLocal <WebDriver> threadLocal =new ThreadLocal<>() ;

    public static WebDriver initDriver(){
        WebDriver driver  ;
       String browser = System.getProperty("browser" , "edge");

        System.out.println("======================================");
        System.out.println("DEBUG: Browser selected is: '" + browser + "'");
        System.out.println("======================================");

      switch (browser){
          case "edge":
              driver = new EdgeDriver();
           break;
          case "chrome":
              driver = new ChromeDriver();
                break;
          case "firefox":
              driver=new FirefoxDriver();
                break;
          default: throw new RuntimeException("browser are not supported");


      }

        //driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        DriverFactory.threadLocal.set(driver);
        return driver ;

    }
     //إنها بترجعلك نفس المتصفح المفتوح، مش بتفتح واحد جديد.
    public static WebDriver getDriver(){
        return DriverFactory.threadLocal.get();
    }

}
