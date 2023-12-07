package com.alkosto.tasks;

import com.alkosto.interactions.ReturnWindows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ReturnTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ReturnWindows.backWindow()
        );
    }

    public static ReturnTask back(){
        return instrumented(ReturnTask.class);
    }
}
