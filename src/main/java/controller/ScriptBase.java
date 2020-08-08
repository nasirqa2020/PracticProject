package controller;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScriptBase {
    public WebDriver driver;

//@Test
    public void init(){

    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
    driver=new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");

}
}

