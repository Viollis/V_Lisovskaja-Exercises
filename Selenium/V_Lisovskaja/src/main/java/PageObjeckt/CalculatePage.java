package PageObjeckt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatePage extends BasePage {

    @FindBy(css = "#calculate")
    private WebElement buttonCalculate;

    public CalculatePage(WebDriver driver) {
        super(driver);
    }

    public void clickButtonCalculate(){buttonCalculate.click();}

}



