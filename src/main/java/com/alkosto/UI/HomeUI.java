package com.alkosto.UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final Target INPUT_SEARCH = Target.the("input search products").
            located(By.id("js-site-search-input"));

}
