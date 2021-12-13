package com.orangehrmlive.demo.cucumber.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import cucumber.api.java.en.And;

public class AddUserPageSteps {
    @And("^I select user role \"([^\"]*)\"$")
    public void iSelectUserRole(String role) throws InterruptedException {
       new AddUserPage().setUserRole(role);
    }

    @And("^I enter employee name \"([^\"]*)\"$")
    public void iEnterEmployeeName(String name)  {
      new AddUserPage().setEmpName(name);
    }

    @And("^I enter my username$")
    public void iEnterMyUsername() {
        new AddUserPage().setUsername();
    }

    @And("^I click on add button$")
    public void iClickOnAddButton() {
        new AddUserPage().clickOnAdd();
    }

    @And("^I select status \"([^\"]*)\"$")
    public void iSelectStatus(String sts)  {
        new AddUserPage().setStatus(sts);
    }

    @And("^I set password \"([^\"]*)\"$")
    public void iSetPassword(String pass) {
        new AddUserPage().setPassword(pass);
    }

    @And("^I set confirm password \"([^\"]*)\"$")
    public void iSetConfirmPassword(String pas) {
        new AddUserPage().setConPassword(pas);
    }

    @And("^I click on save button$")
    public void iClickOnSaveButton() {
        new AddUserPage().setSaveButton();
    }
}
