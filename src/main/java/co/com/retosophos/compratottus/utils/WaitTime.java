package co.com.retosophos.compratottus.utils;

import org.jruby.util.log.Logger;

import static java.lang.Thread.sleep;

public class WaitTime {


    public static void waitForSomeTime(int seconds) {
        try {
            sleep((seconds * 1000));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
