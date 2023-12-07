package com.alkosto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.alkosto.UI.HomeBuyUI.BTN_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToCartTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CART)
        );
    }

    public static GoToCartTask GoToCart(){
        return instrumented(GoToCartTask.class);
    }
}
