package com.sahabt.automation;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class MainPage extends SahibindenTools {

    @Test
    public void searchTextTest() {
        sendKey(By.id("searchText"),"mac");
        click(By.cssSelector("button"));
        Assert.assertTrue("FALSE!!", findElement(By.cssSelector("#wideContainer>div>div.results-header>h1>strong>b")).getText().contains("mac"));
    }

    @Test
    public void loginTextTest() {
        click(By.className("login-text"));
        closePopUp();
        Assert.assertTrue("FALSE!!", findElement(By.cssSelector(".user-login h3:nth-child(3)")).getText().contains("Üye Girişi"));
    }

    @Test
    public void registerTextTest() {
        click(By.className("register-text"));
        Assert.assertTrue("FALSE!!", findElement(By.cssSelector("h1")).getText().contains("Üye Ol"));
    }
}
