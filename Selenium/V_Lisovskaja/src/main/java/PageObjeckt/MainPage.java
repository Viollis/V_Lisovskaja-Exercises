package PageObjeckt;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#number1")
    private WebElement searchFirstField;

    @FindBy(css = "#function")
    private WebElement searchDropDown;

    @FindBy(css = "#number2")
    private WebElement searchSecondField;


    public void typeFirstField(String text) {
        searchFirstField.sendKeys(text);
    }

    public void chooseMinus(String minus) {
        Select dropdown = new Select(searchDropDown);
        dropdown.selectByVisibleText(minus);
    }

    public void typeSecondField(String text) {
        searchSecondField.sendKeys(text);
    }
}
