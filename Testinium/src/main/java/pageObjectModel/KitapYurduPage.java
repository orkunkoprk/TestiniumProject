package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KitapYurduPage extends AbstractClass {
    WebDriver driver;
public KitapYurduPage(){
    driver = Driver.getDriver();
    PageFactory.initElements(driver,this);
}
@FindBy(xpath = "//img[@title='kitapla buluşmanın en kolay yolu!']")
    private WebElement anaSayfadaMi;
    public void setAnaSayfadaMi() throws InterruptedException {
        clickFunction(anaSayfadaMi);
    }
@FindBy(id = "search-input")
    private WebElement romanYaz;
    public void setRomanYaz() throws InterruptedException {
        sendKeysAndEnterFunction(romanYaz,"roman");

    }
@FindBy(xpath = "//img[@alt='Corto Maltese (Bir Martı Yüzünden)']")
    private WebElement birKitapSec;
    public void setBirKitapSec() throws InterruptedException {
        clickFunction(birKitapSec);
    }
@FindBy(id = "button-cart")
    private WebElement sepeteEkle;
    public void setSepeteEkle() throws InterruptedException {
        clickFunction(sepeteEkle);
    }
@FindBy(css = "span#cart-items")
    private WebElement sepetDegerKontrol;
    public void setSepetDegerKontrol(){
        Assetion(sepetDegerKontrol,"1");
        System.out.println("Sepet degeri kontrol edildi!");

    }
@FindBy(id = "cart-items")
    private WebElement sepetimButonu;
    public void setSepetimButonu() throws InterruptedException {
        clickFunction(sepetimButonu);
    }
@FindBy(id="js-cart")
    private WebElement sepeteGit;
    public void setSepeteGit() throws InterruptedException {
        clickFunction(sepeteGit);
    }
@FindBy(xpath = "//input[@name='quantity']")
    private WebElement urunMiktariBirAdetArttirilir;
    public void setUrunMiktariBirAdetArttirilir() throws InterruptedException {
        sendKeysAndBeforeValueDeleteFunction(urunMiktariBirAdetArttirilir,"2");

    }

@FindBy(css = ".fa.fa-refresh.green-icon")
    private WebElement yenileButonu;
    public void setYenileButonu() throws InterruptedException {
        clickFunction(yenileButonu);
    }
@FindBy(id = "swal2-title")
    private WebElement guncelleniyorYazisiniKontrolEt;
    public void setGuncelleniyorYazisiniKontrolEt(){
        Assetion(guncelleniyorYazisiniKontrolEt,"Sepetiniz güncelleniyor!");
        System.out.println("Sepetin güncellenmesi kontrol edildi!");
    }
@FindBy(xpath = "//i[@title='Kaldır']")
    private WebElement carpiButonu;
    public void setCarpiButonu() throws InterruptedException {
        clickFunction(carpiButonu);
        Thread.sleep(500);
    }
@FindBy(xpath = "//div[text()='Alışveriş sepetiniz boş!']")
    private WebElement sepetinBosOlduguKontrolu;
    public void setSepetinBosOlduguKontrolu() throws InterruptedException {
        clickFunction(sepetimButonu);
        Thread.sleep(500);
        Assetion(sepetinBosOlduguKontrolu,"Alışveriş sepetiniz boş!");
        System.out.println("Alışveris sepetinin bos oldugu kontrol edildi!");

    }



}
