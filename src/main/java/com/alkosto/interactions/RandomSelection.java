package com.alkosto.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;
import java.util.Random;

import static com.alkosto.UI.ListProductsUI.LIST_PRODUCTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RandomSelection implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        int i=1;

        while(actor.recall("product"+i) != null){
            i++;
        }

        List<WebElementFacade> listProducts = LIST_PRODUCTS.resolveAllFor(actor);
        Random random = new Random();
        int indexRandom = random.nextInt(listProducts.size());
        actor.remember("product"+i,listProducts.get(indexRandom).getText());
        while (actor.recall("product"+i) == actor.recall("product"+(i-1))){
            indexRandom = random.nextInt(listProducts.size());
            actor.remember("product"+1,listProducts.get(indexRandom).getText());
        }

        actor.attemptsTo(
                Scroll.to(listProducts.get(indexRandom)),
                JavaScriptClick.on(listProducts.get(indexRandom))
        );
    }

    public static Performable selectProduct(){
        return instrumented(RandomSelection.class);
    }
}
