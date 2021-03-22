package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.HepsiburadaPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class HepsiburadaStepDefinitions {
    HepsiburadaPage hepsiburadaPage = new HepsiburadaPage();

        @Given("Kullanici hepsiburada sitesini ziyaret eder")
    public void kullanici_hepsiburada_sitesini_ziyaret_eder() {
        Driver.getDriver().get(ConfigReader.getProperty("hepsiburada_url"));
    }


        @Given("Kullanici {string} urununu aratir")
    public void kullanici_urununu_aratir(String string) {
        hepsiburadaPage.searchbox.sendKeys(string+ Keys.ENTER);
        }

        @Given("Kullanici arama sonucu gelen urun listesinden urun secer ve urun detay sayfasina gider")
    public void kullanici_arama_sonucu_gelen_urun_listesinden_urun_secer_ve_urun_detay_sayfasina_gider() {
            hepsiburadaPage.ilkIphoneUrunu.click();
        }


        @Given("Kullanici secilen urun icin urun detayda degerlendirmeler tabina gider")
    public void kullanici_secilen_urun_icin_urun_detayda_degerlendirmeler_tabina_gider() {
            hepsiburadaPage.degerlendirmelerButonu.click();
        }


        @Given("Kullanici gelen degerlendirmeler tabinda hic degerlendirme yok ise eylem gerceklestirmez")
    public void kullanici_gelen_degerlendirmeler_tabinda_hic_degerlendirme_yok_ise_eylem_gerceklestirmez() {
           if(hepsiburadaPage.degerlendirmelerButonu.getText().equals("Değerlendirmeler (0)")){
               Driver.closeDriver();
           }
         }

         @Given("Kullanici gelen degerlendirmeler icerisinde ilk degerlendirmenin Evet butonuna tiklar")
    public void kullanici_gelen_degerlendirmeler_icerisinde_ilk_degerlendirmenin_evet_butonuna_tiklar() {
        hepsiburadaPage.likeButton.click();
    }


          @Then("Kullanici tesekkurler yazisini gorur")
    public void kullanici_tesekkurler_yazisini_gorur() {
            String expectedtskYazi= "Teşekkür Ederiz.";
              Assert.assertEquals(expectedtskYazi,hepsiburadaPage.tesekkurlerYazisi.getText());

    }
    @Given("Kullanici sirala dropbox'ina tiklar")
    public void kullanici_sirala_dropbox_ina_tiklar() {
            hepsiburadaPage.dropdownBox.click();
    }

    @Then("En yeni değerlendirme, En faydalı değerlendirme, Puana göre azalan, Puana göre artan değerlerinin geldiği assert edilir.")
    public void en_yeni_değerlendirme_en_faydalı_değerlendirme_puana_göre_azalan_puana_göre_artan_değerlerinin_geldiği_assert_edilir() {
    List<String> actualList = new ArrayList<>();
    actualList.add(hepsiburadaPage.enYeniDegerlendirme.getText());
    actualList.add(hepsiburadaPage.enFaydaliDegerlendirme.getText());
    actualList.add(hepsiburadaPage.puanaGoreArtan.getText());
    actualList.add(hepsiburadaPage.puanaGoreAzalana.getText());

    List<String> expectedList = new ArrayList<>();
    expectedList.add("En yeni değerlendirme");
    expectedList.add("En faydalı değerlendirme");
    expectedList.add("Puana göre azalan");
    expectedList.add("Puana göre artan");

    Assert.assertTrue(actualList.containsAll(expectedList));
    }





}
