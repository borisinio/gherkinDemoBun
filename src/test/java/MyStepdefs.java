import cucumber.api.java.en.*;

import static org.junit.Assert.assertEquals;


public class MyStepdefs {

    // buttonsGT
    @Given("there is a GT")
    public void thereIsAGT() {

    }

    @When("the user modifies the script from IDE and runs the Pipeline")
    public void theUserModifiesTheScriptFromIDEAndRunsThePipeline() {

    }

    @Then("the buttons should appear in Octane")
    public void theButtonsShouldAppearInOctane() {
        Calcs.equal(6,7);
        String result = "hello";
        assertEquals(result.length(), 50);

    }

    //backgroundGT
    @Given("Background given")
    public void backgroundGiven() {

    }

    @When("Background when")
    public void backgroundWhen() {

    }

    @And("Background and")
    public void backgroundAnd() {
        assertEquals(36, Calcs.sum(33, 3));
    }

    @Then("Background then")
    public void backgroundThen() {


    }

    @Given("<username> is known")
    public void usernameIsKnown() {
    }

    @When("<password> is known")
    public void passwordIsKnown() {
        assertEquals(333, Calcs.sum(90, 90));
    }

    // this is not taken into consideration since the scenario outline has to be written separately, like below

//    @Given("a is known")
//    public void aIsKnown() {
//
//    }
//
//    @When("x is known")
//    public void xIsKnown() {
//        assertEquals(188, Calcs.sum(90, 90));
//    }
//
//    @Given("b is known")
//    public void bIsKnown() {
//
//    }
//
//    @When("y is known")
//    public void yIsKnown() {
//    }
//
//    @Given("c is known")
//    public void cIsKnown() {
//
//    }
//
//    @When("z is known")
//    public void zIsKnown() {
//    }


    @When("the credentials are written")
    public void theCredentialsAreWritten() {

    }

    @And("the Login button is clicked")
    public void theLoginButtonIsClicked() {

    }

    @Then("The login is successful")
    public void theLoginIsSuccessful() {
    }

    @Given("I am logged in as Wilson")
    public void iAmLoggedInAsWilson() {
        assertEquals(18, Calcs.sum(9, 9));

    }

    @When("I try to post to {string}")
    public void iTryToPostTo(String arg0) {
    }

    @Then("I should see {string}.")
    public void iShouldSee(String arg0) {
        assertEquals(6, Calcs.sum(3, 3));
    }

    @Given("there are {int} coffees left in the machine")
    public void thereAreCoffeesLeftInTheMachine(int arg0) {

    }

    @And("I have deposited {int} dollar")
    public void iHaveDepositedDollar(int arg0) {

    }

    @When("I press the coffee button")
    public void iPressTheCoffeeButton() {

    }

    @Then("I should be served a coffee")
    public void iShouldBeServedACoffee() {
        assertEquals(16, Calcs.sum(8, 8));

    }

    @Given("there are {int} cucumbers")
    public void thereAreCucumbers(int arg0) {

    }

    @When("I eat {int} cucumbers")
    public void iEatCucumbers(int arg0) {

    }

    @Then("I should have {int} cucumbers")
    public void iShouldHaveCucumbers(int arg0) {
    }

    // commentsGT
    @Given("the following users exist")
    public void theFollowingUsersExist() {

    }

    @But("Clicking the Create New requirement")
    public void clickingTheCreateNewRequirement() {

    }

    @And("Clicking the Create New defect")
    public void clickingTheCreateNewDefect() {

    }

    @When("Clicking the New Feature")
    public void clickingTheNewFeature() {

    }

    @Then("I should receive an email with")
    public void iShouldReceiveAnEmailWith() {
        assertEquals(7, Calcs.sum(0, 7));
    }

    // fromYanivGT

    @Given("some precondition")
    public void somePrecondition() {
    }

    @And("some other precondition")
    public void someOtherPrecondition() {
    }

    @When("some action by the actor")
    public void someActionByTheActor() {
    }

    @And("some other action")
    public void someOtherAction() {

    }

    @And("yet another action")
    public void yetAnotherAction() {

    }

    @Then("some testable outcome is achieved")
    public void someTestableOutcomeIsAchieved() {
        assertEquals(55, Calcs.sum(50, 5));
    }


    @Given("I am in <module> module focused on a <entity>")
    public void iAmInModuleModuleFocusedOnAEntity() { // this is not taken into consideration since the scenario outline has to be written separately, like below

    }

    @Given("I am in defects module focused on a defect")
    public void iAmInDefectsModuleFocusedOnADefect() {

    }

    @Given("I am in requirements module focused on a requirement")
    public void iAmInRequirementsModuleFocusedOnARequirement() {

    }

    @When("Clicking the Create New <entity> to add a <entity>")
    public void clickingTheCreateNewEntityToAddAEntity() { // this is not taken into consideration since the scenario outline has to be written separately, like below

    }

