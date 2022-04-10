package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AvansasPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class avansasStepdefinitions {

    WebDriver driver;

    AvansasPage avansasPage=new AvansasPage();

    @Given("avansas sayfasina gidilir")
    public void avansasSayfasinaGidilir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("avansasUrl"));
    }


    @And("arama alanina {string} yazilarak ara butonu tiklanir")
    public void aramaAlaninaYazilarakAraButonuTiklanir(String search) {


        avansasPage.searchBox.sendKeys("kalem"+ Keys.ENTER);

    }

    @And("Kategori listesinden kursun kalemler kategorisi tiklanir")
    public void kategoriListesindenKursunKalemlerKategorisiTiklanir() {

        avansasPage.kursunkalem.click();

    }

    @And("Siralama fonksiyonundan ada göre sirala secilir.")
    public void siralamaFonksiyonundanAdaGöreSiralaSecilir() {

        WebElement dropDown = driver.findElement(By.cssSelector("span[class *= 'select2 select2-container select2-container--default select2-container--below select2-container--open']"));
        dropDown.click();

        WebElement select = driver.findElement(By.cssSelector("li[id $= 'isim-a-z']"));
        select.click();


    }

    @Then("Gelen urun listesinde adinda {string} iceren kac urun oldugu tespit edilir")
    public void gelenUrunListesindeAdindaIcerenKacUrunOlduguTespitEdilir(String arg0) {
    }
}
