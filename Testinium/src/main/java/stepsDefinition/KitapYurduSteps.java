package stepsDefinition;

import pageObjectModel.KitapYurduPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class KitapYurduSteps {
    private WebDriver driver;
    KitapYurduPage kitapYurduPage = new KitapYurduPage();

    @Given("^Websitesine gidilir$")
    public void websitesine_gidilir() throws Throwable {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kitapyurdu.com/");


    }

    @Given("^Anasayfanın acildigi kontrol edilir$")
    public void anasayfanın_acildigi_kontrol_edilir() throws Throwable {
        kitapYurduPage.setAnaSayfadaMi();


    }

    @Given("^Urun arama alanına roman yazılır ve klavyeden enter tusuna basilir$")
    public void urun_arama_alanına_roman_yazılır_ve_klavyeden_enter_tusuna_basilir() throws Throwable {
        kitapYurduPage.setRomanYaz();

    }

    @Given("^Listelenen kitaplar arasinda bir kitap secilir$")
    public void listelenen_kitaplar_arasinda_bir_kitap_secilir() throws Throwable {
        kitapYurduPage.setBirKitapSec();

    }

    @Given("^Sepet ekle butonuna basilir$")
    public void sepet_ekle_butonuna_basilir() throws Throwable {
        kitapYurduPage.setSepeteEkle();

    }

    @Given("^Sayfanin sag ust kisminda bulunan sepet ikonundaki deger kontrol edilir$")
    public void sayfanin_sag_ust_kisminda_bulunan_sepet_ikonundaki_deger_kontrol_edilir() throws Throwable {
        kitapYurduPage.setSepetDegerKontrol();
    }

    @Given("^Sepetim butonuna tiklanir$")
    public void sepetim_butonuna_tiklanir() throws Throwable {
        kitapYurduPage.setSepetimButonu();

    }

    @Given("^Sepete git butonuna tiklanir$")
    public void sepete_git_butonuna_tiklanir() throws Throwable {
        kitapYurduPage.setSepeteGit();
    }

    @Given("^Urun miktari bir adet arttirilir$")
    public void urun_miktari_bir_adet_arttirilir() throws Throwable {
        kitapYurduPage.setUrunMiktariBirAdetArttirilir();

    }

    @Given("^Yenile butonuna basilir$")
    public void yenile_butonuna_basilir() throws Throwable {
        kitapYurduPage.setYenileButonu();

    }

    @Given("^Sepetiniz guncelleniyor yazisinin geldigi kontrol edilir$")
    public void sepetiniz_guncelleniyor_yazisinin_geldigi_kontrol_edilir() throws Throwable {
        kitapYurduPage.setGuncelleniyorYazisiniKontrolEt();
    }

    @When("^Carpi butonuna basilir$")
    public void carpi_butonuna_basilir() throws Throwable {
        kitapYurduPage.setCarpiButonu();

    }

    @Then("^Sepetin bos oldugu kontrol edilir$")
    public void sepetin_bos_oldugu_kontrol_edilir() throws Throwable {
        kitapYurduPage.setSepetinBosOlduguKontrolu();

    }
}
