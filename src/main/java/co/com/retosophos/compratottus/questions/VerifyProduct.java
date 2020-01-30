package co.com.retosophos.compratottus.questions;


import static co.com.retosophos.compratottus.userinterface.Tottuspages.*;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.retosophos.compratottus.interactions.WaitFor.waitFor;

public class VerifyProduct implements Question<Boolean> {

    private static final String GET_NAME_LIST_PRODUCT = "//*[@id='selected-product']/div[1]";

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                waitFor(5),
                Click.on(LIST_PRODUCTS)
        );


        String getNameProductCar = BrowseTheWeb.as(actor).getDriver().findElement(By.xpath(GET_NAME_LIST_PRODUCT)).getText();
        String nameProductoAdded = actor.recall("nameProduct");

        return nameProductoAdded.equals(getNameProductCar);
    }

    public static VerifyProduct verifyProduct() {
        return new VerifyProduct();
    }

}
