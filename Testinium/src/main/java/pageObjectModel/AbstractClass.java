package pageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

public class AbstractClass {
    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait =new WebDriverWait(driver,10);

    public void clickFunction(WebElement clickElement) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
        Thread.sleep(2000);
    }
    public void sendKeysFunction(WebElement sendElement, String value) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(sendElement));
        sendElement.sendKeys(value);
        Thread.sleep(2000);
    }
    public void sendKeysAndEnterFunction(WebElement sendElement, String value) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(sendElement));
        sendElement.sendKeys(value);
        sendElement.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void sendKeysAndBeforeValueDeleteFunction(WebElement sendElement, String value) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(sendElement));
        //internetten araştırılıp bulundu!! Daha önce yazılan 1 silindi!!
        sendElement.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        Thread.sleep(500);
        sendElement.sendKeys(value);
        Thread.sleep(2000);
    }

    public void Assetion(WebElement actual, String expected){
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(),expected);
    }
}

