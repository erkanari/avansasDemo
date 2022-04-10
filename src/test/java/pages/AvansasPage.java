package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AvansasPage {

    public AvansasPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath="//*[@class='search-input waw-search-input tt-input']")
     public WebElement searchBox;

    @FindBy(xpath="//*[@data-id='5']")
    public WebElement kursunkalem;

    @FindBy(id="select2-sort-container")
    public WebElement akilliArama;

    @FindBy(id="select2-sort-result-8yia-isim-a-z")
    public WebElement adaGoreSirala;
}
