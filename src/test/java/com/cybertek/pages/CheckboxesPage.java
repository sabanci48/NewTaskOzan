package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesPage {

    public CheckboxesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "box1")
    public WebElement checkbox1;

    @FindBy(id = "box2")
    public WebElement checkbox2;



}
