package TestCalculator;

import PageObjeckt.CalculatePage;
import PageObjeckt.FinalCalculatedPage;
import PageObjeckt.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateTest extends BaseTest {

    MainPage mainPage;
    FinalCalculatedPage finalCalculatedPage;

    CalculatePage calculatePage;


    @Test
    void userCanEnterFirstNumber() {
        mainPage = new MainPage(driver);
        calculatePage = new CalculatePage(driver);
        finalCalculatedPage = new FinalCalculatedPage(driver);
        mainPage.typeFirstField("3");
        mainPage.chooseMinus("minus");
        mainPage.typeSecondField("2");
        calculatePage.clickButtonCalculate();
        String expectedMessage = "Answer : 1";
        String actualMessage = finalCalculatedPage.setFinalAnswer();
        Assertions.assertEquals(expectedMessage, actualMessage, "Calculated dont work");

    }

}

