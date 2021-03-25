package co.com.test.tasks.ReserverHotel;

import co.com.test.userinterface.ReserverHotel.PageHotelDetail;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectRoom implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PageHotelDetail.BTN_RESERVER));
    }

    public static SelectRoom ofTheHotel(){
        return Tasks.instrumented(SelectRoom.class);
    }

}
