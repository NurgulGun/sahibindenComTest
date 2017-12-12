package com.sahabt.automation;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginPage extends MainPage {

    @Test
    public void passwordRemember() {
        loginTextTest();
        click(By.linkText("Şifremi Unuttum"));
        sendKey(By.id("usernameOrEmail"), "nurgul.gun@windowslive.com");
        click(By.cssSelector(".forgot-button .btn"));
        click(By.xpath("//*[@id=\"deliveryOptionsForm\"]/ul/li[2]/label"));
        click(By.xpath("//*[@id=\"deliveryOptionsForm\"]/div/button"));
        Assert.assertTrue("FALSE!!", findElement(By.xpath("//*[@id=\"smsVerificationForm\"]/div[1]/div/span/strong")).isEnabled());
    }


}
