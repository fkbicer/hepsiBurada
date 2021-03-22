package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HepsiburadaPage {
    public HepsiburadaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@class='desktopOldAutosuggestTheme-input']")
    public WebElement searchbox;

    @FindBy(xpath = "(//div[@class='box product no-hover'])[1]")
    public WebElement ilkIphoneUrunu;

    @FindBy(xpath = "//td[@id='reviewsTabTrigger']")
    public WebElement degerlendirmelerButonu;

    @FindBy(xpath = "(//div[@class='hermes-ReviewCard-module-tAGUS'])[1]")
    public WebElement likeButton;

    @FindBy(xpath = "(//span[@class='hermes-ReviewCard-module-1ZiTv'])[1]")
    public WebElement tesekkurlerYazisi;

    @FindBy(xpath = "//div[@class='hermes-Sort-module-pGjws']")
    public WebElement dropdownBox;

    @FindBy(xpath = "(//div[@class='hermes-Sort-module-vYQvT hermes-Sort-module-2npZQ'])[1]")
    public WebElement enYeniDegerlendirme;

    @FindBy(xpath = "(//div[@class='hermes-Sort-module-vYQvT hermes-Sort-module-2npZQ'])[2]")
    public WebElement enFaydaliDegerlendirme;

    @FindBy(xpath = "(//div[@class='hermes-Sort-module-vYQvT hermes-Sort-module-2npZQ'])[3]")
    public WebElement puanaGoreAzalana;

    @FindBy(xpath = "(//div[@class='hermes-Sort-module-vYQvT hermes-Sort-module-2npZQ'])[4]")
    public WebElement puanaGoreArtan;


}
