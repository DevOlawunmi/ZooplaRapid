package co.uk.zoopla.pages;

import co.uk.zoopla.commons.DriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends DriverLib {

    public Select select;

    public void launchURL(){
        String BASE_URL = "https://www.zoopla.co.uk/";
        driver.navigate().to(BASE_URL);
    }

    public void selectElementByText(WebElement element, String text){
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    public  void selectElementByValue(WebElement element, String value){
        select  = new Select(element);
        select.selectByValue(value);
    }
    public  void selectElementByIndex(WebElement element, int index){
        select  = new Select(element);
        select.selectByIndex(index);
    }
public void waitForElementToBeDisplayed(WebElement element){
    wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOf(element));
}

}
