package co.uk.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy (id = "search-input-location")
    private WebElement searchField;
    @FindBy (id = "forsale_price_min")
    private WebElement minPrice;
    @FindBy(id = "forsale_price_max")
    private WebElement maxPrice;
    @FindBy (id = "property_type")
    private WebElement propertyType;
    @FindBy (id = "beds_min")
    private WebElement noOfBeds;
    @FindBy(id = "search-submit")
    private WebElement searchButton;
    @FindBy (xpath = "//*[@id=\"cookie-consent-form\"]/div/div/div/button[2]")
    private WebElement acceptCookies;
    @FindBy (className = "ui-cookie-consent-main")
    private WebElement cookiePage;

    public void enterLocation(String location){
        waitForElementToBeDisplayed(searchField);
        searchField.clear();
        searchField.sendKeys(location);
    }
    public void selectMinimumPrice(String miniPrice){
        selectElementByText(minPrice, miniPrice);
    }
    public void selectMaximumPrice(String maxiPrice){
        selectElementByText(maxPrice,maxiPrice);}

        public void selectPropertyType(String property){
        selectElementByText(propertyType, property);
        }
        public void selectNoOfBeds(String beds){
        selectElementByText(noOfBeds, beds);
        }

        public void waitForCookiePage(){
        cookiePage.isDisplayed();
        }
        public void acceptCookies(){
                acceptCookies.click();
        }
        public SearchResultPage clickOnSearchButton(){
        searchButton.click();
        return new SearchResultPage(driver);
        }
}
