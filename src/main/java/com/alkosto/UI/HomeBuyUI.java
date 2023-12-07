package com.alkosto.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeBuyUI {

    public static final Target BTN_ADDTOCART = Target.the("button add to cart")
            .located(By.xpath("//button[@type='button'][contains(.,'Agregar al carrito')]"));

    public static final Target LNK_CONTINUEBUY = Target.the("link continue buy")
            .located(By.xpath("//a[contains(@class,'continue-shopping-button__link js-sf-keep-shopping')]"));

    public static final Target BTN_CART = Target.the("cart")
            .located(By.xpath("//a[@href='/cart'][contains(.,'Ir al carrito y pagar')]"));
}
