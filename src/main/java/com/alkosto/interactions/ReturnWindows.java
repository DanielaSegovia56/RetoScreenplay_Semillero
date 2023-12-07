package com.alkosto.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ReturnWindows implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().navigate().back();
    }
    
    public static Performable backWindow(){
        return instrumented(ReturnWindows.class);
    }
}
