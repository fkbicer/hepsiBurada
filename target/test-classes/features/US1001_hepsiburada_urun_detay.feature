Feature: US1001_hepsiburada_urun_detay

  Background:
    Given Kullanici hepsiburada sitesini ziyaret eder
    And Kullanici "iphone" urununu aratir
    And Kullanici arama sonucu gelen urun listesinden urun secer ve urun detay sayfasina gider
    And Kullanici secilen urun icin urun detayda degerlendirmeler tabina gider

  @hepsiburada1
  Scenario: TC2.1_hepsiburada_urun_detay_ve_degerlendirme_testi
    And Kullanici gelen degerlendirmeler tabinda hic degerlendirme yok ise eylem gerceklestirmez
    And Kullanici gelen degerlendirmeler icerisinde ilk degerlendirmenin Evet butonuna tiklar
    Then Kullanici tesekkurler yazisini gorur

  @hepsiburada2
  Scenario: TC2.2_hepsiburada_dropdown_detay
    And Kullanici sirala dropbox'ina tiklar
    Then En yeni değerlendirme, En faydalı değerlendirme, Puana göre azalan, Puana göre artan değerlerinin geldiği assert edilir.


