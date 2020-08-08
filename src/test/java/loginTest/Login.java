package loginTest;


import controller.LoginPage;
import controller.ScriptBase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login extends ScriptBase{

LoginPage LoginPage;

@BeforeTest
    public void beforeTest(){

    init();

}

@Test
    public void verifyInvalidLogin(){
    LoginPage=new LoginPage(driver);
    LoginPage.InvalidSignIn();
}
@AfterTest
    public void closebrowser(){
    driver.close();
    driver.quit();}}



