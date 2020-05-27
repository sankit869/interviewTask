import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Specs extends CommonUtils implements Locators {

    SoftAssert softAssert = new SoftAssert();
    String compName = "Sony Computer";
    String introducedate = "2020-06-01";
    String disconDate = "2020-06-10";
    String compamyName = "Sony";
    String updateIntoduceDate = "2020-06-05";
    String updatedisConDate = "2020-06-15";


    @BeforeMethod
    public void launchbrowerser() {
        launchBrowserAndNavTOSite();
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    @Test(priority = 0)
    public void verifyAddComputer() {
        clickOnElement(addComputer);
        entervalue(computerName, compName);
        entervalue(introduceDate, introducedate);
        entervalue(disdiscontinuedDate, disconDate);
        selectDropDown(company, compamyName);
        clickOnElement(createBtn);
        softAssert.assertEquals(getText(alterMsg), "Done! Computer Sony Computer has been created");
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void verifyUpdateComputer() {
        entervalue(searchBox, compName);
        clickOnElement(searchBtn);
        clickOnElement(createdComputer);
        clearText(introduceDate);
        entervalue(introduceDate, updateIntoduceDate);
        clearText(disdiscontinuedDate);
        entervalue(disdiscontinuedDate, updatedisConDate);
        clickOnElement(updateBtn);
        softAssert.assertEquals(getText(alterMsg), "Done! Computer Sony Computer has been updated");
        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void verifyDeleteComputer() {
        entervalue(searchBox, "Sony Computer");
        clickOnElement(searchBtn);
        clickOnElement(createdComputer);
        clickOnElement(deleteBtn);
        softAssert.assertEquals(getText(alterMsg), "Done! Computer has been deleted");
        softAssert.assertAll();
    }
}

