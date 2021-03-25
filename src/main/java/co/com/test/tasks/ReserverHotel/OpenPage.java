package co.com.test.tasks.ReserverHotel;

import co.com.test.userinterface.ReserverHotel.PageHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage implements Task {

    private PageHome pageHome;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pageHome));
    }

    public static OpenPage theMainPage(){
        return Tasks.instrumented(OpenPage.class);
    }

}
