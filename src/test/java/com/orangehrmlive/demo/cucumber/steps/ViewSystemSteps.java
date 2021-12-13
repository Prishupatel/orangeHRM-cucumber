package com.orangehrmlive.demo.cucumber.steps;

import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import cucumber.api.java.en.And;

public class ViewSystemSteps {
    @And("^I enter name in search field \"([^\"]*)\"$")
    public void iEnterNameInSearchField(String name)  {
      new ViewSystemUsersPage().setUsername(name);
    }

    @And("^I enter status as \"([^\"]*)\"$")
    public void iEnterStatusAs(String sts)  {
     new ViewSystemUsersPage().setStatus(sts);
    }

    @And("^I click to search$")
    public void iClickToSearch() {
        new ViewSystemUsersPage().setSearchBtn();
    }

    @And("^I enter a user name \"([^\"]*)\"$")
    public void iEnterAUserName(String name)  {
        new ViewSystemUsersPage().setUsername(name);
    }

    @And("^I set his role \"([^\"]*)\"$")
    public void iSetHisRole(String rol)  {
        new ViewSystemUsersPage().setUserRoll(rol);
    }

    @And("^I set his status \"([^\"]*)\"$")
    public void iSetHisStatus(String sts)  {
        new ViewSystemUsersPage().setStatus(sts);
    }

    @And("^I marked in check box$")
    public void iMarkedInCheckBox() {
        new ViewSystemUsersPage().setCheckBox();
    }

    @And("^I click on delete button$")
    public void iClickOnDeleteButton() {
        new ViewSystemUsersPage().setDeleteBtn();
    }

    @And("^I click on pop up$")
    public void iClickOnPopUp() {
        new ViewSystemUsersPage().clickOnPopUPOk();
    }

    @And("^I can see no record found$")
    public void iCanSeeNoRecordFound() {
        new ViewSystemUsersPage().verifyNoRecordFound();
    }
}
