package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage{

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public String getNameResultOfSearching(){
        return driver.findElement(By.xpath("(//div[@data-testid='title'])[1]")).getText();
    }

    public String getRatingResultOfSearching(){
        return driver.findElement(By.xpath("(//div[@data-testid='review-score'])[1]/div")).getText();
    }

}
