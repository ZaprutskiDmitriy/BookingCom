package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Absolute Sagrada Familia

public class SearchPage extends BasePage{


    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void searchBySearchString(String searchString){
        driver.findElement(By.name("ss")).sendKeys(searchString);
        driver.findElement(By.cssSelector("button[data-sb-id=main]")).click();
    }




}
