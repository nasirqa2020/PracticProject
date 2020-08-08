package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement signinbutton;
@FindBy(name = "email")
    WebElement email;
@FindBy(name = "passwd")
    WebElement passwd;
@FindBy(css = "#SubmitLogin > span")
    WebElement Signinbuttonlogin;
public LoginPage(WebDriver driver){
    PageFactory.initElements(driver,this);

}
public void InvalidSignIn(){

    signinbutton.click();
    email.sendKeys("foyezali@gmail.com");
    passwd.sendKeys("12345xyz");
    Signinbuttonlogin.click();
}


    }


