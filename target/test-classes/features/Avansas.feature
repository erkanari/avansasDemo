@avansas
Feature: TC01_Avansas.com_urun_adedi_sayma

  Scenario: Avansas.com_urun_adedi_sayma

    Given Kullanici avansas.com sayfasina gider.
    And Anasayfada oldugunu verify eder.
    And Ekranin üstündeki arama alanina "kalem" yazar aratir.
    And Gelen sayfada "kalem" icin sonuc bulundugunu verify eder
    And Kategori listesinden "Kurşun Kalemler" kategorisi tiklar.
    And Akilli Siralama yazisina tiklar
    And Gelen urun listesinde adinda "Bic Evolution" iceren kac urun oldugu tespit edilir
    And "Bic Evolution" iceren urun adeti sıfırdan fazla ise test basarilidir, değilse basarisizdir
    Then sayfayi kapatir
