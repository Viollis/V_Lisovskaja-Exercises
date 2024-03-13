package PageObjeckt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinalCalculatedPage extends BasePage{
    public FinalCalculatedPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css= "div[class='centered'] p:nth-child(1)")
    private WebElement finalAnswer;

    public String setFinalAnswer (){
        return finalAnswer.getText();
    }

}