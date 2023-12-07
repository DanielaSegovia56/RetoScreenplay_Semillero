package com.alkosto.tasks;

import com.alkosto.interactions.RandomSelection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.alkosto.UI.HomeBuyUI.BTN_ADDTOCART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                RandomSelection.selectProduct(),
                Click.on(BTN_ADDTOCART)
        );
    }

    public static SelectProductTask selectProduct(){
        return instrumented(SelectProductTask.class);
    }

}
