package com.alkosto.UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DetailCartUI {

    public static final Target LBL_PRODUCTS = Target.the("label product")
            .located(By.xpath("(//span[@class='item__name'])[2]"));

    public static final Target LBL_PRODUCTS2 = Target.the("label product")
            .located(By.xpath("(//span[@class='item__name'])[1]"));
}
