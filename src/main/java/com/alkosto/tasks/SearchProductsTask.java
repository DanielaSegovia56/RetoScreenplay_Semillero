package com.alkosto.tasks;

import com.alkosto.utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.alkosto.UI.HomeUI.INPUT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchProductsTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_SEARCH),
                Enter.theValue(Data.extractTo().get(0).get("Product")).into(INPUT_SEARCH).thenHit(Keys.ENTER)
        );
    }

    public static SearchProductsTask searchProduct(){
        return instrumented(SearchProductsTask.class);
    }
}
