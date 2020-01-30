package co.com.retosophos.compratottus.tasks;

import static co.com.retosophos.compratottus.interactions.WaitFor.waitFor;
import static co.com.retosophos.compratottus.userinterface.Tottuspages.*;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchProduct implements Task {

    private static final String GET_NAME_PRODUCT = "(//*[@id='category-products-items']//h5//div)[1]";
    private String nameProduct;

    private SearchProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                waitFor(15),
                Click.on(CANCEL_NOTIFY),
                Enter.theValue(nameProduct).into(SEARCH_PRODUCT),
                Click.on(SEARCH_SUBMIT)
        );

        String getNameProduct = BrowseTheWeb.as(actor).getDriver().findElement(By.xpath(GET_NAME_PRODUCT)).getText();
        actor.remember("nameProduct", getNameProduct);

        actor.attemptsTo(
                Click.on(SELECT_PRODUCT),
                Click.on(ADD_PRODUCT)
        );
    }

    public static SearchProduct searchProduct(String nameProduct) {
        return new SearchProduct(nameProduct);
    }

}
