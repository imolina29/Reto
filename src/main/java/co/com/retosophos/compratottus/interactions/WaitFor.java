package co.com.retosophos.compratottus.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static co.com.retosophos.compratottus.utils.WaitTime.waitForSomeTime;

public class WaitFor implements Interaction {

    private int seconds;

    private WaitFor(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        waitForSomeTime(seconds);
    }

    public static WaitFor waitFor(int seconds){
        return new WaitFor(seconds);
    }
}
