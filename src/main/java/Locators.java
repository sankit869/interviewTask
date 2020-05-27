import org.openqa.selenium.By;

public interface Locators {
    By addComputer = By.id("add");
    By computerName = By.id("name");
    By introduceDate = By.id("introduced");
    By disdiscontinuedDate = By.id("discontinued");
    By company = By.id("company");
    By createBtn = By.cssSelector("[value='Create this computer']");
    By alterMsg = By.cssSelector(".alert-message");
    By searchBox = By.id("searchbox");
    By searchBtn = By.id("searchsubmit");
    By createdComputer = By.linkText("Sony Computer");
    By deleteBtn = By.cssSelector("[value='Delete this computer']");
    By updateBtn = By.cssSelector("[value='Save this computer']");
}
