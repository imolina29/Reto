package co.com.retosophos.compratottus.tasks;

import co.com.retosophos.compratottus.models.DataSearch;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import java.util.List;

public class InformationSearch implements Task {

    private DataSearch dataSearch;

    private InformationSearch(List<DataSearch> dataSearch) {
        this.dataSearch = dataSearch.get(0);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Get.resource("/public-api/users/363?access-token=Rsw6sMq63KLUyEf7dd1htiZJe3nOvB5C_XHx&first_name={first_name}&last_name={last_name}")
                        .with(request -> request.pathParams(
                                "first_name",
                                dataSearch.getName(), "last_name", dataSearch.getLastName())));

        System.out.println(SerenityRest.lastResponse().jsonPath().get().toString());
    }

    public static InformationSearch ofServicesRest(List<DataSearch> dataSearch) {
        return new InformationSearch(dataSearch);
    }
}
