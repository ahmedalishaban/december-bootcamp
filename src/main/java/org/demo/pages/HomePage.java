package org.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HomePage extends BasePage{

    private final By registerBTN = By.linkText("Register");


    public void clickRegisterBTN(){
        find(registerBTN).click();
    }


}
