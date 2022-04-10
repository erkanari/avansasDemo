Feature: US001 avansas search


  @avansas


Scenario: TC01 avansas search testi


    Given avansas sayfasina gidilir
    And arama alanina "kalem" yazilarak ara butonu tiklanir
    And Kategori listesinden kursun kalemler kategorisi tiklanir
    And Siralama fonksiyonundan ada göre sirala secilir.
    Then Gelen urun listesinde adinda "Bic Evolution" iceren kac urun oldugu tespit edilir