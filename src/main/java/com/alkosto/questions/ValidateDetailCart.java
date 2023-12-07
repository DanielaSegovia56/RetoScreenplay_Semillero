package com.alkosto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.alkosto.UI.DetailCartUI.LBL_PRODUCTS;
import static com.alkosto.UI.DetailCartUI.LBL_PRODUCTS2;

public class ValidateDetailCart implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        String product1 = actor.recall("product1");
        String productOne = LBL_PRODUCTS.resolveFor(actor).getText();

        String product2 = actor.recall("product2");
        String productTwo = LBL_PRODUCTS2.resolveFor(actor).getText();

        return product1.equals(productOne) && product2.equals(productTwo);
    }

    public static Question validateCart(){
        return new ValidateDetailCart();
    }
}
