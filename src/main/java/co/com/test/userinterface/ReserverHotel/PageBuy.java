package co.com.test.userinterface.ReserverHotel;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageBuy extends PageObject {
    public static final Target LABEL_BUY = Target.the("").located(By.xpath("//h1[contains(@class, 'countdown-title')]"));
}
