package com.alkosto.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListProductsUI {

    public static final Target LIST_PRODUCTS = Target.the("list of products")
            .located(By.xpath("//a[@class='js-algolia-product-click js-algolia-product-title']"));
}
