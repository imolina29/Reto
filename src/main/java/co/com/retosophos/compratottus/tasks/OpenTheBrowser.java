package co.com.retosophos.compratottus.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task {

    private PageObject page;

    private OpenTheBrowser(PageObject page) {
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
    }

    public static OpenTheBrowser openTheBrowser(PageObject page){
        return new OpenTheBrowser(page);
    }

}
