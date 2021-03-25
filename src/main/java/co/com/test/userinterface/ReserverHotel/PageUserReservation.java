package co.com.test.userinterface.ReserverHotel;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageUserReservation extends PageObject {
    public static final Target INPUT_NAME = Target.the("Write the name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Write the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("write the email").located(By.id("eMail"));
    public static final Target INPUT_EMAIL_CONFIRMATION = Target.the("write again the email").located(By.id("conMail"));
    public static final Target INPUT_INDICATIVE = Target.the("write the indicative").located(By.id("lada"));
    public static final Target INPUT_TELEPHONE = Target.the("write the telephone").located(By.id("phone"));
    public static final Target INPUT_CELLPHONE = Target.the("write the cellphone").located(By.id("mobile"));
    public static final Target INPUT_NATIONAL_CARD = Target.the("write the national card").located(By.id("NationalIdCard"));
    public static final Target CHECKCHECK_ACEPTATION = Target.the("click in checkbbutton aceptation").located(By.id("chkConfirm"));
    public static final Target BTN_CONTINUE = Target.the("click in button continue").located(By.xpath("//a[contains(@class, 'btn btn-success btn-form')]"));
}
