package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_SetDefinitions {


    @Given("user is on the login page of library application")
    public void user_is_on_the_login_page_of_library_application() {

        System.out.println("User is on the login page of the library application.");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {

        System.out.println("user enters librarian username.");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password.");

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

        System.out.println("user sees the dashboard.");
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println("User enters student username.");
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("User enters student password.");
    }


    @When("user enters admin username")
    public void userEntersAdminUsername() {

        System.out.println("User enters admin username");

    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println( "User enters admin password");
    }
}
