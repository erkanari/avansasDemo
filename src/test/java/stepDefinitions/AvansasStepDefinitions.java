package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AvansasPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AvansasStepDefinitions {

    AvansasPage avansasPage = new AvansasPage();

    @Given("Kullanici avansas.com sayfasina gider.")
    public void kullaniciAvansasComSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("avansas.com_url"));
    }

    @And("Anasayfada oldugunu verify eder.")
    public void anasayfadaOldugunuVerifyEder() {
        String sayfaUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(sayfaUrl.equals(ConfigReader.getProperty("avansas.com_url")));
    }

    @And("Ekranin üstündeki arama alanina {string} yazar aratir.")
    public void ekraninÜstündekiAramaAlaninaYazarAratir(String arananUrun) {
        avansasPage.aramaAlani.sendKeys(arananUrun, Keys.ENTER);
    }

    @And("Gelen sayfada {string} icin sonuc bulundugunu verify eder")
    public void gelenSayfadaIcinSonucBulundugunuVerifyEder(String arananUrun) {
        avansasPage.arananUrunYazisi.isDisplayed();
    }

    @And("Kategori listesinden {string} kategorisi tiklar.")
    public void kategoriListesindenKategorisiTiklar(String arananUrunKategorisi) {
        avansasPage.arananUrunTikla(arananUrunKategorisi);
    }

    @And("Akilli Siralama yazisina tiklar")
    public void akilliSiralamaYazisinaTiklar() {

        avansasPage.akilliSiralamaYazisi.click();
        avansasPage.ismeGoreSiralama.sendKeys("İsme göre [A-Z]"+Keys.ENTER);
    }



    @And("Gelen urun listesinde adinda {string} iceren kac urun oldugu tespit edilir")
    public void gelenUrunListesindeAdindaIcerenKacUrunOlduguTespitEdilir(String urunMarkasi) {
        avansasPage.urunListesi(urunMarkasi);
    }

    @And("{string} iceren urun adeti sıfırdan fazla ise test basarilidir, değilse basarisizdir")
    public void icerenUrunAdetiSıfırdanFazlaIseTestBasarilidirDeğilseBasarisizdir(String urunMarkasi) {
        Assert.assertTrue("Test basarisizdir.",avansasPage.urunListesi(urunMarkasi) > 0);
    }

    @Then("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }


}
