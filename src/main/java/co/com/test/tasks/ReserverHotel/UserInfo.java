package co.com.test.tasks.ReserverHotel;

import co.com.test.userinterface.ReserverHotel.PageUserReservation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;

import java.util.List;


public class UserInfo implements Task {

    private List<String> data;

    public UserInfo(List<String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(1)).into(PageUserReservation.INPUT_NAME),
                Type.theValue(data.get(2)).into(PageUserReservation.INPUT_LAST_NAME), //Type, hace el proceso de Enter mas lento
                Enter.theValue(data.get(3)).into(PageUserReservation.INPUT_EMAIL),
                Enter.theValue(data.get(4)).into(PageUserReservation.INPUT_EMAIL_CONFIRMATION),
                Enter.theValue(data.get(5)).into(PageUserReservation.INPUT_INDICATIVE),
                Enter.theValue(data.get(6)).into(PageUserReservation.INPUT_TELEPHONE),
                Enter.theValue(data.get(7)).into(PageUserReservation.INPUT_CELLPHONE),
                Enter.theValue(data.get(8)).into(PageUserReservation.INPUT_NATIONAL_CARD),
                Click.on(PageUserReservation.CHECKCHECK_ACEPTATION),
                Click.on(PageUserReservation.BTN_CONTINUE)
        );
    }

    public static UserInfo completeTheInformation(List<String> data){
        return Tasks.instrumented(UserInfo.class, data);
    }
}
