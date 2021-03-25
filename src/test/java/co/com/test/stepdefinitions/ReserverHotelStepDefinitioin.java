package co.com.test.stepdefinitions;

import co.com.test.questions.ReserverHotel.ReserverHotelQuestion;
import co.com.test.tasks.ReserverHotel.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class ReserverHotelStepDefinitioin {

    @Before
    public void initialConfiguration(){
        setTheStage(new OnlineCast());
    }

    @Given("^that Christian wants to reserver one hotel in the page tiquetesbaratos$")
    public void thatChristianWantsToReserverOneHotelInThePageTiquetesbaratos()  {
        theActorCalled("Christian").wasAbleTo(OpenPage.theMainPage());
    }

    @When("^he insert the data in the website$")
    public void heInsertTheDataInTheWebsite(List<String> data)  {
        theActorInTheSpotlight().attemptsTo(SearchHotel.searchHotel(data));
        theActorInTheSpotlight().attemptsTo(SelectHotel.byFilter());
        theActorInTheSpotlight().attemptsTo(SelectRoom.ofTheHotel());
        theActorInTheSpotlight().attemptsTo(UserInfo.completeTheInformation(data));
    }

    @Then("^He should see successfully messege (.*)$")
    public void heShouldSeeSuccessfullyMessegePagaATiempoYAseguraTuViaje(String text)  {
        //theActorInTheSpotlight().should(seeThat(new ReserverHotelQuestion()));
        theActorInTheSpotlight().should(seeThat(new ReserverHotelQuestion(), equalTo(text)));
     }
}
