package Login;

import RunApp.BasePage;
import RunApp.Setting;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.time.Duration;

public class LoginModel extends BasePage {
    AppiumDriver driver;
    int secondwait = 10;
    public By TxtUsername = By.id("vn.com.vpbs.smartone.test:id/edUserName");
    public By TxtPassword = By.id("vn.com.vpbs.smartone.test:id/edPassword");
    public By BtnLogin = By.id("vn.com.vpbs.smartone.test:id/btn_login");
    public By LblAccount = By.id("vn.com.vpbs.smartone.test:id/tv_account");
    public By LblName = By.id("vn.com.vpbs.smartone.test:id/tv_full_name");
    public By BtnStart = By.id("vn.com.vpbs.smartone.test:id/btnStart");
    public By BtnPermiss = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    public By BtnClosePopup = By.id("vn.com.vpbs.smartone.test:id/btnUpdateSlide");
    public LoginModel(AppiumDriver driver) throws MalformedURLException {
        this.driver = driver;
    }

    public void clickOnButtonStart () {
       choPhanTuXuatHienVaClick(driver,BtnStart);
    }
    public void clickOnButtonPermiss () {
        choPhanTuXuatHienVaClick(driver,BtnPermiss);
    }

    public void clickOnClosePopup () {
        choPhanTuXuatHienVaClick(driver,BtnClosePopup);
    }

    public void fillUsername (String username) {
      nhapTextVaoPhanTu(driver,TxtUsername,username);
    }

    public void fillPassword (String password) {
        nhapTextVaoPhanTu(driver,TxtPassword,password);
    }

    public void clickOnButtonLogin (){
        choPhanTuXuatHienVaClick(driver,BtnLogin);
    }

    public void verifyLoginSuccess(String expaccount, String expname){
        kiemTraPhanTuHienThiCoTrungKetQuaMongMuon(driver,expaccount,LblAccount);
        kiemTraPhanTuHienThiCoTrungKetQuaMongMuon(driver,expname,LblName);
    }

    public  void verifyMessageError (String expmgs){
        kiemTraPhanTuHienThiCoTrungKetQuaMongMuon(driver,expmgs,LblName);
    }

}
