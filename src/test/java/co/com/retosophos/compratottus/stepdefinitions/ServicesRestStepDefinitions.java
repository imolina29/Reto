package co.com.retosophos.compratottus.stepdefinitions;

import co.com.retosophos.compratottus.models.DataSearch;
import co.com.retosophos.compratottus.models.DataResponse;
import co.com.retosophos.compratottus.tasks.InformationSearch;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;
import org.hamcrest.CoreMatchers;

import java.util.List;

public class ServicesRestStepDefinitions {
    private Actor user;

    @Before
    public void startActor() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the user is on the page$")
    public void theUserIsOnThePage() {
        user = Actor.named("user").whoCan(CallAnApi.at("https://gorest.co.in"));

    }

    @When("^search the user with data$")
    public void searchTheUserWithData(List<DataSearch> dataSearch) {
        user.attemptsTo(InformationSearch.ofServicesRest(dataSearch));
    }

    @When("^the user validates the response with the following data$")
    public void theUserValidatesTheResponseWithTheFollowingData(List<DataResponse> dataResponses) {
        user.should(
                ResponseConsequence.seeThatResponse("Deberia ver la siguiente respuesta: ",
                        response -> response.statusCode(200)
                                .body("result.first_name", CoreMatchers.equalTo(dataResponses.get(0).getName()))
                                .body("result.last_name", CoreMatchers.equalTo(dataResponses.get(0).getLastName()))
                                .body("result.gender", CoreMatchers.equalTo(dataResponses.get(0).getGender()))
                                .body("result.email", CoreMatchers.equalTo(dataResponses.get(0).getEmail()))

                )
        );
    }


}
