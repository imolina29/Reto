package co.com.retosophos.compratottus.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.tottus.com.pe/tottus/")
public class Tottuspages extends PageObject {

    public static final Target CANCEL_NOTIFY = Target.the(
            "Cancel notify").located(By.id("onesignal-popover-cancel-button"));

    public static final Target SEARCH_PRODUCT = Target.the(
            "Search Product").located(By.id("atg_store_searchInput_top"));

    public static final Target SEARCH_SUBMIT = Target.the(
            "Search Product").located(By.id("atg_store_searchSubmit_top"));

    public static final Target SELECT_PRODUCT = Target.the(
            "Add Product").locatedBy("(//*[@id='category-products-items']//img[@class='media-object'])[1]");

    public static final Target ADD_PRODUCT = Target.the(
            "Add Product").locatedBy("//*[@class='atg_behavior_addItemToCart btn-add-cart']");

    public static final Target LIST_PRODUCTS = Target.the(
            "List product added").locatedBy("//*[@id='atg_store_richCartTarget']");




}
