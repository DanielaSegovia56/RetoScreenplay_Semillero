package com.alkosto.stepDefinitions;

import com.alkosto.questions.ValidateDetailCart;
import com.alkosto.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AddTwoProductsStepDefinitions {

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }

    @Given("the user open the page of Alkosto and search the produts")
    public void theUserOpenThePageOfAlkostoAndSearchTheProduts() {
        theActorCalled("User").wasAbleTo(
                OpenBrowserTask.openBrowser()
        );
    }

    @When("the user select two products and add to cart")
    public void theUserSelectTwoProductsAndAddToCart() {
        theActorInTheSpotlight().attemptsTo(
                SearchProductsTask.searchProduct(),
                SelectProductTask.selectProduct(),
                ContinueBuyTask.continueBuy(),
                ReturnTask.back(),
                SelectProductTask.selectProduct(),
                GoToCartTask.GoToCart()
        );
    }

    @Then("the user can view the two products added")
    public void theUserCanViewTheTwoProductsAdded() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidateDetailCart.validateCart(),
                        Matchers.equalTo(true)
                )
        );

    }
}
