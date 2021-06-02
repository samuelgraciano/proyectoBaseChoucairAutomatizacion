package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class academyChoucairStepDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast());}

    @Given("^than (.*) wants to learn automation at the academy Choucair$")
    public void WantsToLearnAutomationAtTheAcademyChoucair(String nombreActor, List<AcademyChoucairData> academyChoucairDataList) {
        OnStage.theActorCalled(nombreActor).wasAbleTo(OpenUp.thePage(),(Login.onthePage(academyChoucairDataList.get(0).getStrUser(),academyChoucairDataList.get(0).getStrPassword())));

    }

    @When("^he search for the course on the choucair academy platform$")
    public void heSearchForTheCourseRecursosTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairDataList) {

        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairDataList.get(0).getStrCourse()));

    }


    @Then("^he finds the course called$")
    public void heFindsTheCourseCalled(List<AcademyChoucairData> academyChoucairDataList) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(academyChoucairDataList.get(0).getStrCourse())));

    }

}
