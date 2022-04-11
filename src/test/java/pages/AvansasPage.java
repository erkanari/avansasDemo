package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AvansasPage {

    public AvansasPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@class='search-input waw-search-input tt-input']")
    public WebElement aramaAlani;

    @FindBy (className = "header-area")
    public WebElement arananUrunYazisi;

    public void arananUrunTikla(String arananUrunKategorisi){
        Driver.getDriver().findElement(By.xpath("//img[@data-name='"+arananUrunKategorisi+"']")).click();
    }

    @FindBy (css = "#select2-sort-container")
    public WebElement akilliSiralamaYazisi;

    @FindBy (xpath = "//*[@class='select2-search__field']")
    public WebElement ismeGoreSiralama;

    public int urunListesi(String urunMarkasi){
        int count = 0;
        List<WebElement> urunList = Driver.getDriver().findElements(By.cssSelector("div[class='product-list']"));
        for (WebElement each: urunList) {
            if(each.getAttribute("data-product-name").contains(urunMarkasi));
            count++;
        }
        return count;
    }

}
