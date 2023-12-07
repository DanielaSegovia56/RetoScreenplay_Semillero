package com.alkosto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.alkosto.UI.HomeBuyUI.LNK_CONTINUEBUY;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ContinueBuyTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_CONTINUEBUY)
        );
    }

    public static ContinueBuyTask continueBuy(){
        return instrumented(ContinueBuyTask.class);
    }
}
