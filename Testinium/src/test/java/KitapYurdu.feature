Feature: Test Otomasyonu
  Scenario: Websitesine git ve Test İslemlerini Gerceklestir

    Given Websitesine gidilir
    And Anasayfanın acildigi kontrol edilir
    And Urun arama alanına roman yazılır ve klavyeden enter tusuna basilir
    And Listelenen kitaplar arasinda bir kitap secilir
    And Sepet ekle butonuna basilir
    And Sayfanin sag ust kisminda bulunan sepet ikonundaki deger kontrol edilir
    And Sepetim butonuna tiklanir
    And Sepete git butonuna tiklanir
    And Urun miktari bir adet arttirilir
    And Yenile butonuna basilir
    And Sepetiniz guncelleniyor yazisinin geldigi kontrol edilir
    When Carpi butonuna basilir
    Then Sepetin bos oldugu kontrol edilir