    @When("Clicking the Create New defect to add a defect")
    public void clickingTheCreateNewDefectToAddADefect() {
//        assertEquals(66, Calcs.sum(6, 6));
    }

    @When("Clicking the Create New requirement to add a requirement")
    public void clickingTheCreateNewRequirementToAddAREquirement() {

    }

    @Then("Feature dialog is open")
    public void featureDialogIsOpen() {
    }


    @Given("there is abalbla")
    public void thereIsAbalbla() {

    }

    @When("the user blabla")
    public void theUserBlabla() {

    }

    @Then("the buttons blabla")
    public void theButtonsBlabla() {
        assertEquals(12, Calcs.sum(6, 6));
    }

    @Given("there is a TEST")
    public void thereIsATEST() {
        assertEquals(14, Calcs.sum(7, 7));

    }

    @When("the user modifies the SCRIPT")
    public void theUserModifiesTheSCRIPT() {

    }

    @Then("the buttons should APPEAR")
    public void theButtonsShouldAPPEAR() {
        assertEquals(14, Calcs.sum(7, 7));
    }

    @Given("First given")
    public void firstGiven() {

    }

    @When("First when")
    public void firstWhen() {

    }

    @Then("First then")
    public void firstThen() {
        assertEquals(16, Calcs.sum(8, 8));

    }

    @Given("Second given")
    public void secondGiven() {

    }

    @When("Second when")
    public void secondWhen() {
        assertEquals(18, Calcs.sum(9, 9));

    }

    @Then("Second then")
    public void secondThen() {
    }

    @Given("Third given")
    public void thirdGiven() {

    }

    @When("Third when")
    public void thirdWhen() {

    }

    @Then("Third then")
    public void thirdThen() {
    }


    @Given("MT is available in Octane")
    public void mtIsAvailableInOctane() {
    }

    @Then("the buttons should appear in Octane BLABLA")
    public void theButtonsShouldAppearInOctaneBLABLA() {
    }

    @Given("there is a LAPTOP")
    public void thereIsALAPTOP() {

    }

    @When("the user modifies LAPTOP")
    public void theUserModifiesLAPTOP() {

    }

    @Then("the LAPTOP is modified")
    public void theLAPTOPIsModified() {
        String result = "laptop";
        assertEquals(result.length(), 60);

    }

    @Given("there is a KEYBOARD")
    public void thereIsAKEYBOARD() {

    }

    @When("the user modifies the KEYBOARD")
    public void theUserModifiesTheKEYBOARD() {

    }

    @Then("the KEYBOARD is modified")
    public void theKEYBOARDIsModified() {
    }

    @Given("OnlineShopping  given")
    public void onlineshoppingGiven() {

    }

    @When("OnlineShopping  when")
    public void onlineshoppingWhen() {

    }

    @Then("OnlineShopping then")
    public void onlineshoppingThen() {
    }


    @io.cucumber.java.en.Given("app is open")
    public void appIsOpen() {
    }

    @io.cucumber.java.en.When("click on settings")
    public void clickOnSettings() {
    }

    @io.cucumber.java.en.Then("navigate to space")
    public void navigateToSpace() {
    }

    @io.cucumber.java.en.Given("user in test tab")
    public void userInTestTab() {
    }

    @io.cucumber.java.en.When("click on test id")
    public void clickOnTestId() {
    }

    @io.cucumber.java.en.Then("tests details should be opened")
    public void testsDetailsShouldBeOpened() {
    }

    @io.cucumber.java.en.Given("one")
    public void one() {
        assertEquals(3,2);
    }

    @io.cucumber.java.en.When("two")
    public void two() {
        assertEquals(2,2);
    }

    @io.cucumber.java.en.Then("three")
    public void three() {
        assertEquals(3,2);
    }

    @io.cucumber.java.en.Given("four")
    public void four() {
        assertEquals(2,2);
    }

    @io.cucumber.java.en.When("five")
    public void five() {
        assertEquals(3,2);
    }

    @io.cucumber.java.en.Then("six")
    public void six() {
        assertEquals(2,2);
    }

    @io.cucumber.java.en.Given("s{int}")
    public void s(int arg0) {
    }

    @io.cucumber.java.en.Given("A")
    public void a() {
    }
    @io.cucumber.java.en.When("B")
    public void b() {
    }
    @io.cucumber.java.en.Then("C")
    public void c() {
    }
    @io.cucumber.java.en.Then("C1")
    public void c1() {
        assertEquals(0,5);
    }

    @io.cucumber.java.en.Given("{int}")
    public void some(int arg0) {
        if ((arg0%2) == 1) {
            assertEquals(3, 3);
        }else if((arg0%3) == 2) {
            assertEquals(2, 2);
        }
        else if(arg0 == 3){
            assertEquals(1,2);
        }
        else if((arg0 % 2) == 0){
            assertEquals(1,1);
        }
    }
}

//    assertEquals(100, Calcs.sum(7, 7));
//    String result = "hello";
//    assertEquals(result.length(), 555);

